package model;
import java.util.ArrayList;
import java.util.UUID;

public class Order {
	//Constants
	public static final int REQUESTED = 1;
	public static final int PROCESS = 2;
	public static final int SENT = 3;
	public static final int DELIVERED = 4;
	public static final int CANCELLED = 5;
	
	
	//Attributes
	private String orderCode;
	private int state;
	private String observations;
	
	//Relations
	private ArrayList <Product> products;
	
	
	public Order( int state, String observations, ArrayList<Product> products) {
		orderCode = generateOrderCode();
		this.state = state;
		this.observations = observations;
		this.products = products;
	}
	public Order() {
		orderCode = generateOrderCode();
		state = 0;
		observations = "";
		products =  new ArrayList<>();
	}
	
	


	public String getOrderCode() {
		return orderCode;
	}




	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}




	public int getState() {
		return state;
	}




	public void setState(int state) {
		this.state = state;
	}




	public String getObservations() {
		return observations;
	}




	public void setObservations(String observations) {
		this.observations = observations;
	}




	public ArrayList<Product> getProducts() {
		return products;
	}




	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}




	public String generateOrderCode(){
	    UUID uuid = UUID.randomUUID();
	    return uuid.toString();
	}
}
