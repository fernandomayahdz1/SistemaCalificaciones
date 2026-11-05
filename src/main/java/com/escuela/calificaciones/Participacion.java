package com.escuela.calificaciones;

/** Clase hija que representa los puntos obtenidos por participación en clase. */
public class Participacion extends Calificacion {
    private int intervenciones;

    public Participacion(String nombreAlumno, String materia, double puntaje, int intervenciones) {
        super(nombreAlumno, materia, puntaje);
        this.intervenciones = intervenciones;
    }

    public int getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(int intervenciones) {
        if (intervenciones < 0) {
            throw new IllegalArgumentException("Las intervenciones no pueden ser negativas.");
        }
        this.intervenciones = intervenciones;
    }

    @Override
    public String mostrarResultado() {
        return "PARTICIPACIÓN (" + intervenciones + " intervenciones) | Alumno: "
                + getNombreAlumno() + " | Materia: " + materia + " | Calificación: " + puntaje;
    }
}
