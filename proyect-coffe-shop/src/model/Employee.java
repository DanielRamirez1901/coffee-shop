package model;

public class Employee {
	private String name;
	private String lastName;
	private String id;
	private String userName;
	private String password;
	private boolean state;
	

	public Employee(String name, String lastName, String id, String userName, String password, boolean state) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
