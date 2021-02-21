package com.task1.shop;

public class Product {
    private ProductType type;

    public Product(ProductType type) {
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
