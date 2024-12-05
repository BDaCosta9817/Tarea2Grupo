/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamatricula;

/**
 *
 * @author UserCP
 */


import java.util.ArrayList;

public class Materias {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<String> horarios;

    public Materias(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarHorario(String horario) {
        horarios.add(horario);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<String> getHorarios() {
        return horarios;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
