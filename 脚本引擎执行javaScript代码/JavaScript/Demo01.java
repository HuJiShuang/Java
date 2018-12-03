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
 * ���Խű�����ִ��JavaScript����
 * @author hjs
 *
 */
public class Demo01 {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {
		
		//1.��ýű��������
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("javascript");
		
		//2.��������洢������������
		engine.put("message", "��Һ�");
		String string = "var user = {name:'����˫' ,age:23, address:'����ʡ' };";
		string += "print(user.name);";
		
		//3.ִ�нű�
		engine.eval(string);
		engine.eval("message = 'hello world'");
		System.out.println(engine.get("message"));
		
		//4.���庯��
		engine.eval("function add(a,b){var sum = a+b; return sum}");
		//ִ��js������������engineͬʱʵ����Invocable�ӿں�
		//ȡ�õ��ýӿ�
		Invocable invocable = (Invocable) engine;
		//ִ�нű��ж���ķ���
		Object result =  invocable.invokeFunction("add",new Object[] {13,20});
		System.out.println(result);
		
		//����������Java����ʹ����java��
		String jsCode = "var list = java.util.Arrays.asList([\"�������\" ,\"�������\" ,\"�»����\"]);";
		engine.eval(jsCode);
		List<String> list =(List<String>)engine.get("list");
		for (String string2 : list) {
			System.out.println(string2);
		}
		//ִ��һ��js�ļ������ļ�����src�¼���
		URL resource = Demo01.class.getClassLoader().getResource("simple.js");
		FileReader fileReader = new FileReader(resource.getPath());
		engine.eval(fileReader);
		fileReader.close();
		
	}
}
