package model;

import java.util.ArrayList;

public class Coffe {
	//Relations
	private ArrayList <Client> clients;
	private ArrayList <Product> products;
	private ArrayList <Ingredient> ingredients;
	private ArrayList <Employee> employees;
	
	public Coffe(ArrayList<Client> clients, ArrayList<Product> products, ArrayList<Ingredient> ingredients,ArrayList<Employee> employees) {
		this.clients = clients;
		this.products = products;
		this.ingredients = ingredients;
		this.employees = employees;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public int searchProductInt(String name) {
		int position = 0;
		for (int i = 0 ; i<products.size() ; i++) {
			if (products.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}//End if
		}//End for
		return position;
	}
	
	public Product searchProduct(String name) {
		for (int i = 0 ; i<products.size() ; i++) {
			if (products.get(i).getName().compareTo(name) == 0 ) {
				return products.get(i);
			}//End if
		}//End for
		return null;
	}
	
	public void modifyProduct(Product product, String name) {
		int index = searchProductInt(name);
		products.set(index, product);
	}
	
	public void removeProduct(String name) {
		Product product = searchProduct(name);
		products.remove(product);
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public int searchIngredientInt(String name) {
		int position = 0;
		for (int i = 0 ; i<ingredients.size() ; i++) {
			if (ingredients.get(i).getName().compareTo(name) == 0 ) {
				position = i;
			}//End if
		}//End for
		return position;
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
		if(ingredient != null) {
			ingredients.remove(ingredient);
		}
	}
	
	public void modifyIngredient(Ingredient ingredient, String name) {
		int index = searchIngredientInt(name);
		ingredients.set(index, ingredient);
	}
	
	public Employee searchUsername(String name) {
		for (int i = 0 ; i<employees.size() ; i++) {
			if (employees.get(i).getUserName().compareTo(name) == 0 ) {
				return employees.get(i);
			}//End if
		}//End for
		return null;
	}
	
	
	public boolean userLogin(String name, String password) {
		return ((searchUsername(name) != null ) && (searchUsername(name).getPassword().compareTo(password)==0)) ? true : false;
	}
	
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

/*Cambiar ingrediente en interfaz
	public void changeIngredient(String name) {
		products.get(0).modifyIngredient(new Ingredient(products.get(0).searchIngredientInt(name),false);
	}
	*/
	
	
}
