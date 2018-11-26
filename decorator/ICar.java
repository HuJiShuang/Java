package decorator;
/**
 * ���󹹼���ɫ
 * @author hjs
 *
 */
public interface ICar {

	void move();
}
//���幹����ɫ���߱�װ�ζ���
class Car implements ICar{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("½������");
	}
}
//Decoratorװ�ν�ɫ
class SuperCar implements ICar{
	//װ���������ʵ����������
	protected ICar car;
	public SuperCar(ICar car) {
		// TODO Auto-generated constructor stub
		this.car = car;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		//�˴�����Car.move()����
		car.move();
	}
}
//����װ�ζ���
class FlySuperCar extends SuperCar{

	public FlySuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("���Ϸ�");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
}
//����װ�ζ���
class SwimSuperCar extends SuperCar{

	public SwimSuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println("ˮ���Σ�");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}
//����װ�ζ���
class AiSuperCar extends SuperCar{

	public AiSuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void autoMove() {
		System.out.println("�Զ���");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
}
