//Copyrigth: Ruth Elizabeth Bautista
// Clase que guarda la información de un profesor: nombre y especialidad.
// Tiene métodos para obtener esos datos y mostrar la información del profesor.

package com.mycompany.sistemamatricula;


public class Profesor {
    private final String nombre;
    private final String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return nombre + " - Especialidad: " + especialidad;
    }
}
