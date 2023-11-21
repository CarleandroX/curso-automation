package com.icaro.clase4.Herencia;

public class HerenciaMain {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota","Corolla", 2020);
        Coche coche = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println("Marca vehiculo: " + vehiculo.getMarca());
        System.out.println("Modelo vehiculo: " + vehiculo.getModelo());
        System.out.println("Anio vehiculo: " + vehiculo.getAnio());

        System.out.println();

        System.out.println("Marca vehiculo: " + coche.getMarca());
        System.out.println("Modelo vehiculo: " + coche.getModelo());
        System.out.println("Anio vehiculo: " + coche.getAnio());
        System.out.println("Cilindrada vehiculo: " + coche.getCilindrada());

        vehiculo.acelerar();
        coche.acelerar();






    }
}
