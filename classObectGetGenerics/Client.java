package classObectGetGenerics;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;


public class Client {
	
	public void test01(Map<String, User> map,List<User> list) {
		System.out.println("Client test01");
	}
	public Map<Integer, User> test02(){
		System.out.println("Client test02");
		return null;
	}
	public static void main(String[] args) {
		try {
			//1.��ͨ�������ȡ������
			Method method = Client.class.getMethod("test01", Map.class,List.class);
			//2.��ȡ���������͵�������
			Type[] types1 = method.getGenericParameterTypes();
			for (Type type1 : types1) {
				System.out.println(type1);
				if (type1 instanceof ParameterizedType) {
					//��ȡ����������
					Type[] types2 = ((ParameterizedType)type1).getActualTypeArguments();
					for (Type type2 : types2) {
						System.out.println("������������"+type2);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Method method = Client.class.getMethod("test02", null);
			//��ȡ������ֵ����
			Type type = method.getGenericReturnType();
			if(type instanceof ParameterizedType) {
				//��ȡ����������
				Type[] type2 = ((ParameterizedType)type).getActualTypeArguments();
				for (Type type3 : type2) {
					System.out.println("����ֵ��������"+type3);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
