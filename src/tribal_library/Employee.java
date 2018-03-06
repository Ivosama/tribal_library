package tribal_library;

public class Employee extends User {
	private String name;
	private String type;
	
	Employee (){
		super();
	}
	
	Employee(String name, String type){ // Default constructor
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
