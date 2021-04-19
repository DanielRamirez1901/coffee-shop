package model;

import java.io.Serializable;

/**
*This class allows the creation of a employee<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class Employee implements Serializable{
	public final static long serialVersion = 1;
	//Attributes
	private String name;//This attribute contains the employee name
	private String lastName;//This attribute contains the employee last name
	private String id;//This attribute contains the employee id
	private String userName;//This attribute contains the system user name
	private String password;//This attribute contains the system user password
	private Boolean state;//This attribute contains the employee state
	
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
	*@param state Is a Boolean with the employee state<br>
	*/	
	public Employee(String name, String lastName, String id,Boolean state) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}//End Employee construct
        
//**********************************************************************************************************************************

	/**
	*Employee class construct method(system user)<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	*@param userName Is a String with the system user name<br>
	*@param password Is a String with the employee password<br>
	*/	
	public Employee(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

        
//**************************************Setters & Getters*****************************************************************
  
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

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

//**********************************************************************************************************************************

	/**
	 *toString class method<br>
	 *<b>pre:</b><br>
	 *<b>post:</b>Show basic information of a employee<br>
	 * @return A string that have information of a employee<br>
	 */
	public String toString(){

		return "\n\t* INFRMACION DE EMPLEADO:"
				+ "\n *Nombre: "+name
				+ "\n *Apellidos: "+lastName
				+ "\n *N° de identificacion:"+id
				+ "\n *Nombre de usuario: "+userName
				+ "\n  ";      

	}//End toString
}//End Employee class
