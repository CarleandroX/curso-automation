package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7EjercicioIntegrador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        List<Integer> miLista = new ArrayList<>();

        System.out.println("El ingreso finaliza con un numero mayor 500");
        do {
            System.out.println("Ingresar un numero");
            numero = scanner.nextInt();

            miLista.add(numero);}

        while (numero <= 500);

        System.out.println("Cantidad ingresa: " + miLista.size());

        if (miLista.size() < 10) {
            System.out.println("Se ingresaron pocos numeros");
        } else {
            System.out.println("Se excedio la cantidad de ingresos");
        }

    }
}
