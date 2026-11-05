package com.escuela.calificaciones;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: referencia de tipo Calificacion y constructores de clases hijas.
        Calificacion[] evaluaciones = {
                new Examen("Ana López", "Matemáticas", 9.5, "Parcial"),
                new Proyecto("Luis Pérez", "Historia", 8.7, "Línea del tiempo"),
                new Participacion("María Ruiz", "Ciencias", 9.0, 5)
        };

        System.out.println("===== SISTEMA DE GESTIÓN DE CALIFICACIONES =====");

        // El ciclo recorre objetos de distinto tipo y ejecuta la versión sobrescrita.
        for (Calificacion evaluacion : evaluaciones) {
            System.out.println(evaluacion.mostrarResultado());
            System.out.println("Estado: " + (evaluacion.estaAprobado() ? "Aprobado" : "No aprobado"));
            evaluacion.registrarColecciones();
            System.out.println("-----------------------------------------------");
        }

        // Demostración del encapsulamiento mediante setter y getter.
        evaluaciones[0].setNombreAlumno("Ana López García");
        System.out.println("Nombre actualizado: " + evaluaciones[0].getNombreAlumno());

        // Demostración de las cuatro colecciones solicitadas.
        Calificacion ejemplo = evaluaciones[0];
        System.out.println("ArrayList (historial): " + ejemplo.historialCalificaciones);
        System.out.println("LinkedList (pendientes): " + ejemplo.actividadesPendientes);
        System.out.println("HashSet (materias): " + ejemplo.materiasRegistradas);
        System.out.println("HashMap (materia y calificación): " + ejemplo.calificacionesPorMateria);

        // Ejemplo de acceso a tipos primitivos y objetos envolventes.
        System.out.println("Edad int: " + ejemplo.edadPrimitiva
                + " | Edad Integer: " + ejemplo.edadObjeto);
        System.out.println("Grupo char: " + ejemplo.grupoPrimitivo
                + " | Grupo Character: " + ejemplo.grupoObjeto);
    }
}
