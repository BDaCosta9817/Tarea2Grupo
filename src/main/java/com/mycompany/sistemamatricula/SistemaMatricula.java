

package com.mycompany.sistemamatricula;


/**
 *Fernando Mendoza
 *Ruth Bautista
 *Blanca Da Costa Gomez
 * Descripcion Sistema que permite que el usuario gestione una matricula llenando sus datos y disponiendo eleccion.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMatricula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del Instituto
        Instituto instituto = new Instituto("UTH", "San Pedro Sula");

        // Crear algunas materias con profesores y horarios
        Materias materia1 = new Materias("Matemáticas");
        materia1.agregarProfesor(new Profesor("Dr. Juan Pérez", "Matemáticas"));
        materia1.agregarProfesor(new Profesor("Ing. Carlos Gómez", "Álgebra"));
        materia1.agregarProfesor(new Profesor("Dra. Ana López", "Geometría"));
        materia1.agregarHorario("Lunes 8:00 AM");
        materia1.agregarHorario("Martes 10:00 AM");
        materia1.agregarHorario("Miércoles 2:00 PM");

        Materias materia2 = new Materias("Física");
        materia2.agregarProfesor(new Profesor("Dr. Julia Sánchez", "Física General"));
        materia2.agregarProfesor(new Profesor("Ing. Roberto García", "Electromagnetismo"));
        materia2.agregarProfesor(new Profesor("Dr. Enrique Vargas", "Mecánica"));
        materia2.agregarHorario("Lunes 9:00 AM");
        materia2.agregarHorario("Jueves 11:00 AM");
        materia2.agregarHorario("Viernes 3:00 PM");

        ArrayList<Materias> materias = new ArrayList<>();
        materias.add(materia1);
        materias.add(materia2);

        // Solicitar datos del estudiante
        System.out.println("Ingrese los datos personales:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, genero, carrera);

        // Mostrar las materias disponibles
        System.out.println("\nMaterias disponibles:");
        for (int i = 0; i < materias.size(); i++) {
            System.out.println((i + 1) + ". " + materias.get(i));
        }

        System.out.print("\nElija una materia (1-" + materias.size() + "): ");
        int materiaElegida = scanner.nextInt() - 1;
        Materias materia = materias.get(materiaElegida);

        // Mostrar los profesores y horarios de la materia seleccionada
        System.out.println("\nProfesores de " + materia.getNombre() + ":");
        for (int i = 0; i < materia.getProfesores().size(); i++) {
            System.out.println((i + 1) + ". " + materia.getProfesores().get(i));
        }

        System.out.print("\nElija un profesor (1-" + materia.getProfesores().size() + "): ");
        int profesorElegido = scanner.nextInt() - 1;
        Profesor profesor = materia.getProfesores().get(profesorElegido);

        // Mostrar horarios de la materia seleccionada
        System.out.println("\nHorarios disponibles:");
        for (int i = 0; i < materia.getHorarios().size(); i++) {
            System.out.println((i + 1) + ". " + materia.getHorarios().get(i));
        }

        System.out.print("\nElija un horario (1-" + materia.getHorarios().size() + "): ");
        int horarioElegido = scanner.nextInt() - 1;
        String horario = materia.getHorarios().get(horarioElegido);

        // Crear la inscripción
        Inscripcion inscripcion = new Inscripcion(estudiante, materia, profesor, horario);

        // Mostrar la inscripción exitosa
        System.out.println("\n" + inscripcion);
    }
}
