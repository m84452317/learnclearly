package com.cart;

import java.util.ArrayList;
import java.util.List;

public class CartUtility {
	public static List<Cart> cartList = new ArrayList<>();

	public static void addProductToCart(Cart cart) {
	     //1. check if the cartList is already contains a cart object with the specific custid and prodid
         //1. if yes, then update the qty of the exisiting object, with the qty chosen for the latest cart object
         //2. if not , then add the new cart object to the cart list
		
		int index = -1;
		Cart temp = null;
		for(Cart c : cartList) {
			index++;
			if(c.getCustid().equals(cart.getCustid()) && c.getProdid().equals(cart.getProdid())) {
				temp = c;
				break;
			}
		}
		
		if(temp==null) {
			cartList.add(cart);
			System.out.println("Cart Added...");
		} else {
			temp.setQty(temp.getQty() + cart.getQty());
			cartList.set(index, temp);
			System.out.println("Cart updated...");
		}
		
		// decrease the stock for the particular prodid, that is added
		 // to cart
	  // we need to find the Product object from the product list
		 //based on the proid that is added to the cart
		Product p = ProductUtility.findProduct(cart.getProdid());
		// we should then decrease the QOH on the p object
		 p.setQoh(p.getQoh()-cart.getQty());
	}

}
