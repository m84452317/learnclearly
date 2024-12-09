package com.cart;

public class Cart {
 private String custid;
 private String prodid;
 private int price;
 private int qty;
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(String custid, String prodid, int price, int qty) {
	super();
	this.custid = custid;
	this.prodid = prodid;
	this.price = price;
	this.qty = qty;
}
public String getCustid() {
	return custid;
}
public void setCustid(String custid) {
	this.custid = custid;
}
public String getProdid() {
	return prodid;
}
public void setProdid(String prodid) {
	this.prodid = prodid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((custid == null) ? 0 : custid.hashCode());
	result = prime * result + price;
	result = prime * result + ((prodid == null) ? 0 : prodid.hashCode());
	result = prime * result + qty;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cart other = (Cart) obj;
	if (custid == null) {
		if (other.custid != null)
			return false;
	} else if (!custid.equals(other.custid))
		return false;
	if (price != other.price)
		return false;
	if (prodid == null) {
		if (other.prodid != null)
			return false;
	} else if (!prodid.equals(other.prodid))
		return false;
	if (qty != other.qty)
		return false;
	return true;
}
 
}
