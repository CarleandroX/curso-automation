package com.icaro.clase4.Herencia;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;

    }
    public void acelerar() {
        System.out.println("Vehiculo acelerando");
    }
    public void frenar() {
        System.out.println("Vehiculo frenando");
    }
}
