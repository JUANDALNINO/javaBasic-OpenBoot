package com.company;

public class FunctionsParameters {

    public static void main(String[] args) {
        helloWorld();

        byeWorld("Juan David"); // String por parametro
        byeWorld("Luisa");
        byeWorld("Martin");

        String hello = returnHello();
        System.out.println(hello);
    }

    // Métodos => es una función
    public static void helloWorld() {
        System.out.println("Hello World from a method");
    }

    // Con parametros: Mencionando el tipo de dato que se trabaja
    public static void byeWorld(String name) {
        System.out.println("Bye Bye " + name);
    }

    // Método con return
    public static String returnHello() { // String => text - Puede ser con cualquier tipo de dato
        return "Hello. I'm a return";
    }
}