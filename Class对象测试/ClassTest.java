package classTest;

public class ClassTest {
	
	public static void main(String[] args) {
		String path = "classTest.User";
		try {
			//1.��һ�ֻ�ȡClass����ķ�����forName�Ĳ����������ַ���
			//Class class1 = Class.forName(path);
			//System.out.println(class1);
			//2.�ڶ��ֻ�ȡClass����ķ���
			//Class<?> class2 = path.getClass();
			//System.out.println(class2);
			//3.�����ֻ�ȡClass����ķ���
			Class<?> class3 = String.class;
			System.out.println(class3);
			Class<?> class4 = Void.class;
			System.out.println(class4);
			//
			int[] arr01 = new int[10];
			int[] arr02 = new int[30];
			//����Ҳ�Ƕ�Ӧһ��Class��������������ͺ�ά�Ⱦ��������볤���޹�
			System.out.println(arr01.getClass()==arr02.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
