package Day6;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.company = "�����ڵ���";
		car.model = "s1";
		car.color = "�Ͼ��";
		car.maxSpeed = 200;
		
		Car car2 = new Car("����ڵ���", "s2", "�Ķ���", 2000);
		carPrint(car2);
		
		Car car3 = new Car("��Ʈ�ڵ���");
		carPrint(car3);
		
		Car car4 = new Car("��Ʈ�ڵ���", "s3");
		carPrint(car4);
		
		Car car5 = new Car("��Ʈ�ڵ���", "s4", "�����");	
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

