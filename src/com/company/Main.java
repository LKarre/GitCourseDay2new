package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 26;
        int increment = increment(num);
        int newNumber = increment(increment);

        System.out.println(increment);
        System.out.println(newNumber);
    }
    public static int increment (int number) {
        return ++number;
    }
}
