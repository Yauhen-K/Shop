package com.task1.shop;

import java.util.ArrayList;

public class Korzina {
    private ArrayList<Produkt> products = new ArrayList<>();

    public void dobavit(Produkt p, int count) {
        for (int i = 0; i < count; i++) {
            getProducts().add(p);
        }
    }

    public void dobavit(Produkt p) {
        getProducts().add(p);
    }

    public ArrayList<Produkt> getProducts() {
        return products;
    }
}
