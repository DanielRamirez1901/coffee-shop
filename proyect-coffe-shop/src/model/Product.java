package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
	private String name;
	private String size;
	private int price;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<KindProduct> kindProduct;
	private boolean disabled;
	
	public Product(String n, String s, int p) {
		name = n;
		size = s;
		price = p;
	}
	
	public static void main(String [] args) {
		
	}

//****************************Ingredientes*********************************	
	
	public void addIngredient(Ingredient name) {
		ingredients.add(name);
	}
	
	public void showIngredients() {
		Iterator<Ingredient> it = ingredients.iterator();
		while(it.hasNext())
		  System.out.println(it.next());
	}
	
	public Ingredient searchIngredient(String name) {
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				return ingredients.get(i);
			}//End if
		}//End for
		return null;
	}
	
	public int searchIngredientsInt(String name) {
		int position = 0;
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}//End if
		}//End for
		return position;
	}
	

	public void modifyIngredients(Ingredient ingredient, String name) {
		int index = searchIngredientsInt(name);
		ingredients.set(index, ingredient);
	}
	
	public void removeIngredient(String name) {
		Ingredient ingredient = searchIngredient(name);
		ingredients.remove(ingredient);
	}
	

//******************************Tipos de productos************************
	public void addKindProduct(KindProduct name) {
		kindProduct.add(name);
	}
	
	public void showKindProduct() {
		Iterator<KindProduct> it = kindProduct.iterator();
		while(it.hasNext())
		  System.out.println(it.next());
	}
	
	public KindProduct searchKindProduct(String name) {
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (kindProduct.get(i).getName().compareTo(name) == 0 ) {
				return kindProduct.get(i);
			}//End if
		}//End for
		return null;
	}
	
	public int searchKindProductInt(String name) {
		int position = 0;
		for (int i = 0 ; i<kindProduct.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}//End if
		}//End for
		return position;
	}
	
	public void modifyKindProduct(KindProduct kindProducts, String name) {
		int index = searchKindProductInt(name);
		kindProduct.set(index, kindProducts);
	}
	
	public void removeKindProduct(String name) {
		KindProduct kindProducts = searchKindProduct(name);
		kindProduct.remove(kindProducts);
	}

//****************************SettersAndGetters******************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
