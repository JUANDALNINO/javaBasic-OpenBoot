package com.company.classes;

public class CarMain {

    public static void main(String[] args) {
        Car carObj = new Car("red", "cx-30", "mazda", 2023);

        carObj.speed(80);
        System.out.println(carObj);


        carObj.color = "black";
        System.out.println(carObj);
    }

}