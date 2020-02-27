package com.fernandopaniagua.ejercicio2;

/**
 * Representa un engendro
 * 
 * @author FPA
 */
public class Engendro { 
    private String nombre;//Atributo
    private int anyoNacimiento;
    private boolean esFeo;

    /**
     * Constructor 
     * 
     * @param nombre Nombrel engendro
     * @param anyoNacimiento Año de nacimiento
     * @param esFeo Indica si el bicho es feo o no
     */
    public Engendro(String nombre, int anyoNacimiento, boolean esFeo) {
        this.nombre = nombre;
        this.anyoNacimiento = anyoNacimiento;
        this.esFeo = esFeo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public boolean isEsFeo() {
        return esFeo;
    }

    public void setEsFeo(boolean esFeo) {
        this.esFeo = esFeo;
    }

    /**
     * Fuma un cigarrillo (ocurrencia de Alberto)
     */
    public void fumar(){
        System.out.println("Fumando...");
    }

    /**
     * Calcula la edad del engendro
     * @param anyoActual Año actual
     * @return La edad en años de la Tierra
     */
    public int calcularEdad(int anyoActual) { 
        int edad = anyoActual - anyoNacimiento;
        return edad;
    }
    
}
