package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String name="Ezra";
        double price=7.50;
        System.out.printf(name+" bought a cup of coffee from Starbucks for $%.2f",price);
        System.out.println("\n");
        System.out.printf("%s bought a cup of coffee from Starbucks for $%.2f",name,price);
        System.out.println("\n");
        System.out.println(name+" bought a cup of coffee from Starbucks for $"+String.format("%.2f",price));
    }
}
