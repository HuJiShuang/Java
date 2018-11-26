package myOrm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;





/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * @author hjs
 *
 */
public class Reflet {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			Class clazz = Class.forName("myOrm.Student");
			//获得类的所有注解
			Annotation [] annotations = clazz.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			//根据名称获得注解
			TableAnnotation tableAnnotation = (TableAnnotation) clazz.getAnnotation(TableAnnotation.class);
			System.out.println(tableAnnotation.value());
			//获得类的属性注解
			 Field field = clazz.getDeclaredField("studentName");
			 FieldAnnotation fieldAnnotation = field.getAnnotation(FieldAnnotation.class);
			 System.out.println(fieldAnnotation.columnName()+"--"+fieldAnnotation.type()+"--"+fieldAnnotation.length());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
