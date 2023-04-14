package com.syntax.review4;

public class ArraysReview {
    public static void main(String[] args) {



            int aa=10;

        int[] arry=new int[3];
        // we store elements based on indexes
        arry[0]=10;
        arry[1]=11;
        arry[2]=12;
        arry[3]=12; //ArrayOutOfBoundsException
        //acess also by indexes
        for(int a:arry){
            System.out.println(a);
        }

        String [] planets={"Earth","Mars","Jupiter","Saturn","Neptune"};
     /*   System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);

      */


        for (int j = 0; j < planets.length ; j++) {
            System.out.print(planets[j]+" ");
        }

        System.out.println("Enchaned for loop");
        //enhance for loop is used ONLY with arrays and collections

        for (String planet:planets){
            System.out.println(planet);
        }









    }
}
