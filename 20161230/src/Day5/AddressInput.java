package Day5;

import java.util.Scanner;

public class AddressInput {
	public Address inputFunction(Address address) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름");
		String strName = scanner.nextLine();
		System.out.print("전화번호");
		String strTel = scanner.nextLine();
		System.out.print("주소");
		String strAddr = scanner.nextLine();
		System.out.print("프로그램언어");
		String strLan = scanner.nextLine();
		
		return address = new Address
				(strName, strTel, strAddr, strLan);
	}
}
