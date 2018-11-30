package classApiTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo2 {
	public static void main(String[] args) {
		
		String path = "classApiTest.User";
		try {
			//1.��ȡ�������
			Class<User> class1 = (Class<User>) Class.forName(path);
			//�����췽���ķ���Ȩ����publicʱ������ʹ�����淽��ʵ����һ��User����
			//User user1 = class1.newInstance();
			//System.out.println(user1.hashCode());
			Constructor<?> constructor = class1.getDeclaredConstructor();
			//Field,Method,Constructor�ȶ���AccessibleObjectΪ���࣬setAccessible���������Ƿ���Է���Ȩ��
			constructor.setAccessible(true);
			//��ʹ�����췽����˽�е�ʱ��Ҳ���Թ�������������Ը÷����������ƽⵥ��ģʽ
			User user2 = (User) constructor.newInstance();
			System.out.println(user2.hashCode());
			//ͨ������API������ͨ����
			Method method = class1.getDeclaredMethod("setName", String.class);
			method.invoke(user2, "����˫");  //�൱��ʵ����user2.setName("����˫")
			System.out.println(user2.getName());
			//ͨ������API��������
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
