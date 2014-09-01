package com.web.service;

import com.web.domain.Product;

import java.util.List;

public interface ProductManager {
    public void increasePrice(int percentage);
    public List<Product> getProducts();
}
