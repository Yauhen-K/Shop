package com.task1.shop;


public class Main {

    public static void main(String[] args) {
        Produkt xleb = new Produkt("xleb", 5);
        Produkt xleb1 = new Produkt("xleb1", 5);
        Produkt xleb2 = new Produkt("xleb2", 5);
        Produkt xleb3 = new Produkt("xleb3", 5);
        Produkt xleb4 = new Produkt("xleb4", 5);

        Korzina korzina = new Korzina();
        korzina.dobavit(xleb);
        korzina.dobavit(xleb1);
        korzina.dobavit(xleb2);
        korzina.dobavit(xleb3);
        korzina.dobavit(xleb4);

        Kassa kassa = new Kassa();
        int s = kassa.calculatePrice(korzina);

        System.out.println(s);
    }
}
