package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 26;
        int increment = increment(num);
        int newNumber = increment(increment);
        int decrement = decrement(increment);

        System.out.println(increment);
        System.out.println(newNumber);
        System.out.println(decrement);
    }
    public static int increment (int number) {
        return ++number;
    }
    public static int decrement (int number){
        return --number;
    }
}
