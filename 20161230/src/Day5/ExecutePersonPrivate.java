package Day5;

class ExecutePersonPrivate {
	private String name;
	private int age;
	void PersonPrivate() {}; //����Ʈ ���� �޼ҵ�
	void printPerson() {
		System.out.println("���� �̸���"+name);
		System.out.println("���� " + age + "���̴�.");
	}
	
	public static void main(String[] args) {
		ExecutePersonPrivate p = new ExecutePersonPrivate();
			p.name = "�Ӳ���";
			p.age = 41;
			p.printPerson();
	}
}
