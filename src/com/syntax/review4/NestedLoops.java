package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i += 1) {   //outer loop control number of compelte iterations of

            System.out.println(i);
            for (int j = 0; j <= 1; j += 1) { //inner loop ALWAYS depends on outer loop
                System.out.println(j);


            }
        }

    }
}