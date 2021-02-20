package com.task1.shop;

public class Produkt {
    public Produkt(ProductType name, int price) {
        this.name = name;
        this.price = price;
    }

    private ProductType name;
    private int price;

    public ProductType getName() {
        return name;
    }

    public void setName(ProductType name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
