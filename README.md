#  Programación III – Trabajo Práctico Funcional (Java 21)

Este proyecto implementa las resoluciones del **Trabajo Práctico de Programación Funcional** utilizando **Java 21**, **Streams**, **Lambdas** y **Collectors**.
Está preparado para ejecutarse directamente en **IntelliJ IDEA** con **Gradle**.

---

##  Instrucciones de instalación y ejecución

###  Requisitos previos

* **Java JDK 21** (instalado y configurado en el sistema)
* **IntelliJ IDEA 2023+** (recomendado)
* **Gradle 8+** (si querés ejecutarlo desde terminal)

---

###  Configuración en IntelliJ IDEA

1. Clonar el proyecto del repositorio https://github.com/JPManucha/ProgFuncional.
2. Abrí IntelliJ y seleccioná **File → Open…**, luego elegí la carpeta en la que clonaste el repositorio.
3. Verificá que el proyecto use **JDK 21**:

   * Ir a **File → Project Structure → Project**
   * En “Project SDK” y “Language Level” seleccioná **21**
4. Esperá a que Gradle sincronice las dependencias.

---

### ▶ Ejecución del programa

Tenés dos formas de correr el proyecto:

#### Desde IntelliJ

* Abrí la clase `Main` (`src/main/java/com/example/funcional/Main.java`)
* Hacé clic derecho sobre el archivo y seleccioná **Run 'Main'**

#### Desde la terminal

En la raíz del proyecto, ejecutá:

```bash
./gradlew run
```

---

##  Descripción de los ejercicios

El programa imprime los resultados en consola, organizados en **cuatro casos principales**, cada uno con operaciones funcionales sobre listas usando `Stream API`.

---

###  1. Caso **Alumno**

Modela alumnos con nombre, nota y curso.

* **1.1** Filtra los alumnos aprobados (nota ≥ 7), convierte sus nombres a mayúsculas y los ordena alfabéticamente.
* **1.2** Calcula el **promedio general** de notas.
* **1.3** Agrupa los alumnos por **curso**.
* **1.4** Muestra el **Top 3** de mejores promedios.

---

###  2. Caso **Producto**

Trabaja con una lista de productos, precios, stock y categoría.

* **2.1** Filtra los productos con **precio > 100**, ordenados en forma descendente.
* **2.2** Calcula el **stock total por categoría**.
* **2.3** Genera una cadena con el formato `"nombre $precio"`.
* **2.4** Calcula el **precio promedio general** y el **promedio por categoría**.

---

###  3. Caso **Libro**

Analiza una lista de libros con título, autor, cantidad de páginas y precio.

* **3.1** Filtra los libros con **más de 300 páginas**, ordenando los títulos alfabéticamente.
* **3.2** Calcula el **promedio de páginas**.
* **3.3** Cuenta la cantidad de libros por **autor**.
* **3.4** Identifica el **libro más caro**.

---

###  4. Caso **Empleado**

Gestiona empleados con nombre, departamento, salario y edad.

* **4.1** Filtra los empleados con **salario > 2000**, ordenados de mayor a menor.
* **4.2** Calcula el **salario promedio general**.
* **4.3** Suma los salarios agrupados por **departamento**.
* **4.4** Muestra los nombres de los **dos empleados más jóvenes**.

---

##  Estructura del proyecto

```
java-funcional-soluciones/
├── build.gradle
├── settings.gradle
├── README.md
└── src/
    └── main/
        └── java/
            └── com/example/funcional/
                ├── Main.java
                ├── Alumno.java
                ├── Producto.java
                ├── Libro.java
                ├── Empleado.java
                └── DataFactory.java
```

Cada entidad está implementada como un **record**, introducido en Java 16, ideal para representar datos inmutables.

---

¿Querés que te lo incluya directamente en el proyecto ZIP para que ya lo tengas listo dentro del repositorio?
