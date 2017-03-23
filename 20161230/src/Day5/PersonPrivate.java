package Day5;

class PersonPrivate {
	private String name;
	private int age;
	PersonPrivate() {}; //디폴트 성자 메소드
	void printPerson() {
		System.out.println("나의 이름은"+name);
		System.out.println("나는 " + age + "살이다.");
	}

}
