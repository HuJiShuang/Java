package decorator;
/**
 * 抽象构件角色
 * @author hjs
 *
 */
public interface ICar {

	void move();
}
//具体构件角色或者被装饰对象
class Car implements ICar{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("陆地上跑");
	}
}
//Decorator装饰角色
class SuperCar implements ICar{
	//装饰类包含真实构件的引用
	protected ICar car;
	public SuperCar(ICar car) {
		// TODO Auto-generated constructor stub
		this.car = car;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		//此处调用Car.move()方法
		car.move();
	}
}
//具体装饰对象
class FlySuperCar extends SuperCar{

	public FlySuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
}
//具体装饰对象
class SwimSuperCar extends SuperCar{

	public SwimSuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println("水上游！");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}
//具体装饰对象
class AiSuperCar extends SuperCar{

	public AiSuperCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void autoMove() {
		System.out.println("自动跑");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
}
