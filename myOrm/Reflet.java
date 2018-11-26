package myOrm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;





/**
 * ʹ�÷����ȡע�����Ϣ��ģ�⴦��ע����Ϣ������
 * @author hjs
 *
 */
public class Reflet {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			Class clazz = Class.forName("myOrm.Student");
			//����������ע��
			Annotation [] annotations = clazz.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			//�������ƻ��ע��
			TableAnnotation tableAnnotation = (TableAnnotation) clazz.getAnnotation(TableAnnotation.class);
			System.out.println(tableAnnotation.value());
			//����������ע��
			 Field field = clazz.getDeclaredField("studentName");
			 FieldAnnotation fieldAnnotation = field.getAnnotation(FieldAnnotation.class);
			 System.out.println(fieldAnnotation.columnName()+"--"+fieldAnnotation.type()+"--"+fieldAnnotation.length());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
