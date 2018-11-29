package classTest;

public class ClassTest {
	
	public static void main(String[] args) {
		String path = "classTest.User";
		try {
			//1.第一种获取Class对象的方法，forName的参数必须是字符串
			//Class class1 = Class.forName(path);
			//System.out.println(class1);
			//2.第二种获取Class对象的方法
			//Class<?> class2 = path.getClass();
			//System.out.println(class2);
			//3.第三种获取Class对象的方法
			Class<?> class3 = String.class;
			System.out.println(class3);
			Class<?> class4 = Void.class;
			System.out.println(class4);
			//
			int[] arr01 = new int[10];
			int[] arr02 = new int[30];
			//数组也是对应一个Class对象，由数组的类型和维度决定，而与长度无关
			System.out.println(arr01.getClass()==arr02.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
