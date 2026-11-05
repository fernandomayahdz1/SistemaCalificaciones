package com.escuela.calificaciones;

/** Clase hija que representa una calificación obtenida en un examen. */
public class Examen extends Calificacion {
    private String tipoExamen;

    public Examen(String nombreAlumno, String materia, double puntaje, String tipoExamen) {
        super(nombreAlumno, materia, puntaje); // Llama al constructor de la clase padre.
        this.tipoExamen = tipoExamen;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    @Override
    public String mostrarResultado() {
        return "EXAMEN (" + tipoExamen + ") | Alumno: " + getNombreAlumno()
                + " | Materia: " + materia + " | Calificación: " + puntaje;
    }
}
