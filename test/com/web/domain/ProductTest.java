package com.web.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void should_get_product_name() {

        assertThat(new Product("product", 50).getName(), is("product"));
    }

    @Test
    public void should_get_product_price() {

        assertThat(new Product("product", 50).getPrice(), is(50.));
    }
}