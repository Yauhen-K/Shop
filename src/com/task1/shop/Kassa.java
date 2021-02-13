package com.task1.shop;

import java.util.ArrayList;

public class Kassa {

    public int calculatePrice(Korzina k) {
        int s = 0;
        ArrayList<Produkt> spisProd = k.getProducts();

        for (int i = 0; i < spisProd.size(); i++) {
            Produkt p = spisProd.get(i);
            s= s+p.getPrice();
        }
        return s;

    }
}
