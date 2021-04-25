package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"packardbell laptop","4gb ram, i3 intel 4çekirdek iþlemci, intel grafik 3000 ekran kartý.",3200.99);
		
		Product product2 = new Product();
		product2.productId=2;
		product2.productName="apple Iphone";
		product2.ProductDetail = "8gb ram, 4k kamera, ios iþletim sistemi";
		product2.productPrice=11999.99;
		Product product3 = new Product();
		product3.productId=3;
		product3.ProductDetail = "8gb ram , 4k kamera, android 11 iþletim sistmi";
		product3.productName="Samsung galaxy s20";
		product3.productPrice=13999.99;
		
		Category category1 = new Category();
		category1.categoryId=1;
		category1.categoryName="elektronik";
		/*	
		Product[] products= {
				product1,
				product2,
				product3
		};
		
		Category[] categorys={
				category1
			
		};
	
		System.out.println("ürünlerin listesi");
		for(Product product : products) {
			System.out.println(product.productId);
			System.out.println(product.productName);
			System.out.println(product.ProductDetail);
			System.out.println(product.productPrice);
			System.out.println("-------------------------");
		}
		System.out.println("kategoryler listesi");
		for (Category category : categorys) {
			System.out.println(category.categoryId);
			System.out.println(category.categoryName);
		}
		*/
		ProductManager productManager = new ProductManager();
		
		productManager.cardAdd(product1);
		productManager.cardAdd(product2);
		productManager.cardAdd(product3);
	}

}
