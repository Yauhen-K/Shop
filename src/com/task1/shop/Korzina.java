package com.task1.shop;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.HashMap;

public class Korzina {
    private ArrayList<Product> productsList = new ArrayList<>();
    private HashMap<ProductType, Integer> productCountMap = new HashMap<>();

//    XLEB : 2
//    MOLOKO : 3

    public void dobavit(Product product, int count) {
        if (count < 1) {
            throw new RuntimeException("Otricatelnij count nedopustim!");
        }

        ProductType type = product.getType();
        Integer prodCount = productCountMap.get(type);
        if (prodCount == null) {
            productCountMap.put(type, count);
        } else {
            Integer newCount = prodCount + count;
            productCountMap.put(type, newCount);
        }

        for (int i = 0; i < count; i++) {
            productsList.add(product);
        }
    }

    public void dobavit(Product product) {
        dobavit(product, 1);
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public HashMap<ProductType, Integer> getProductCountMap() {
        return productCountMap;
    }
}
