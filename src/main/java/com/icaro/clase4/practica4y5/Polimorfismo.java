package com.icaro.clase4.practica4y5;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Pepe", "Pepito", "ABC", 8);
        Profesor profesor = new Profesor("Juan", "Carlos");
        NoDocente noDocente = new NoDocente("Maria", "De Los Angeles");

        List<Persona> listaDePersonas = new ArrayList<>();

        listaDePersonas.add(alumno);
        listaDePersonas.add(profesor);
        listaDePersonas.add(noDocente);

        for (Persona persona: listaDePersonas) {
            persona.saludar();
            
        }


        }
    }
