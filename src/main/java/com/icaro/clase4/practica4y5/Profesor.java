package com.icaro.clase4.practica4y5;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

    private List<Alumno> alumnos;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override

    public void saludar() {
        System.out.println("¡Hola a todos!");
    }

    public void calificar(Alumno alumno, Integer nota) {
        alumno.setNota(nota);
    }

    public void calificar(Integer nota){
        for(int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).setNota(nota);
        }
    }
}
