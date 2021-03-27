package model;

public class Client {
	private String name;
	private String lastName;
	private String id;
	private String direction;
	private String phone;
	private String fieldOfObservations;
	private Order order;
	
	
	public Client(String name, String lastName, String id, String direction, String phone, String fieldOfObservations,Order order) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.direction = direction;
		this.phone = phone;
		this.fieldOfObservations = fieldOfObservations;
		this.order = order;
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
	
	
}
