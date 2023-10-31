package com.stackroute.oops;
/*
    Product class stores the information about a single product.
    It contains parameterized constructor and Getters/Setters
 */
public class Product {
	
	private int productCode;
	private String name;
	private double price;
	private String category;
    public Product(int productCode, String name, double price, String category) {
//		super();
		this.productCode = productCode;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static void main(String[] args) {
        // Create and demonstrate the Product class here
		ProductService productService = new ProductService();
		
		// Test findProductNameByCode
		int productCodeToFind = 101; // Replace with the product code you want to search for
        String productName = productService.findProductNameByCode(productCodeToFind);
        if (productName != null) {
            System.out.println("Product Name for Product Code " + productCodeToFind + ": " + productName);
		
         // Test findMaxPriceProductInCategory &&  // Test getProductsByCategory
            
		String categoryToSearch = "clothing"; // Replace with the category you want to search for
		Product maxPriceProduct = productService.findMaxPriceProductInCategory(categoryToSearch);
        System.out.println("Max Price Product in Category " + categoryToSearch + ": " + maxPriceProduct.getName());
		
		
		Product[] categoryProducts = productService.getProductsByCategory(categoryToSearch);
		for (Product product : categoryProducts) {
            System.out.println( product.getName());
        }
    }
}}