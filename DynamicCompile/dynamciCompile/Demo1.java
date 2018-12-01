package dynamciCompile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 *  练习动态编译和动态运行
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获得动态编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//通过执行run方法来实现动态编译
		int  result = compiler.run(null, null, null, "F:/LocalRepository/DynamicCompile/HelloWorld.java");
		System.out.println(result==0?"编译成功":"编译失败");
		
		//动态运行
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("java -cp F:/LocalRepository/DynamicCompile HelloWorld");
		
		//使用IO流将执行结果输入到程序中来
		InputStream inputStream  = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String info = "";
		while ((info =reader.readLine())!=null) {
				System.out.println(info);
		}
		
		//尝试使用反射来动态运行编译好的类
		String dir = "F:/LocalRepository/DynamicCompile/";
		URL[] urls = new URL[] {new URL("file:/"+ dir)};
		URLClassLoader urlClassLoader = new URLClassLoader(urls);
		Class c = urlClassLoader.loadClass("HelloWorld");
		try {
			//调用加载类的main方法,由于main方法是静态方法，所以invoke()方法的第一个参数可以为空
			Method method = c.getMethod("main", String[].class);
			//第二个参数为可变参数,如果不加Object强转的话，会把数组转换为两个参数，与main方法不匹配
			method.invoke(c, (Object)new String[] {});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
