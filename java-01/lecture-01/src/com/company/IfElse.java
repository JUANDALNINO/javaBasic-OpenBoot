package com.company;

public class IfElse {
    public static void main(String[] args) {

        boolean check = 5 > 10;

        if(check) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }



        if(10 < 5) {
            System.out.println("True Two");
        } else if (5 > 4) {
            System.out.println("Else if Two");
        } else {
            System.out.println("False Two");
        }
    }
}
