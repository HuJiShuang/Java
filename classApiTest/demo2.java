package classApiTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo2 {
	public static void main(String[] args) {
		
		String path = "classApiTest.User";
		try {
			//1.获取反射对象
			Class<User> class1 = (Class<User>) Class.forName(path);
			//当构造方法的访问权限是public时，可以使用下面方法实例化一个User对象
			//User user1 = class1.newInstance();
			//System.out.println(user1.hashCode());
			Constructor<?> constructor = class1.getDeclaredConstructor();
			//Field,Method,Constructor等都以AccessibleObject为基类，setAccessible用于设置是否忽略访问权限
			constructor.setAccessible(true);
			//即使当构造方法是私有的时候也可以构造出函数，所以该方法可用于破解单例模式
			User user2 = (User) constructor.newInstance();
			System.out.println(user2.hashCode());
			//通过反射API调用普通方法
			Method method = class1.getDeclaredMethod("setName", String.class);
			method.invoke(user2, "胡吉双");  //相当于实现了user2.setName("胡吉双")
			System.out.println(user2.getName());
			//通过反射API操作属性
			Field field = class1.getDeclaredField("age");
			field.setAccessible(true);
			field.set(user2, 23);
			System.out.println(user2.getAge());
			System.out.println(field.get(user2));

		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
