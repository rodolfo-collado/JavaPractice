## 1. Fundamentos de programación con Java

### Ejercicios:
1. (Sencillo) Crea un programa que muestre tu nombre, edad y lenguaje de programación favorito.
2. (Sencillo) Declara variables de todos los tipos primitivos y muestra sus valores.
3. (Sencillo) Solicita dos números y muestra su suma, resta, multiplicación, división y residuo.
4. (Sencillo) Convierte una temperatura de grados Celsius a Fahrenheit.
5. (Sencillo) Solicita un número e indica si es positivo, negativo o igual a cero.
6. (Intermedio) Solicita una calificación y muestra su categoría utilizando `switch`: excelente, aprobado o reprobado.
7. (Intermedio) Muestra la tabla de multiplicar de un número utilizando un ciclo `for`.
8. (Intermedio) Solicita números hasta que el usuario introduzca `0` y después muestra su suma (usa `while`).
9. (Difícil) Crea un menú con `do-while` para sumar, restar, multiplicar o dividir dos números. El menú debe repetirse hasta seleccionar “Salir”.
10. (Difícil) Crea un juego para adivinar un número aleatorio entre 1 y 100. Indica si cada intento es mayor o menor y limita la partida a siete intentos.

---

## 2. Métodos y organización del código

### Ejercicios:
1. (Sencillo) Crea un método que reciba un nombre y muestre un saludo personalizado.
2. (Sencillo) Crea un método que reciba dos números y devuelva su suma.
3. (Sencillo) Crea métodos para calcular el área de un círculo, rectángulo y triángulo.
4. (Sencillo) Crea un método que determine si un número es par.
5. (Sencillo) Sobrecarga un método llamado `calcularArea()` para que funcione con diferentes figuras.
6. (Intermedio) Crea un método que reciba tres números y devuelva el mayor sin utilizar `Math.max()`.
7. (Intermedio) Calcula el factorial de un número mediante recursividad.
8. (Intermedio) Escribe un programa con errores lógicos y utiliza el depurador del IDE para inspeccionar variables y corregirlo.
9. (Difícil) Construye una calculadora modular donde cada operación esté implementada en un método diferente y los datos sean validados antes de calcular.
10. (Difícil) Crea un sistema de conversión con métodos para temperatura, distancia y peso. Organiza el menú, la lectura de datos y los cálculos en métodos separados.

---

## 3. Arreglos y texto

### Ejercicios:
1. (Sencillo) Guarda diez números en un arreglo y calcula su suma y promedio.
2. (Sencillo) Encuentra el número mayor y el menor de un arreglo sin utilizar la clase `Arrays`.
3. (Sencillo) Muestra los elementos de un arreglo en orden inverso.
4. (Sencillo) Solicita una palabra y cuenta cuántas vocales contiene utilizando métodos de `String`.
5. (Sencillo) Ordena un arreglo con `Arrays.sort()` y busca un elemento con `Arrays.binarySearch()`.
6. (Intermedio) Elimina los espacios sobrantes de una frase y construye el resultado utilizando `StringBuilder`.
7. (Intermedio) Crea una matriz de 3×3 y calcula la suma de cada fila, cada columna y la diagonal principal.
8. (Intermedio) Determina si una palabra o frase es un palíndromo (ignora espacios, mayúsculas y signos básicos).
9. (Difícil) Crea un programa que detecte los elementos repetidos de un arreglo y muestre cuántas veces aparece cada uno.
10. (Difícil) Programa un juego de tres en raya utilizando una matriz. Debe validar movimientos y detectar victorias, empates y posiciones ocupadas.

---

## 4. Programación orientada a objetos

### Ejercicios:
1. (Sencillo) Crea una clase `Persona` con nombre, edad y un método `presentarse()`.
2. (Sencillo) Crea una clase `Producto` con dos constructores diferentes y utiliza `this` para inicializar sus atributos.
3. (Sencillo) Crea una clase `CuentaBancaria` con atributos privados y métodos para depositar, retirar y consultar el saldo.
4. (Sencillo) Agrega a una clase un atributo `static` que permita contar cuántos objetos se han creado.
5. (Sencillo) Crea un `enum` llamado `EstadoPedido` y úsalo dentro de una clase `Pedido`.
6. (Intermedio) Diseña una clase `Empleado` y dos subclases, `EmpleadoFijo` y `EmpleadoPorHora`, que sobrescriban el método `calcularSalario()`.
7. (Intermedio) Crea una interfaz `Pagable` e impleméntala en las clases `Factura` y `Empleado`.
8. (Intermedio) Modela un pedido mediante composición usando las clases `Cliente`, `Producto`, `DetallePedido` y `Pedido`.
9. (Difícil) Crea un sistema de biblioteca con una clase abstracta `MaterialBiblioteca` y subclases para libros, revistas y películas. Implementa préstamos y devoluciones mediante polimorfismo.
10. (Difícil) Diseña un estacionamiento orientado a objetos con vehículos, espacios, tarifas y tickets. Utiliza encapsulamiento, herencia, interfaces, enumeraciones y composición.

---

## 5. Manejo de errores

