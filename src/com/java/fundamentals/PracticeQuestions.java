package com.java.fundamentals;

import java.util.Scanner;

public class PracticeQuestions {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a N Value : ");
        int N;
        N = scanner.nextInt();
        //print1ToN(N);
        //printNto1(N);
        //printEven(N);
        //printOdd(N);
        //printMultiplicationTable(N);
        //printSumToN(N);
        //sumOfEvenNumbers(N);
        //sumOfOddNumbers(N);
        //numberOfDigits(N);
        //digitsInNumber(N);
    }
    static void print1ToN(int N){
        for (int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
    static void printNto1(int N){
        while (N != 0){
            System.out.println(N);
            N--;
        }
    }
    static void printEven(int N){
        for (int i = 2; i <= N; i += 2) {
                System.out.println(i);
        }
    }
    static void printOdd(int N){
        for (int i = 1; i <= N; i += 2) {
            System.out.println(i);
        }
    }
    static void printMultiplicationTable(int N){
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
    static void printSumToN(int N){
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    static void sumOfEvenNumbers(int N){
        int sum = 0;
        for (int i = 2; i <= N; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
    static void sumOfOddNumbers(int N){
        int sum = 0;
        for (int i = 1; i <= N; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
    static void numberOfDigits(int N){
        int count = 0;
        while(N > 0){
            count++;
            N = N / 10;
        }
        System.out.println(count);
    }
    static void digitsInNumber(int N){
        int temp;
        while(N > 0){
            temp = N % 10;
            System.out.println(temp);
            N = N / 10;
        }
    }
}

