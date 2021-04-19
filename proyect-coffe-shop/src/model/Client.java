package model;

import java.io.Serializable;

/**
*This class allows the creation of a client<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/

public class Client implements Serializable{
	public final static long serialVersion = 1;
	//Attributes
	private String name;//This attribute contains the client name
	private String lastName;//This attribute contains the client last name
	private String id;//This attribute contains the client id
	private String direction;//This attribute contains the client direction
	private String phone;//This attribute contains the client phone
	private String fieldOfObservations;//This attribute contains the client observations
	//Relations
	private Order order;//Relation with the order class. Contain the client order

//*******************************************************************************************************************************************
	/**
	*Client class construct method<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	
	*@param name Is a String with the client name<br>
	*@param lastName Is a String with the client last name<br>
	*@param id Is a String with the client id<br>
	*@param direction Is a String with the client direction<br>
	*@param phone Is a String with the client phone<br>
	*@param fieldOfObservations Is a String with the client field of observations<br>
	*@param order Is a Order with the client order<br>
	*/	
	public Client(String name, String lastName, String id, String direction, String phone, String fieldOfObservations,Order order) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.direction = direction;
		this.phone = phone;
		this.fieldOfObservations = fieldOfObservations;
		this.order = order;
	}//End Client constructor
	
	/**
	*Client class construct method without parameters<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>

	*/	
	public Client(String name, String lastName, String id, String direction, String phone, String fieldOfObservations) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.direction = direction;
		this.phone = phone;
		this.fieldOfObservations = fieldOfObservations;
	}//End client method
//***********************************Setters & Getters**********************************************************************************

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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFieldOfObservations() {
		return fieldOfObservations;
	}
	public void setFieldOfObservations(String fieldOfObservations) {
		this.fieldOfObservations = fieldOfObservations;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	*toString class method<br>
	*<b>pre:</b><br>
	*<b>post:</b>Show basic information of a employee<br>
        * @return A string that have information of a employee<br>
	*/
        public String toString(){
            
            return "\n\t* INFRMACION DE CLIENTE:"
                    + "\n *Nombre: "+name
                    + "\n *Apellidos: "+lastName
                    + "\n *N° de identificacion:"+id
                    + "\n *Direccion: "+direction
                    + "\n *Telefono: "+phone
                    + "\n *Ovservaciones"+fieldOfObservations
                    + "\n *Pedido: "+order
                    + "\n  ";      
                    
        }//End toString
        
}//End Client class
