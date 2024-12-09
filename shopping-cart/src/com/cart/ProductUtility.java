package com.cart;

import java.util.ArrayList;
import java.util.List;

public class ProductUtility {

	public static List<Product> productList = new ArrayList<>();
	
	static {
		productList.add(new Product("P101","S22 ULTRA","MOBILE",2000,20));
		productList.add(new Product("P102","IPhone 13","MOBILE",2100,25));
		productList.add(new Product("P103","Google Home","Gadgets",100,30));
		productList.add(new Product("P104","Bluetooth","Gadgets",80,50));
		productList.add(new Product("P105","Charger","MOBILE",50,60));
	}
	
	public static String getProductName(String prodid) {
		String prodname = "";
		for(Product p : productList) {
			if(p.getProdid().equals(prodid)) {
				prodname=p.getProdname();
				break;
			}
		}
		return prodname;
	}
	
	public static int getProductPrice(String prodid) {
		int price= 0;
		for(Product p : productList) {
			if(p.getProdid().equals(prodid)) {
				price=p.getPrice();
				break;
			}
		}
		return price;
	}

	public static Product findProduct(String prodid) {
		 Product temp = null;
		 for(Product p : productList) {
				if(p.getProdid().equals(prodid)) {
					 temp = p;
					break;
				}
			}
		return temp;
	}
}
