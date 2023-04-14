package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int sum=0; ////or sum+=num;3
        System.out.println("Please enter integer values");

                while(scan.hasNextInt()) {

                    int num = scan.nextInt();
                    sum = sum + num;
                }

        System.out.println("Sum = "+sum);
    //we use while and do while when we don't know how many times they do it



















    }
}
