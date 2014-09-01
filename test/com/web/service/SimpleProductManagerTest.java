package com.web.service;

import com.web.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleProductManagerTest {
    SimpleProductManager simpleProductManager;
    @Before
    public void setUp() throws Exception {
        simpleProductManager = new SimpleProductManager();
        simpleProductManager.addProducts(new Product("book", 20), new Product("cloth", 100), new Product("shoe", 200));
    }

    @Test
    public void should_get_products_when_have_products() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("book", 20));
        products.add(new Product("cloth", 100));
        products.add(new Product("shoe", 200));
        assertThat(simpleProductManager.getProducts(), is(products));
    }

    @Test
    public void should_increase_all_products() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("book", 24));
        products.add(new Product("cloth", 120));
        products.add(new Product("shoe", 240));

        simpleProductManager.increasePrice(20);

        assertThat(simpleProductManager.getProducts(), is(products));
    }
}