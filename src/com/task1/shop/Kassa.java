package com.task1.shop;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {

    public int calculatePrice(Korzina korzina) {
        ArrayList<Product> spisProd = korzina.getProductsList();
        int summa = 0;

        for (int i = 0; i < spisProd.size(); i++) {
            Product product = spisProd.get(i);
            ProductType type = product.getType();
            summa = summa + type.getPrice();
        }
        return summa;

    }

    public void pechatCheka (Korzina korzina) {
        HashMap<ProductType, Integer> productsCountMap = korzina.getProductCountMap();

        ProductType[] values = ProductType.values();
        for (int i = 0; i < values.length; i++) {
            ProductType type = values[i];
            Integer count = productsCountMap.get(type);
            Integer price = type.getPrice();

            if (count != null) {
                System.out.println(type.toString() + " " + price * count + "р, " + count + "шт");
            }
        }
    }
}
