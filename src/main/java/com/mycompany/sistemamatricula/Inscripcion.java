/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
