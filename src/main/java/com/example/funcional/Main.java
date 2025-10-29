
package com.example.funcional;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Programación III - Trabajo Práctico Funcional (Java 21) ===\n");

        // Datos de ejemplo
        List<Alumno> alumnos = DataFactory.alumnos();
        List<Producto> productos = DataFactory.productos();
        List<Libro> libros = DataFactory.libros();
        List<Empleado> empleados = DataFactory.empleados();

        // ----- 1) Caso Alumno -----
        System.out.println("1) Caso Alumno");
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.nota() >= 7)
                .map(a -> a.nombre().toUpperCase(Locale.ROOT))
                .sorted()
                .toList();
        System.out.println("1.1 Nombres aprobados (mayúsculas, ordenados): " + aprobados);

        double promedioNotas = alumnos.stream()
                .collect(averagingDouble(Alumno::nota));
        System.out.println("1.2 Promedio general: " + promedioNotas);

        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(groupingBy(Alumno::curso));
        System.out.println("1.3 Agrupados por curso: " + porCurso);

        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::nota).reversed())
                .limit(3)
                .toList();
        System.out.println("1.4 Top 3 mejores promedios: " + top3 + "\n");

        // ----- 2) Caso Producto -----
        System.out.println("2) Caso Producto");
        List<Producto> carosDesc = productos.stream()
                .filter(p -> p.precio() > 100)
                .sorted(Comparator.comparingDouble(Producto::precio).reversed())
                .toList();
        System.out.println("2.1 Precio > 100 (desc): " + carosDesc);

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(groupingBy(Producto::categoria, summingInt(Producto::stock)));
        System.out.println("2.2 Stock total por categoría: " + stockPorCategoria);

        String listadoNombrePrecio = productos.stream()
                .map(p -> p.nombre() + " $" + p.precio())
                .collect(joining("; "));
        System.out.println("2.3 String nombre-precio: " + listadoNombrePrecio);

        double precioPromedioGeneral = productos.stream()
                .collect(averagingDouble(Producto::precio));
        Map<String, Double> precioPromedioPorCat = productos.stream()
                .collect(groupingBy(Producto::categoria, averagingDouble(Producto::precio)));
        System.out.println("2.4 Precio promedio general: " + precioPromedioGeneral);
        System.out.println("    Precio promedio por categoría: " + precioPromedioPorCat + "\n");

        // ----- 3) Caso Libro -----
        System.out.println("3) Caso Libro");
        List<String> titulosMas300 = libros.stream()
                .filter(l -> l.paginas() > 300)
                .map(Libro::titulo)
                .sorted(String::compareToIgnoreCase)
                .toList();
        System.out.println("3.1 Títulos >300 páginas (orden alfabético): " + titulosMas300);

        double promedioPaginas = libros.stream()
                .collect(averagingInt(Libro::paginas));
        System.out.println("3.2 Promedio de páginas: " + promedioPaginas);

        Map<String, Long> cantidadLibrosPorAutor = libros.stream()
                .collect(groupingBy(Libro::autor, counting()));
        System.out.println("3.3 Cantidad de libros por autor: " + cantidadLibrosPorAutor);

        libros.stream()
                .max(Comparator.comparingDouble(Libro::precio))
                .ifPresent(l -> System.out.println("3.4 Libro más caro: " + l + "\n"));

        // ----- 4) Caso Empleado -----
        System.out.println("4) Caso Empleado");
        List<Empleado> salarioMayor2000Desc = empleados.stream()
                .filter(e -> e.salario() > 2000)
                .sorted(Comparator.comparingDouble(Empleado::salario).reversed())
                .toList();
        System.out.println("4.1 Empleados salario >2000 (desc): " + salarioMayor2000Desc);

        double salarioPromedio = empleados.stream()
                .collect(averagingDouble(Empleado::salario));
        System.out.println("4.2 Salario promedio general: " + salarioPromedio);

        Map<String, Double> sumaSalariosPorDepto = empleados.stream()
                .collect(groupingBy(Empleado::departamento, summingDouble(Empleado::salario)));
        System.out.println("4.3 Suma de salarios por departamento: " + sumaSalariosPorDepto);

        List<String> dosMasJovenes = empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::edad))
                .limit(2)
                .map(Empleado::nombre)
                .toList();
        System.out.println("4.4 Nombres de los 2 más jóvenes: " + dosMasJovenes);
    }
}
