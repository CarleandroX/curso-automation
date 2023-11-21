package com.icaro.clase4.practica4y5;

public class NoDocente extends Persona {
    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar(){
        System.out.println("¡Buen día!");
    }
}
