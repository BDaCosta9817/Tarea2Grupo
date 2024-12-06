/*Blanca Da Costa Gomez Carcamo
 * Descripcion: la clase instituto permite la declaracion del nombre y direccion de la Universidad donde gestionaremos la matricula cual nos facilicita al llamarla a la clase principal
 * 
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author UserCP
 */
public class Instituto {
    private String nombre;
    private String direccion;

    public Instituto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Instituto: " + nombre + " - Dirección: " + direccion;
    }
}
