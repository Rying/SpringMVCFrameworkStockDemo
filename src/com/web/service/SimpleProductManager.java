package com.web.service;

import com.web.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductManager implements ProductManager {

    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public SimpleProductManager() {
        products = new ArrayList<Product>();
    }

    @Override
    public void increasePrice(int percentage) {
        for (Product product : products) {
            product.setPrice(product.getPrice()*(100+percentage)/100);
        }

    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(Product... products) {
        for (Product product : products) {
            this.products.add(product);
        }
    }
}
