package com.icaro.clase3;

public class P5Bucles {

    public static void main(String[] args) {

        //While
        int contadorWhile = 0;
        while (contadorWhile < 5) {
            System.out.println("Hola Mundo");

            contadorWhile = contadorWhile + 1;
            //contadorWhile += 1; //esto es lo mismo pero simplificado
            //contadorWhile ++; //tambien es lo mismo, incrementa en 1 la variable

        }
        System.out.println();

        //Do while
        int contadorDoWhile = 0;
        do {
            System.out.println("Hola Mundo");
             contadorDoWhile += 1;
        } while (contadorDoWhile < 5);

        System.out.println();

        //FOR

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo");
        }

    }
}
