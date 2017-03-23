package Day5;

class ExecutePersonPrivate {
	private String name;
	private int age;
	void PersonPrivate() {}; //디폴트 성자 메소드
	void printPerson() {
		System.out.println("나의 이름은"+name);
		System.out.println("나는 " + age + "살이다.");
	}
	
	public static void main(String[] args) {
		ExecutePersonPrivate p = new ExecutePersonPrivate();
			p.name = "임꺽정";
			p.age = 41;
			p.printPerson();
	}
}
