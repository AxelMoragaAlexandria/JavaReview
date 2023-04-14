package com.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {

        /*
        If you have a covid vaccine yes or not
                If dose =1 -> you need 2 to be fully vaccinated
                if dose =2 -> you are fully vaccinated
                if dose =3 -> you fully and have booster

         */

                    boolean vaccine=true;
                    int dose=3;

                    if(vaccine){

                        if(dose==1){
                            System.out.println("You need second dose");
                        }else if (dose==2){
                            System.out.println("You are fully vaccinated");
                        }else if(dose==3){
                            System.out.println("You are fully vaccinated with booster");
                        }

                    }












    }
}
