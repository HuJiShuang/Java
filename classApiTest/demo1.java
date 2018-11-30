package classApiTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射得到Class对象继而获取到属性、构造器、方法
 * @author hjs
 *
 */
public class demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String path = "classApiTest.User";
		Class<User> class1 = (Class<User>) Class.forName(path);
		//获取全部属性
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		//获取构造器
		Constructor<?>[] constructors = class1.getDeclaredConstructors();
		for (Constructor<?> constructor2 : constructors) {
			System.out.println(constructor2);
			
		}
		//获取方法
		Method[] methods = class1.getMethods();
		for (Method method2 : methods) {
			System.out.println(method2);
		}
		
	}
}
