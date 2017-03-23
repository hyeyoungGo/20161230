package Day8;

import java.util.Scanner;

public class Address implements InputOutput{
	public String name;
	public String tel;
	public String adds;
	
	public Address() {
		this.name = "";
		this.tel = "";
		this.adds = "";
	}
	
	public String setName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public String setTel() {
		return tel;
	}
	
	public void getTel(String tel) {
		this.tel = tel;
	}
	
	public String setAddress() {
		return adds;
	}
	
	public void getAddress(String adds) {
		this.adds = adds;		
	}
	
	public Address(String name, String tel, String adds) {
		this.name = name;
		this.tel = tel;
		this.adds = adds;
	}

	public void InputFunction() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		this.name = scanner.nextLine();
		
		System.out.println("전화번호 : ");
		this.tel = scanner.nextLine();
		
		System.out.println("주소 : ");
		this.adds = scanner.nextLine();
		
	}

	
	public void OutputFunction() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.tel);
		System.out.println("주소 : " + this.adds);	
		
	}

}