### Ejercicios:
1. (Sencillo) Solicita un número y controla con `try-catch` el ingreso de texto no numérico.
2. (Sencillo) Realiza una división y captura el error producido cuando el divisor sea cero.
3. (Sencillo) Accede a una posición de un arreglo y controla posiciones inexistentes.
4. (Sencillo) Utiliza `finally` para mostrar un mensaje que se ejecute exista o no una excepción.
5. (Sencillo) Crea un método que lance `IllegalArgumentException` cuando una edad sea negativa.
6. (Intermedio) Crea una excepción personalizada llamada `SaldoInsuficienteException` y úsala en una cuenta bancaria.
7. (Intermedio) Lee un archivo y maneja correctamente una excepción comprobada mediante `throws` y `catch`.
8. (Intermedio) Crea un formulario de registro que valide nombre, correo, edad y contraseña, mostrando un error específico para cada dato inválido.
9. (Difícil) Simula una transferencia bancaria. Si falla cualquier validación, los saldos deben permanecer sin cambios.
10. (Difícil) Procesa una lista de registros con posibles errores. Los registros válidos deben guardarse y los inválidos deben aparecer en un reporte con su posición y causa.

---

## 6. Colecciones y genéricos

### Ejercicios:
1. (Sencillo) Guarda nombres en un `ArrayList` y permite agregarlos, eliminarlos y buscarlos.
2. (Sencillo) Utiliza un `HashSet` para eliminar los números repetidos de una lista.
3. (Sencillo) Crea un `HashMap` que relacione nombres de estudiantes con sus calificaciones.
4. (Sencillo) Simula una fila de atención utilizando una implementación de `Queue`.
5. (Sencillo) Implementa correctamente `equals()` y `hashCode()` en una clase `Producto` y comprueba su comportamiento dentro de un `HashSet`.
6. (Intermedio) Ordena una lista de productos por precio, nombre y cantidad utilizando diferentes `Comparator`.
7. (Intermedio) Crea una clase genérica `Caja<T>` que permita guardar, obtener y reemplazar un elemento.
8. (Intermedio) Utiliza un `Map` para contar la frecuencia de cada palabra dentro de un texto.
9. (Difícil) Crea un sistema de inventario utilizando mapas y listas. Debe permitir registrar productos, actualizar existencias, buscar por categoría y detectar productos agotados.
10. (Difícil) Implementa un repositorio genérico `Repositorio<T, ID>` con operaciones para guardar, buscar, actualizar, eliminar y listar objetos.

---

## 7. Java moderno

### Ejercicios:
1. (Sencillo) Utiliza una expresión lambda para ordenar una lista de nombres alfabéticamente.
2. (Sencillo) Recorre una colección mediante `forEach()` y una referencia a método.
3. (Sencillo) Crea una interfaz funcional para realizar operaciones matemáticas mediante lambdas.
4. (Sencillo) Busca un usuario y devuelve el resultado mediante `Optional`.
5. (Sencillo) Calcula la edad de una persona utilizando `LocalDate` y `Period`.
6. (Intermedio) Utiliza Stream API para filtrar números pares, elevarlos al cuadrado y guardarlos en una nueva lista.
7. (Intermedio) Representa productos mediante un `record` y calcula con streams su precio promedio, el más caro y el más barato.
8. (Intermedio) Agrupa una lista de empleados por departamento y calcula el salario promedio de cada grupo.
9. (Difícil) Diseña una clase inmutable `Dinero` que contenga cantidad y moneda y permita realizar operaciones sin modificar los objetos originales.
10. (Difícil) Procesa una lista de pedidos con streams: elimina cancelados, agrupa por cliente, calcula totales y obtiene los cinco clientes con mayor gasto.

---

## 8. Archivos y persistencia básica

### Ejercicios:
1. (Sencillo) Escribe varias líneas en un archivo de texto y luego léelas desde Java.
2. (Sencillo) Crea una ruta con `Path` y muestra si existe, si es archivo o directorio y cuál es su tamaño.
3. (Sencillo) Crea, copia, mueve y renombra archivos utilizando la clase `Files`.
4. (Sencillo) Guarda una lista de tareas en un archivo y vuelve a cargarla al iniciar el programa.
5. (Sencillo) Serializa un objeto `Usuario` y después deserialízalo para recuperar sus datos.
6. (Intermedio) Convierte un objeto Java a JSON y nuevamente a objeto utilizando Jackson.
7. (Intermedio) Lee un archivo CSV de productos y conviértelo en una colección de objetos.
8. (Intermedio) Crea un administrador de configuración que lea valores desde un archivo y utilice valores predeterminados cuando falten propiedades.
9. (Difícil) Construye un sistema de estudiantes que guarde, cargue, actualice y elimine registros dentro de un archivo JSON.
10. (Difícil) Implementa un repositorio de inventario persistente. Los cambios deben guardarse de forma segura sin corromper el archivo si ocurre un error durante la escritura.

---

## 9. Buen diseño de software

