/*
 * Blanca Da Costa Gomez Carcamo
 * Descripcion: la clase inscripcion permite la declaracion y union de cada unos de los apectos que presentaremos en la funcion principal
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author UserCP
 */
public class Inscripcion {
    private Estudiante estudiante;
    private Materias materia;
    private Profesor profesor;
    private String horario;

    public Inscripcion(Estudiante estudiante, Materias materia, Profesor profesor, String horario) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.profesor = profesor;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Inscripción Exitosa!\n" +
                estudiante + "\n" +
                "Materia: " + materia.getNombre() + "\n" +
                "Profesor: " + profesor + "\n" +
                "Horario: " + horario;
    }
}
