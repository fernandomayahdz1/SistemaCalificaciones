package com.escuela.calificaciones;

/** Clase hija que representa la evaluación de un proyecto escolar. */
public class Proyecto extends Calificacion {
    private String nombreProyecto;

    public Proyecto(String nombreAlumno, String materia, double puntaje, String nombreProyecto) {
        super(nombreAlumno, materia, puntaje);
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    @Override
    public String mostrarResultado() {
        return "PROYECTO (" + nombreProyecto + ") | Alumno: " + getNombreAlumno()
                + " | Materia: " + materia + " | Calificación: " + puntaje;
    }
}
