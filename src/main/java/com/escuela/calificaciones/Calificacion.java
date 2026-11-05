package com.escuela.calificaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Clase padre que representa una calificación general de un alumno.
 * Las clases Examen, Proyecto y Participacion heredan sus atributos y métodos.
 */
public class Calificacion {
    // Encapsulamiento: privado, protegido y público.
    private String nombreAlumno;
    protected double puntaje;
    public String materia;

    // Ocho pares de tipos primitivos y sus clases envolventes (no primitivos).
    public byte intentosPrimitivo = 2;
    public Byte intentosObjeto = Byte.valueOf((byte) 2);

    public short faltasPrimitivo = 1;
    public Short faltasObjeto = Short.valueOf((short) 1);

    public int edadPrimitiva = 16;
    public Integer edadObjeto = Integer.valueOf(16);

    public long matriculaPrimitiva = 2026001L;
    public Long matriculaObjeto = Long.valueOf(2026001L);

    public float promedioParcialPrimitivo = 8.5f;
    public Float promedioParcialObjeto = Float.valueOf(8.5f);

    public double promedioFinalPrimitivo = 9.2;
    public Double promedioFinalObjeto = Double.valueOf(9.2);

    public char grupoPrimitivo = 'A';
    public Character grupoObjeto = Character.valueOf('A');

    public boolean acreditadoPrimitivo = true;
    public Boolean acreditadoObjeto = Boolean.TRUE;

    // Colecciones solicitadas en la actividad.
    public ArrayList<Double> historialCalificaciones = new ArrayList<>();
    public LinkedList<String> actividadesPendientes = new LinkedList<>();
    public HashSet<String> materiasRegistradas = new HashSet<>();
    public HashMap<String, Double> calificacionesPorMateria = new HashMap<>();

    // Constructor de la clase padre.
    public Calificacion(String nombreAlumno, String materia, double puntaje) {
        this.nombreAlumno = nombreAlumno;
        this.materia = materia;
        setPuntaje(puntaje);
    }

    // Getter y setter para el atributo privado.
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        if (nombreAlumno == null || nombreAlumno.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombreAlumno = nombreAlumno;
    }

    // Getter y setter para el atributo protegido.
    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        if (puntaje < 0 || puntaje > 10) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
        }
        this.puntaje = puntaje;
    }

    /**
     * Método que las clases hijas sobrescriben para mostrar polimorfismo.
     */
    public String mostrarResultado() {
        return "Calificación general: " + puntaje;
    }

    // Método común heredado por las clases hijas.
    public boolean estaAprobado() {
        return puntaje >= 6.0;
    }

    public void registrarColecciones() {
        historialCalificaciones.add(puntaje);
        actividadesPendientes.add("Revisar " + materia);
        materiasRegistradas.add(materia);
        calificacionesPorMateria.put(materia, puntaje);
    }
}
