/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author Luis Fernando Ayala Mendoza
 */
public class Instituto {
    // Atributos de la clase Instituto
    private String nombre;
    private String direccion;

    // Constructor de la clase Instituto
    public Instituto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Método para obtener el nombre del instituto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la dirección del instituto
    public String getDireccion() {
        return direccion;
    }

    // Método para obtener una representación en cadena del objeto Instituto
    @Override
    public String toString() {
        return "Instituto: " + nombre + " - Dirección: " + direccion;
    }
}
