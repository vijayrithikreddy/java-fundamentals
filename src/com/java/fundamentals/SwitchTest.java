package com.java.fundamentals;

import java.util.Scanner;

public class SwitchTest {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 5 subject marks :");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();
        double avg;
        avg = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        int value = (int) avg / 10;
        switch (value){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
