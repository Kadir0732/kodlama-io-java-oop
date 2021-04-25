package oopIntro;

public class Product {

	
	int productId;
	String productName;
	String ProductDetail;
	double productPrice;
	
	//birden fazla constructor varsa eðer sadece biri çalýþýr. o imzaya uyan constructor çalýþýr.
	public Product() {
		
	}
	
	//constructor bloðu aþaðýdaki gibi oluþur. New lendiðinde çalýþýr
	public Product(int id, String name, String detail, double price) {
		 productId = id;
		 productName = name;
		 ProductDetail = detail;
		 productPrice = price;
		 
	}
	

	
}
