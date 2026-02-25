package com.java.fundamentals;


import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        byte id;
        id = scanner.nextByte();
        System.out.println("Enter Product Name : ");
        String name;
        name = scanner.next();
        System.out.println("Enter Manufactured Year : ");
        short manufacturedYear;
        manufacturedYear = scanner.nextShort();
        System.out.println("Enter Max Retail price : ");
        int maxRetailPrice;
        maxRetailPrice = scanner.nextInt();
        System.out.println("Enter Discount Percentage : ");
        float discountPercentage;
        discountPercentage = scanner.nextFloat();
        System.out.println("Enter Final Price : ");
        double finalPrice = scanner.nextDouble();
        System.out.println("Enter Membership (G/S/B) : ");
        char membership;
        membership = scanner.next().charAt(0);
        System.out.println("Is Product Available : ");
        boolean isAvailable;
        isAvailable = scanner.nextBoolean();

        System.out.println("ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Manufactured Year : " + manufacturedYear);
        System.out.println("MRP : " + maxRetailPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Final Price : " + finalPrice);
        System.out.println("Membership : " + membership);
        System.out.println("Is Product Available : " + isAvailable);
    }
}