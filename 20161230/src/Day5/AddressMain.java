package Day5;

public class AddressMain {
	public static void main(String[] args) {
		Address address = null;
		AddressInput addressInput = new AddressInput();
		address = addressInput.inputFunction(address);
		AddressPrint addressPrint = new AddressPrint();
		addressPrint.printFunction(address);
	}
}
