package com.task1.shop;

public enum ProductType {
    MOLOKO(2), XLEB(4), MASLO(5),
    VODA(5), SOK(1), CHAI(4), SHOKOLAD(2);

    private int price;

    ProductType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
