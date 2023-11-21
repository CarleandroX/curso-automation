package com.icaro.clase4.practica4y5;

public class MainPersonas {

    public static void main(String[] args) {

        Persona persona = new Persona("Persona", "Personita");

        Alumno alumno = new Alumno("Pepe", "Pepito", "abc", 6);

        Profesor profesor = new Profesor("Jose", "Josesito");

        persona.getApellido();

    }
}
