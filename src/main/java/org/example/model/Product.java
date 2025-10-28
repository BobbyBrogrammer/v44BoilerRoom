package org.example.model;

public class Product {
    private final String name;
    private final String productId;
    private double price;


    public Product(String name, String productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "product name (" + name + ")\n " + "product-ID (" + productId +") \n" + "price (" + price + ")";
    }
}
