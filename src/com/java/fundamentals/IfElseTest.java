package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int no1;
        no1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        int no2;
        no2 = scanner.nextInt();
        System.out.println("Enter Number 3: ");
        int no3;
        no3 = scanner.nextInt();

        if(no1 > no2 && no1 > no3)
            System.out.println(no1 + " is greater");
        else if (no2 > no3)
            System.out.println(no2 + " is greater");
        else
            System.out.println(no3 + " is greater");

    }
}
