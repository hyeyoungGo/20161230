package Day6;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.company = "르노자동차";
		car.model = "s1";
		car.color = "하얀색";
		car.maxSpeed = 200;
		
		Car car2 = new Car("대우자동차", "s2", "파란색", 2000);
		carPrint(car2);
		
		Car car3 = new Car("비트자동차");
		carPrint(car3);
		
		Car car4 = new Car("비트자동차", "s3");
		carPrint(car4);
		
		Car car5 = new Car("비트자동차", "s4", "노란색");	
		//carPrint(car1);
		CarPrint carPrint = new CarPrint();
		carPrint.printShow(car5);
	}
	private static void carPrint(Car car1) {
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
	}
	
}

