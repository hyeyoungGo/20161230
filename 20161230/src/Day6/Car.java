package Day6;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	public Car() {

	}
	
	public Car(String company) {
		this.company = company;
	}
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}

