package oopIntro;

public class Product {

	
	int productId;
	String productName;
	String ProductDetail;
	double productPrice;
	
	//birden fazla constructor varsa e�er sadece biri �al���r. o imzaya uyan constructor �al���r.
	public Product() {
		
	}
	
	//constructor blo�u a�a��daki gibi olu�ur. New lendi�inde �al���r
	public Product(int id, String name, String detail, double price) {
		 productId = id;
		 productName = name;
		 ProductDetail = detail;
		 productPrice = price;
		 
	}
	

	
}
