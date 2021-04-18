package model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
*This class allows the creation of an order<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class Order {
	
	//Constants
	public static final int REQUESTED = 1;//This constant will save the order status as requested
	public static final int PROCESS = 2;//This constant will save the order status as process
	public static final int SENT = 3;//This constant will save the order status as sent
	public static final int DELIVERED = 4;//This constant will save the order status as delivered
	public static final int CANCELED = 5;//This constant will save the order status as canceled
	
	//Attributes
	private String orderCode;//This attribute contains the order code
	private int state;//This attribute contains the order state
	private String observations;//This attribute contains the order observations
	
	//Relations
	private ArrayList <Product> products;//relation to the Product class created in an ArrayList of that type(Product)

//***************************************************************************************************************************
	
	/**
	*Order class construct method<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	
	*@param state Is a integer with the order state<br>
	*@param observations Is a String with the order observations<br>
	*@param products Is a Product with the attributes of that class<br>
	*/	
	public Order( int state, String observations) {
		orderCode = generateOrderCode();
		this.state = state;
		this.observations = observations;
		products = new ArrayList<>();
	}//End Order method
	
	public void changeState(int n) {
		if(n==1) {
			setState(REQUESTED);
		}else if(n==2) {
			setState(PROCESS);
		}else if(n==3) {
			setState(SENT);
		}else if(n==4) {
			setState(DELIVERED);
		}else if(n==5) {
			setState(CANCELED);
		}
	
	}
	
//***************************************************************************************************************************

	/**
	*This method allows adding a product to the order<br>
	
	*<b>pre:</b><br>
	*<b>post:</b>the product has been added to the ArrayList<br>
	
	@param product Is a Product with the attributes of that class. product =! null<br>
	*/
	public void addProduct(Product product) {
		if (product.isState()==true) {
			products.add(product);
		}//End if
	}//End addProduct method
	
//***************************************************************************************************************************

	/**
	*This method allows search an product<br>
	
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	@param name Is a String that contain the product name. product =! null, product =! ""<br>
	@return product name in a position i of the iteration but if the conditional is not met, it returns a null value, this means the product was not found<br>
	*/
	public Product searchProduct(String name) {
		for (int i = 0 ; i<products.size() ; i++) {
			if (products.get(i).getName().compareTo(name) == 0 ) {
				return products.get(i);
			}//End if
		}//End for
		return null;
	}//End searchProduct method
	
//***************************************************************************************************************************

	/**
	*This method allows remove a product<br>
	
	*<b>pre:</b><br>
	*<b>post:</b>the product has been deleted to the arrayList if the conditional is satisfactorily fulfilled<br>
	
	@param name Is a string with the product name. product =! ""<br>
	*/
	public void removeProduct(String name) {
		Product product = searchProduct(name);
		if(product != null) {
			products.remove(product);
		}//End if
	}//End removeProduct method
	
//***************************************************************************************************************************

	/**
	 *This method allows generate a random and unique code<br>
	 *<b>pre:</b><br>
	 *<b>post:</b>the code that has been generated is unique for that object to which it is assigned<br>
	 *@return Returns a unique random code
	 */
	public String generateOrderCode(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}//End generateOrderCode method
	
//*****************************************Setters & Getters*****************************************************************
	
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}//End Order class
