package Day5;
public class Address {
	String strName;
	String strTel;
	String strAddr;
	String strLan;
	public Address() {
		this.strName = "";
		this.strTel = "";
		this.strAddr = "";
		this.strLan = "";
	}
	public Address(String strName) {
		this.strName = strName; 
	}
	public Address(String strName, String strTel) {
		this(strName);
		this.strTel = strTel; 
	}
	public Address(String strName, 
			                             String strTel, String strAddr) {
		this(strName, strTel);
		this.strAddr = strAddr; 
	}
	public Address(String strName, String strTel, 
			                            String strAddr, String strLan) {
		this(strName, strTel, strAddr);
		this.strLan = strLan; 
	}
}