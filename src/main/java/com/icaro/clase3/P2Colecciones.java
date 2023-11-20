package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;

public class P2Colecciones {

    public static void main(String[] args) {

        //ARRAYS
        int[] arrayDeEnteros = new int[3];

        arrayDeEnteros[0] = 20;
        arrayDeEnteros[1] = 500;
        arrayDeEnteros[2] = 10000;

        System.out.println("Posicion 0: " + arrayDeEnteros[0]);

        int variable = arrayDeEnteros[1];
        System.out.println("La posicion 1 tiene " + variable);

        System.out.println("Posicion 2: " + arrayDeEnteros[2]);

        //LISTAS

        List<String> listaDeStrings = new ArrayList<>();

        listaDeStrings.add("Hola");
        listaDeStrings.add("soy");
        listaDeStrings.add("Carlos");

        System.out.println("posicion 0: " + listaDeStrings.get(0));
        System.out.println("posicion 1: " + listaDeStrings.get(1));
        System.out.println("posicion 2: " + listaDeStrings.get(2));

        System.out.println("Datos de la lista " + listaDeStrings);

        System.out.println("prueba " + listaDeStrings);




    }
}
