package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	private String name;
	private String productType;
	private int size;
	private boolean state; 
	
	//Relations
	private ArrayList <Ingredient> ingredients;

	
	public Product(String name, String productType, int size, boolean state, ArrayList<Ingredient> ingredient) {
		this.name = name;
		this.productType = productType;
		this.size = size;
		this.state = state;
		this.ingredients = ingredient;
	}

	public void addIngredient(Ingredient ingredient) {
		if (ingredient.isState()==true) {
			ingredients.add(ingredient);
		}
	}
	
	public Ingredient searchIngredient(String name) {
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				return ingredients.get(i);
			}//End if
		}//End for
		return null;
	}
	
	public void removeIngredient(String name) {
		Ingredient ingredient = searchIngredient(name);
		ingredients.remove(ingredient);
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
	
	
	
	
}
