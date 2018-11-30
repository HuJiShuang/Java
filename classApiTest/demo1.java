package classApiTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ͨ������õ�Class����̶���ȡ�����ԡ�������������
 * @author hjs
 *
 */
public class demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String path = "classApiTest.User";
		Class<User> class1 = (Class<User>) Class.forName(path);
		//��ȡȫ������
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		//��ȡ������
		Constructor<?>[] constructors = class1.getDeclaredConstructors();
		for (Constructor<?> constructor2 : constructors) {
			System.out.println(constructor2);
			
		}
		//��ȡ����
		Method[] methods = class1.getMethods();
		for (Method method2 : methods) {
			System.out.println(method2);
		}
		
	}
}
