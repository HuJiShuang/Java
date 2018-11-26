package decorator;

/**
 * ����װ��ģʽ
 * @author hjs
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("�����µĹ��ܣ�����---------");
		SuperCar flySuperCar = new FlySuperCar(car);
		flySuperCar.move();
		System.out.println("����ˮ����------");
		SuperCar swimSuper = new SwimSuperCar(car);
		swimSuper.move();
		//����������ΪflySuperCarʱ��ɸ��Ϲ���,
		System.out.println("���������µĹ��ܣ����Ϸɣ�ˮ����------");
		SuperCar twoMix = new FlySuperCar(new SwimSuperCar(car));
		twoMix.move();
	}
}
