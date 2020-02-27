package com.fernandopaniagua.ejercicio2;

/**
 * Ejecutador de la aplicación
 * 
 * @author FPA
 */
public class Ejecutador {
    public static void main(String[] args) {
        Engendro polloPez = new Engendro("PolloPez", 1970, false);
        polloPez.fumar();
        int edad = polloPez.calcularEdad(2020);
        polloPez.setNombre("Arturo");
        System.out.println("La edad del " + polloPez.getNombre() + " es " + edad);
    }
}
