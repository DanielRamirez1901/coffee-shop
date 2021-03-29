package model;
import java.util.ArrayList;
/**
*This class allows the creation of an product<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/

public class Product {
	
	//Attributes
	private String name;//This attribute contains the name of the product
	private String productType;//This attribute contains the product Type 
	private int size;//This attribute contains the product size
	private boolean state;//This attribute contains the product state;
	
	//Relations
	private ArrayList <Ingredient> ingredients;//relation to the ingredient class created in an ArrayList
	
//*******************************************************************************************************************
	
	/**
	*Product class construct method<br>
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	
	*@param name Is a String with the product name<br>
	*@param productType Is a String with the product type<br>
	*@param size Is a integer with the product size<br>
	*@param state Is a boolean with the product state<br>
	*@param ingredient Is an ingredient contain in an ArrayList<br>
	*/	
	public Product(String name, String productType, int size, boolean state, ArrayList<Ingredient> ingredient) {
		this.name = name;
		this.productType = productType;
		this.size = size;
		this.state = state;
		this.ingredients = ingredient;
	}//End Product constructor
	
//*******************************************************************************************************************
	
	/**
	*This method allows adding an ingredient to the product<br>
	
	*<b>pre:</b><br>
	*<b>post:</b>the ingredient has been added to the arrayList<br>
	
	@param ingredient Is a variable of Ingredient type. ingredient =! null<br>
	*/
	public void addIngredient(Ingredient ingredient) {
		if (ingredient.isState()==true) {
			ingredients.add(ingredient);
		}//End if
	}//End addIngredient method
	
//*******************************************************************************************************************
	
	/**
	*This method allows search an ingredient<br>
	
	*<b>pre:</b><br>
	*<b>post:</b><br>
	
	@param name Is a String that contain the ingredient name. ingredient =! null, ingredient =! ""<br>
	@return ingredient name in a position i of the iteration but if the conditional is not met, it returns a null value, this means the ingredient was not found<br>
	*/
	public Ingredient searchIngredient(String name) {
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				return ingredients.get(i);
			}//End if
		}//End for
		return null;
	}//End searchIngredient method

//*******************************************************************************************************************

	/**
	*This method allows remove an ingredient<br>
	
	*<b>pre:</b><br>
	*<b>post:</b>the ingredient has been deleted to the arrayList if the conditional is satisfactorily fulfilled<br>
	
	@param name Is a string with the ingredient name. ingredient =! ""<br>
	*/
	public void removeIngredient(String name) {
		Ingredient ingredient = searchIngredient(name);
		if(ingredient != null) {
			ingredients.remove(ingredient);
		}//End if
	}//End removeIngredient method
	
//********************************Setters & Getters*****************************************************************

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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<Ingredient> getIngredient() {
		return ingredients;
	}

	public void setIngredient(ArrayList<Ingredient> ingredient) {
		this.ingredients = ingredient;
	}	
}//End Product Class
