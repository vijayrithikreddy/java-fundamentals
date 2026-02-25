package com.java.fundamentals;

public class Operators {
    static void main(String[] args) {
        int no1 = 10, no2 = 20;
        System.out.println(no1 + no2);
        System.out.println(no1 - no2);
        System.out.println(no1 * no2);
        System.out.println(no1 / no2);
        System.out.println(no1 % no2);
        no1 +=1;
        System.out.println(no1);
        no1 -=1;
        System.out.println(no1);
        System.out.println(--no1);
        System.out.println(no1--);
        no1 = 10;
        no2 =20;
        System.out.println(++no1 - --no2 + no1++ - --no2 + no2++);

    }
}
