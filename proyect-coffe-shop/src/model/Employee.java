package model;
/**
*This class allows the creation of a employee<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class Employee {
	
	//Attributes
	private String name;////This attribute contains the employee name
	private String lastName;//This attribute contains the employee last name
	private String id;//This attribute contains the employee id
	private String userName;//This attribute contains the system user name
	private String password;//This attribute contains the system user password
	private boolean state;//This attribute contains the employee state
	
//**********************************************************************************************************************************
	
	/**
	*Employee class construct method<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	
	*@param name Is a String with the employee name<br>
	*@param lastName Is a String with the employee last name<br>
	*@param id Is a String with the employee id<br>
	*@param userName Is a String with the system user name<br>
	*@param password Is a String with the employee password<br>
	*@param state Is a boolean with the employee state<br>
	*/	
	public Employee(String name, String lastName, String id, String userName, String password, boolean state) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.state = state;
	}//End Employee construct

//**************************************Setters & Getters*****************************************************************

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
}//End Employee class
