package com.cart;

public class Product {
private String prodid;
private String prodname;
private String category;
private int price;
private int qoh;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String prodid, String prodname, String category, int price, int qoh) {
	super();
	this.prodid = prodid;
	this.prodname = prodname;
	this.category = category;
	this.price = price;
	this.qoh = qoh;
}
public String getProdid() {
	return prodid;
}
public void setProdid(String prodid) {
	this.prodid = prodid;
}
public String getProdname() {
	return prodname;
}
public void setProdname(String prodname) {
	this.prodname = prodname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQoh() {
	return qoh;
}
public void setQoh(int qoh) {
	this.qoh = qoh;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + price;
	result = prime * result + ((prodid == null) ? 0 : prodid.hashCode());
	result = prime * result + ((prodname == null) ? 0 : prodname.hashCode());
	result = prime * result + qoh;
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
	Product other = (Product) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (price != other.price)
		return false;
	if (prodid == null) {
		if (other.prodid != null)
			return false;
	} else if (!prodid.equals(other.prodid))
		return false;
	if (prodname == null) {
		if (other.prodname != null)
			return false;
	} else if (!prodname.equals(other.prodname))
		return false;
	if (qoh != other.qoh)
		return false;
	return true;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", prodname=" + prodname + ", category=" + category + ", price=" + price
			+ ", qoh=" + qoh + "]";
}

}
