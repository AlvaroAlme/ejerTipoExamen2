# ejerTipoExamen2
Gracias por compartir los ejemplos. A continuación te dejo un **examen práctico de Programación Orientada a Objetos en Java**, similar en estructura y complejidad al de "viviendas" y "vehículos", pero con una temática nueva: **gestión de bibliotecas**.

---

### 📝 **EXAMEN PRÁCTICO - GESTIÓN DE BIBLIOTECA**

**Módulo: Programación - 2ª Evaluación**

Desarrolla una aplicación en Java para gestionar una biblioteca que contiene diferentes tipos de libros. La aplicación debe permitir al usuario interactuar mediante un menú de opciones.

---

### 📋 FUNCIONALIDADES DEL MENÚ:

1. Registrar un libro
2. Buscar libro por ISBN
3. Listar todos los libros
4. Prestar un libro
5. Calcular penalización por retraso
6. Salir

---

### 📘 INFORMACIÓN GENERAL DE UN LIBRO

Todos los libros tienen:

* Título
* Autor (nombre y apellidos)
* ISBN (único, formato validado)
* Año de publicación
* Disponible para préstamo (boolean)
* Persona prestataria (si se ha prestado)

---

### 👤 CLASE PERSONA

Contiene:

* Nombre
* Apellidos
* DNI (validado con regex)
* Fecha de nacimiento

---

### 📚 TIPOS DE LIBROS

1. **Novela**

   * Género literario (aventura, drama, etc.)
   * Nº de páginas
   * Tiene versión digital (boolean)

2. **Libro de texto**

   * Curso al que va dirigido (Ej: 2º ESO, Bachillerato…)
   * Asignatura
   * Precio del libro nuevo

3. **Cómic**

   * Dibujante principal
   * Color o blanco y negro
   * Nº de entregas si es una serie

---

### 💡 INTERFAZ: Prestable

Todos los libros deben implementar una interfaz `Prestable` que contenga:

```java
double calcularPenalizacion(int diasRetraso);
```

Cálculo por tipo:

* **Novela**: 0.5 €/día
* **Libro de texto**: 0.3 €/día + 2€ si el retraso supera 10 días
* **Cómic**: 0.2 €/día, sin penalización los primeros 3 días

---

### 🗂️ ORGANIZACIÓN DEL CÓDIGO (paquete: `gestionBibliotecaApp`)

1. **Principal.java**

   * Contiene el `main`
   * Controla entrada por teclado
   * Maneja menú, excepciones y validaciones

2. **GestionBiblioteca.java**

   * Almacena hasta 150 libros en un array
   * Métodos:

     * `boolean registrarLibro(Libro l, Persona p)`
     * `String buscarLibro(String isbn)`
     * `void listarLibros()`
     * `boolean prestarLibro(String isbn, Persona persona)`
     * `double calcularPenalizacion(String isbn, int diasRetraso)`

3. **Persona.java**

   * Getters, setters y constructor

4. **Paquete `libro`**

   * Superclase `Libro` (abstracta):

     * atributos comunes, método `String informacionComun()`, etc.
   * Subclases: `Novela`, `LibroTexto`, `Comic`
   * Interfaz `Prestable`

---

### 🛑 CONDICIONES Y RESTRICCIONES

* Validar DNI y ISBN con regex antes de registrar
* Los libros se registran como disponibles y sin prestatario
* Si el ISBN ya existe, lanzar excepción
* Si un libro ya está prestado, no puede volver a prestarse
* Mostrar menú tras cada acción hasta elegir “salir”
* Usar manejo de excepciones y bucles de reintento para entradas erróneas

---

### 🧪 OPCIONES DE PRUEBA

Puedes crear un pequeño conjunto de datos de prueba en el `main`, o permitir toda la entrada por consola como se especifica en el enunciado.

---

¿Quieres que te genere el **código base** para este examen también?
