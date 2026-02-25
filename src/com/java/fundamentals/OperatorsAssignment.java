package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsAssignment {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        byte id;
        id = scanner.nextByte();
        System.out.println("Enter Product name : ");
        String name = scanner.next();
        System.out.println("Enter Max Retail Price : ");
        int maxRetailPrice;
        maxRetailPrice = scanner.nextInt();
        System.out.println("Enter Discount Percentage : ");
        float discountPercentage;
        discountPercentage = scanner.nextFloat();
        float stateTax = 2.5F;
        float centralTax = 2.5F;

        System.out.println("Max Retail Price : " + maxRetailPrice);

        double discountAmount = (maxRetailPrice * discountPercentage) / 100;
        double finalPrice = maxRetailPrice - discountAmount;
        System.out.println("Price After Discount :" + finalPrice);

        double stateTaxAmount = (finalPrice * stateTax) / 100;
        double centralTaxAmount = (finalPrice * centralTax) / 100;
        double totalTax = stateTaxAmount + centralTaxAmount;
        System.out.println("Total Tax amount : " + totalTax);
        System.out.println("Final Amount : " + (finalPrice + totalTax));
    }
}
