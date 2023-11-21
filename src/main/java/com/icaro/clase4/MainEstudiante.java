package com.icaro.clase4;

public class MainEstudiante {

    public static void main(String[] args) {

        P1Estudiante jose = new P1Estudiante(100,"Carlos","Yanes",5.4f);
        System.out.println("Id " + jose.getId());
        System.out.println("Nombre " + jose.getNombre());
        System.out.println("Apellido " + jose.getApellido());
        System.out.println("Promedio " + jose.getPromedio());

        jose.setPromedio(7.0f);

        System.out.println("Promedio " + jose.getPromedio());

    }
}
