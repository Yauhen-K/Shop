package com.task1.shop;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Product maslo = new Product(ProductType.MASLO);
        Product moloko = new Product(ProductType.MOLOKO);
        Product xleb = new Product(ProductType.XLEB);
        Product voda = new Product(ProductType.VODA);
        Product sok = new Product(ProductType.SOK);
        Product chai = new Product(ProductType.CHAI);

        Korzina korzina = new Korzina();
        korzina.dobavit(maslo);
        korzina.dobavit(moloko, 3);
        korzina.dobavit(xleb, 5);
        korzina.dobavit(voda, 4);
        korzina.dobavit(sok, 7);
        korzina.dobavit(chai, 3);

        Kassa kassa = new Kassa();
        int summaPokupok = kassa.calculatePrice(korzina);
        kassa.pechatCheka(korzina);

        System.out.println("Сумма покупок " + summaPokupok);
    }
}
