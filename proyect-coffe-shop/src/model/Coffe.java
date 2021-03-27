package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffe {
	private ArrayList<Product> products;
	
	public void addProducts(Product product) {
		products.add(product);
	}
	
	public Product searchProduct(String name){
		for (int i = 0 ; i<products.size() ; i++) {
			if (products.get(i).getName().compareTo(name) == 0 ) {
				return products.get(i);
			}//End if
		}//End for
		return null;
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
	
	public void showProduts() {
		Iterator<Product> it = products.iterator();
		while(it.hasNext())
		  System.out.println(it.next());
	}
	
	public void modifyProducts(Product product, String name) {
		int index = searchProductInt(name);
		products.set(index, product);
	}
	
	public void removeProducts(String name) {
		Product product = searchProduct(name);
		products.remove(product);
	}

}
