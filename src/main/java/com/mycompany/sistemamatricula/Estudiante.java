/*
 *Fernando Mendoza
 *Descripcion:esta es nuestra superClase la cual contiene los metodos y atributos para obtener la informacion de nuestro usuario
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author UserCP
 */


public class Estudiante {
    private final String nombre;
    private final int edad;
    private final String genero;
    private final String carrera;

    public Estudiante(String nombre, int edad, String genero, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Género: " + genero + ", Carrera: " + carrera;
    }
}
