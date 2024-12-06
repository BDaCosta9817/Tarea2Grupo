/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author Luis Fernando Ayala Mendoza
 */ 
public class Estudiante {
    // Atributos de la clase 
    private final String nombre;
    private final int edad;
    private final String genero;
    private final String carrera;
    
    //Constructor de la clase
    public Estudiante(String nombre, int edad, String genero, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
    }

    //Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    //Método para obtener la edad del estudiante
    public int getEdad() {
        return edad;
    }

    //Método para obtener el género del estudiante
    public String getGenero() {
        return genero;
    }

    //Método para obtener la carrera del estudiante
    public String getCarrera() {
        return carrera;
    }

    //Método para obtener una representación en cadena del objeto Estudiante
    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Género: " + genero + ", Carrera: " + carrera;
    }
}
