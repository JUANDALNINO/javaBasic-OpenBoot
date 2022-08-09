package com.company;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("The time is sunny");
                break;
            case "cloudy":
                System.out.println("The time is cloudy");
                break;
            default:
                System.out.println("Nothing time founded");
        }
    }
}
