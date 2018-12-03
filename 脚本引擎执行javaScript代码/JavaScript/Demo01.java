package JavaScript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试脚本引擎执行JavaScript代码
 * @author hjs
 *
 */
public class Demo01 {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {
		
		//1.获得脚本引擎对象
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("javascript");
		
		//2.定义变量存储到引擎上下文
		engine.put("message", "大家好");
		String string = "var user = {name:'胡吉双' ,age:23, address:'吉林省' };";
		string += "print(user.name);";
		
		//3.执行脚本
		engine.eval(string);
		engine.eval("message = 'hello world'");
		System.out.println(engine.get("message"));
		
		//4.定义函数
		engine.eval("function add(a,b){var sum = a+b; return sum}");
		//执行js函数，在这里engine同时实现了Invocable接口和
		//取得调用接口
		Invocable invocable = (Invocable) engine;
		//执行脚本中定义的方法
		Object result =  invocable.invokeFunction("add",new Object[] {13,20});
		System.out.println(result);
		
		//导入其他的Java包，使用其java类
		String jsCode = "var list = java.util.Arrays.asList([\"北京你好\" ,\"长春你好\" ,\"德惠你好\"]);";
		engine.eval(jsCode);
		List<String> list =(List<String>)engine.get("list");
		for (String string2 : list) {
			System.out.println(string2);
		}
		//执行一个js文件，将文件放在src下即可
		URL resource = Demo01.class.getClassLoader().getResource("simple.js");
		FileReader fileReader = new FileReader(resource.getPath());
		engine.eval(fileReader);
		fileReader.close();
		
	}
}
