package Day5;

import java.util.Scanner;

public class AddressInput {
	public Address inputFunction(Address address) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�");
		String strName = scanner.nextLine();
		System.out.print("��ȭ��ȣ");
		String strTel = scanner.nextLine();
		System.out.print("�ּ�");
		String strAddr = scanner.nextLine();
		System.out.print("���α׷����");
		String strLan = scanner.nextLine();
		
		return address = new Address
				(strName, strTel, strAddr, strLan);
	}
}
