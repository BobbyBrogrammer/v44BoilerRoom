package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> cart = new ArrayList<>();

    public void addProduct(Product item){
        cart.add(item);
    }

    public double totPrice(){
       double tot = cart.stream()
                .mapToDouble(Product::getPrice)
                .sum();
       return tot;
    }

    public List<Product> getCart() {
        return cart;
    }
}
