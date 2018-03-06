package tribal_library;

public class Client extends User{
	private String name;
	private String address;
	private String phoneNo;
	
	Client(){
	}
	
	Client(String name, String address, String phoneNo){
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
	
}
