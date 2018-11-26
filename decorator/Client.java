package decorator;

/**
 * 测试装饰模式
 * @author hjs
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("增加新的功能，飞行---------");
		SuperCar flySuperCar = new FlySuperCar(car);
		flySuperCar.move();
		System.out.println("增加水里游------");
		SuperCar swimSuper = new SwimSuperCar(car);
		swimSuper.move();
		//当参数传递为flySuperCar时完成复合功能,
		System.out.println("增加两个新的功能，天上飞，水里游------");
		SuperCar twoMix = new FlySuperCar(new SwimSuperCar(car));
		twoMix.move();
	}
}
