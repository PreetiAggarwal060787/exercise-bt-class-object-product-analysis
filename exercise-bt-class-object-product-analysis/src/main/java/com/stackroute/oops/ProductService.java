package com.stackroute.oops;
/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
    private Product[] products;  // Initialize the products array from ProductRepository
    public ProductService() {
        this.products = ProductRepository.getProducts();
    }
    /*
        Returns the name of the product given the productCode
        If no product is found for the given product code, return null
     */
    public String findProductNameByCode(int productCode) {
        for (Product product : products) {
            if (product.getProductCode() == productCode) {
                return product.getName();
            }
        }
        return null; // Product not found
    }
    /*
        Returns the Product with the maximum price in a given category
        If no product is found for the given category, return null
     */
    public Product findMaxPriceProductInCategory(String category) {
        Product maxPriceProduct = null;
        double maxPrice = Double.MIN_VALUE;
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                    maxPriceProduct = product;
                }
            }
        }
        return maxPriceProduct;
    }
    /*
        Returns an array of products for a given category
        If no products are found for the given category, return null
     */
    public Product[] getProductsByCategory(String category) {
        int count = 0;
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        if (count == 0) {
            return null; // No products found in the given category
        }
        Product[] categoryProducts = new Product[count];
        int index = 0;
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProducts[index++] = product;
            }
        }
        return categoryProducts;
    }
    }
