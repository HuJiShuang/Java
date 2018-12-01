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
 *  ��ϰ��̬����Ͷ�̬����
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//��ö�̬������
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//ͨ��ִ��run������ʵ�ֶ�̬����
		int  result = compiler.run(null, null, null, "F:/LocalRepository/DynamicCompile/HelloWorld.java");
		System.out.println(result==0?"����ɹ�":"����ʧ��");
		
		//��̬����
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("java -cp F:/LocalRepository/DynamicCompile HelloWorld");
		
		//ʹ��IO����ִ�н�����뵽��������
		InputStream inputStream  = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String info = "";
		while ((info =reader.readLine())!=null) {
				System.out.println(info);
		}
		
		//����ʹ�÷�������̬���б���õ���
		String dir = "F:/LocalRepository/DynamicCompile/";
		URL[] urls = new URL[] {new URL("file:/"+ dir)};
		URLClassLoader urlClassLoader = new URLClassLoader(urls);
		Class c = urlClassLoader.loadClass("HelloWorld");
		try {
			//���ü������main����,����main�����Ǿ�̬����������invoke()�����ĵ�һ����������Ϊ��
			Method method = c.getMethod("main", String[].class);
			//�ڶ�������Ϊ�ɱ����,�������Objectǿת�Ļ����������ת��Ϊ������������main������ƥ��
			method.invoke(c, (Object)new String[] {});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
