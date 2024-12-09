package com.cart;

import java.util.Scanner;

public class ShoppingCartMain {
	public static Scanner scan = new Scanner(System.in);
	public static Customer customer = null;
	public static String prodid="";
	public static int qty =0;
public static void main(String[] args) {
	int choice =0;
		do {
			// here we need to display the product list
			showProducts();
			System.out.println();
			System.out.println("1. Add Product To Cart");
			System.out.println("2. View Cart Items");
			System.out.println("3. Delete Cart");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			switch(choice) {
			case 1:				
				/*
				 #1 we need to collect the customer details such as custid, name, city;
				 #2. We should again display the products list from which the customer can choose
				 #3 We need to read the product details such as product id, quantity that need to be added to the cart
				 #4. We need to create a Cart object and the add it to the CartList
				*/
				if(customer==null) {
				readCustomerDetails();
				}
				showProducts();
				readProductDetails();
				createCartAndAddToCartList();
				
				break;
			case 2:
				viewCartItems();
				break;				
			case 3:
				deleteCart();
				break;
			default:
				System.out.println("Thank you!");
			}
			
		} while(choice<4);
}


private static void createCartAndAddToCartList() {
	Cart cart = new Cart(customer.getCustid(), prodid, ProductUtility.getProductPrice(prodid), qty);
	CartUtility.addProductToCart(cart);
}


private static void readProductDetails() {
     System.out.println("Enter the product id");
     prodid = scan.next();
     System.out.println("Enter qty ");
     qty = scan.nextInt();
	
}


private static void readCustomerDetails() {
	 customer = new Customer();
	 String custid ="";
	 String custname="";
	 String city="";
	 System.out.println("Enter cust id");
	 custid = scan.next();
	 System.out.println("Enter cust name");
	 custname = scan.next();
	 System.out.println("Enter city");
	 city = scan.next();
	  customer.setCustid(custid);
	  customer.setCustname(custname);
	  customer.setCity(city);
	  
	
}


private static void deleteCart() {
	Cart temp = null;
	for(Cart c : CartUtility.cartList) {
		if(c.getCustid().equals(customer.getCustid())){
			temp = c;
			break;
		}
	}
   CartUtility.cartList.remove(temp);
   System.out.println("Cart removed..");
	
}

private static void viewCartItems() {
	// We need to fetch the cartList from CartUtility
	System.out.println("Prod name-Price-Qty-ItemTotal");
	for(Cart c : CartUtility.cartList) {
		// prodid  price qty  price*qty
		int price = ProductUtility.getProductPrice(c.getProdid());
		String prodname = ProductUtility.getProductName(c.getProdid());
		System.out.println(prodname+"-"+c.getPrice()+"-"+c.getQty() + "-"+(c.getQty() * price));
	}
	System.out.println();
}

public static void addProductToCart() {
	 // the code to add the product to the cart goes here
	System.out.println("Add product to cart");
	
}

public static void showProducts() {
	System.out.printf("%-8s%-15s%-8s%-12s%-8s", "PROD-ID","PRODUCT-NAME","PRICE","CATEGORY","STOCK");
	System.out.println();
	System.out.println("----------------------------------------------------------");
	for(Product p : ProductUtility.productList) {
		System.out.printf("%-8s%-15s%-8s%-12s%-8d", p.getProdid(),p.getProdname(),"$"+p.getPrice(),p.getCategory(),p.getQoh());
		System.out.println();
	}
}

}
