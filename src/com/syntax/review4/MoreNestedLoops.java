package com.syntax.review4;

public class MoreNestedLoops {
    public static void main(String[] args) {

        System.out.println("CAR----------");
        for (int a = 0; a <= 9; a += 1) {
            for (int b = 0; b <= 9; b += 1) {

                for (int c = 0; c <= 9; c += 1) {
                    System.out.println(a + " " + b + " " + c);
                }


            }

        }
        System.out.println("What is the output??????");


    }
}