### Ejercicios:
1. (Sencillo) Toma una clase que lea datos, haga cálculos y muestre resultados, y divídela siguiendo el principio de responsabilidad única.
2. (Sencillo) Identifica ejemplos de alto acoplamiento y baja cohesión en un programa y propón una reorganización.
3. (Sencillo) Divide una aplicación de tareas en controlador, servicio y repositorio.
4. (Sencillo) Crea un DTO para transferir los datos públicos de un usuario sin exponer su contraseña.
5. (Sencillo) Separa una entidad `Producto` de su representación de respuesta `ProductoDTO`.
6. (Intermedio) Aplica inyección de dependencias por constructor para conectar un servicio con su repositorio.
7. (Intermedio) Implementa el patrón Factory para crear diferentes tipos de notificaciones.
8. (Intermedio) Implementa el patrón Builder para construir objetos con numerosos campos opcionales.
9. (Difícil) Diseña una aplicación de pedidos aplicando SOLID, arquitectura por capas, DTO, Factory y Repository.
10. (Difícil) Refactoriza un sistema donde las clases dependan directamente de archivos o bases de datos para que dependan de interfaces intercambiables.

---

## 10. Pruebas y herramientas

### Ejercicios:
1. (Sencillo) Crea un repositorio Git, realiza varios commits y recupera el contenido de un commit anterior sin borrar el historial.
2. (Sencillo) Crea un proyecto Maven y ejecuta sus fases principales: `clean`, `compile`, `test` y `package`.
3. (Sencillo) Agrega una dependencia mediante `pom.xml` y úsala dentro del proyecto.
4. (Sencillo) Escribe pruebas con JUnit para métodos de suma, resta, multiplicación y división.
5. (Sencillo) Configura SLF4J y registra mensajes de depuración, información, advertencia y error.
6. (Intermedio) Crea pruebas parametrizadas para validar diferentes correos electrónicos y contraseñas.
7. (Intermedio) Utiliza Mockito para probar un servicio sin conectarlo a su repositorio real.
8. (Intermedio) Lee configuraciones desde variables de entorno y archivos sin guardar contraseñas directamente en el código.
9. (Difícil) Construye una suite de pruebas para un sistema bancario que cubra depósitos, retiros, transferencias, errores y casos límite.
10. (Difícil) Desarrolla un proyecto Maven en una rama, aplica logging y pruebas, ejecuta `mvn verify` y prepara una integración mediante Pull Request.

---

## 11. Bases de datos

### Ejercicios:
1. (Sencillo) Diseña las tablas necesarias para guardar usuarios y sus direcciones, indicando claves primarias y foráneas.
2. (Sencillo) Crea una tabla de productos e inserta al menos diez registros mediante SQL.
3. (Sencillo) Practica operaciones `SELECT`, `INSERT`, `UPDATE` y `DELETE` sobre una tabla de estudiantes.
4. (Sencillo) Consulta productos filtrando por categoría y precio, y ordénalos del más caro al más barato.
5. (Sencillo) Agrupa ventas por categoría y calcula la cantidad vendida y los ingresos totales.
6. (Intermedio) Diseña tablas de clientes, pedidos y productos, y crea consultas con `JOIN` para mostrar pedidos completos.
7. (Intermedio) Normaliza una tabla que mezcle clientes, direcciones, productos y pedidos hasta alcanzar la tercera forma normal.
8. (Intermedio) Conecta Java con una base de datos mediante JDBC y ejecuta operaciones CRUD utilizando consultas parametrizadas.
9. (Difícil) Implementa una transferencia bancaria mediante una transacción. Si una operación falla, ejecuta un `rollback`.
10. (Difícil) Modela un sistema de biblioteca con JPA e Hibernate, incluyendo entidades, relaciones, repositorios y operaciones CRUD.

---

## 12. Fundamentos web antes de Spring Boot

### Ejercicios:
1. (Sencillo) Explica mediante un ejemplo qué responsabilidades pertenecen al cliente y cuáles al servidor.
2. (Sencillo) Relaciona diferentes situaciones con los métodos `GET`, `POST`, `PUT`, `PATCH` y `DELETE`.
3. (Sencillo) Selecciona el código HTTP apropiado para solicitudes exitosas, recursos creados, datos inválidos, accesos prohibidos y recursos inexistentes.
4. (Sencillo) Diseña una petición que utilice parámetros de ruta y otra que utilice parámetros de consulta.
5. (Sencillo) Escribe el JSON necesario para representar un usuario, una dirección y una lista de pedidos.
6. (Intermedio) Diseña los endpoints CRUD de una API REST para administrar canciones y listas de reproducción.
7. (Intermedio) Crea una colección en Postman o Bruno con peticiones, variables, headers y cuerpos JSON.
8. (Intermedio) Diseña una API por capas indicando qué código pertenecería al controlador, servicio, repositorio, DTO y entidad.
9. (Difícil) Diseña el sistema de autenticación y autorización de una API, indicando cómo respondería ante usuarios no autenticados y usuarios sin permisos.
10. (Difícil) Crea una API HTTP básica con `HttpServer` de Java que permita consultar y registrar recursos en formato JSON. Organiza el código por capas y pruébalo con Postman o Bruno.