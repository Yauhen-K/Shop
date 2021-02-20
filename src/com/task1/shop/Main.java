package com.task1.shop;


public class Main {

    public static void main(String[] args) {
        Produkt maslo73 = new Produkt(ProductType.MASLO, 5);
        Produkt moloko3 = new Produkt(ProductType.MOLOKO, 5);
        Produkt xleb2 = new Produkt(ProductType.XLEB, 5);
        Produkt moloko2 = new Produkt(ProductType.MOLOKO, 5);
        Produkt xleb4 = new Produkt(ProductType.XLEB, 5);

        Korzina korzina = new Korzina();
        korzina.dobavit(maslo73);
        korzina.dobavit(moloko2,2);
        korzina.dobavit(xleb2,4);
        korzina.dobavit(moloko3,5);
        korzina.dobavit(xleb4,3);

        Kassa kassa = new Kassa();
        int s = kassa.calculatePrice(korzina);

        System.out.println(s);
    }
}
