
package com.example.funcional;

import java.util.List;

public class DataFactory {
    public static List<Alumno> alumnos() {
        return List.of(
                new Alumno("Ana", 8.5, "1A"),
                new Alumno("Bruno", 6.9, "1A"),
                new Alumno("Carla", 9.1, "2B"),
                new Alumno("Diego", 7.0, "2B"),
                new Alumno("Elena", 5.5, "1A"),
                new Alumno("Francisco", 10.0, "3C"),
                new Alumno("Gisela", 7.8, "3C")
        );
    }

    public static List<Producto> productos() {
        return List.of(
                new Producto("Teclado", "Electrónica", 80.0, 15),
                new Producto("Mouse", "Electrónica", 50.0, 25),
                new Producto("Monitor", "Electrónica", 220.0, 5),
                new Producto("Silla", "Muebles", 150.0, 12),
                new Producto("Escritorio", "Muebles", 320.0, 7),
                new Producto("Lámpara", "Iluminación", 45.0, 30),
                new Producto("Panel LED", "Iluminación", 180.0, 18)
        );
    }

    public static List<Libro> libros() {
        return List.of(
                new Libro("Clean Code", "Robert C. Martin", 464, 45.0),
                new Libro("Effective Java", "Joshua Bloch", 416, 55.0),
                new Libro("Domain-Driven Design", "Eric Evans", 560, 60.0),
                new Libro("Refactoring", "Martin Fowler", 448, 50.0),
                new Libro("The Pragmatic Programmer", "Andy Hunt", 352, 48.0),
                new Libro("Test-Driven Development", "Kent Beck", 240, 35.0)
        );
    }

    public static List<Empleado> empleados() {
        return List.of(
                new Empleado("Juan", "IT", 2500.0, 28),
                new Empleado("María", "IT", 3100.0, 25),
                new Empleado("Pedro", "Ventas", 1800.0, 32),
                new Empleado("Lucía", "Ventas", 2200.0, 24),
                new Empleado("Sofía", "RRHH", 2000.0, 29),
                new Empleado("Carlos", "RRHH", 2300.0, 26)
        );
    }
}
