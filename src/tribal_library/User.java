package tribal_library;

public class User {
	private int id;
	private String password;
	private String userName;
	
	User(){
		
	}
	
	User(int id, String password, String userName){
		this.id = id;
		this.password = password;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}
	
}
