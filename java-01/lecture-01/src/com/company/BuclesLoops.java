package com.company;

public class BuclesLoops {
    public static void main(String[] args) {

        // Loop / bucle => determinada porque se conoce el final

        // For
        for(int i=0; i<=10; i++) {
            System.out.println("Hello World " + i);
        }

        // While
        int count = 0;

        while(count < 10){
            System.out.println("Hello World " + count);
            count ++; // Condicion de terminación
        }
        System.out.println("Finish");


    }
}
