package com.company.classes;

public class Car {
    // 1. Atributos/Propiedades
    String color;
    String model;
    String brand;
    Double weight;
    Double height;
    int year;
    Integer velocity = 0;


    // 2. Constructores
    public Car(String color, String model, String brand, int year) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }


    // 3. Métodos/Operaciones
    public void speed(Integer amount) {
        this.velocity += amount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", year=" + year +
                ", velocity=" + velocity +
                '}';
    }
}
