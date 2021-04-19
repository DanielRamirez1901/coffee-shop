package model;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product pr1, Product pr2) {
		return pr1.getName().compareTo(pr2.getName());
	}

}
