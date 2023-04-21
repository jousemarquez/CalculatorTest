<a name="br1"></a>PRACTICA DE JUNIT EN INTELLLIJ

Introducción a JUnit Objetivo: el objetivo de esta práctica es que el participante cree unaclase Java con un conjunto de métodos y genere y ejecute un caso de prueba (TestCase)para probar los métodos de dicha clase usando JUnit desde el IDE INTELLIJ.

La clase que se va a construir es una calculadora sencilla, en un principio con las cuatrooperaciones básicas: suma, resta, multiplicación y división usando dos argumentos. Pasos aseguir:

1\. Crear la clase Calculadora con las funcionalidades de suma, resta,multiplicación y división usando sólo dos argumentos.

Crear un nuevo proyecto de tipo Java Application.

Para esto se debe seleccionar en el menú File | New Project… .

\- En la ventana emergente New Project se debe seleccionar la categoría Java - Pulsar el botón “Next>”.

\- En la ventana emergente New Java Application colocar en el campo Project Name el valor Calculadora.

\- Pulsar el botón “Finish”. Entonces aparecerá el proyecto Calculadora con sus carpetasasociadas.




<a name="br2"></a>- En el proyecto calculadora, en la carpeta Project seleccionar el paquete calculadora.

\- Con el botón derecho del ratón y seleccionar: New | Java Class… .

\- En la ventana emergente New Java Class, escribir Calculator en el campo Class Name elvalor y pulsar el botón “Finish”.

\- Entonces se abrirá la pestaña correspondiente al esqueleto de código de la claseCalculator.

Escribir los métodos de la clase Calculator.




<a name="br3"></a>public class Calculator {

public double add(double number1, double number2){

` `return number1 + number2;}

public double subtract(double number1, double number2){ return number1 - number2;

}

public double multiply(double number1, double number2){

return number1 \* number2; }

public double divide(double number1, double number2){

` `return number1 / number2;}

}

Pulsar para salvar el trabajo realizado hasta ahora.- Construir el proyecto para verificar que no tiene errores seleccionando en el menú: Build| Build Main Project.

\- En la ventana Output se podrá ver el resultado de la acción Build, la cual debería serexitosa. De lo contrario se debe revisar el código en busca de los errores indicados en laventana Output, corregirlos y volver a construir el proyecto.

2\. Crear la estructura adecuada para crear los TEST.

\- Para crear los test de manera ordenada, lo mejor es ubicar los test dentro de una carpetaaparte, para ello botón derecho sobre proyecto Calculadora, y crear nuevo directorio, alque llamaremos TEST.




<a name="br4"></a>Pero si creamos ahora los test, por defecto no los ubicará dentro de la carpeta test. Letenemos que decir a IntelliJ, que los test que vayamos a generar se ubicarán en esta carpeta.




<a name="br5"></a>En la estructura de los modulos, seleccionamos la carpeta test, y la marcamos como lafuente donde se generarán los test automáticamente: Tests

Ahora cuando generemos los test automáticamente, se ubicarán aquí por defecto.

Pero todavía no podemos crear los test automáticamente, ya que no hemos incluido laslibrerías adecuadas:

Para ello seguiremos los siguientes pasos:https://www.jetbrains.com/help/idea/testing.html#add-testing-libraries

Manually add a testing library

Follow these steps to add a library if you're building your project with the native IntelliJ IDEAbuilder:

1\. From the main menu, select File | Project Structure (⌘ ;) or click on the toolbar.

2\. Under Project Settings, select Libraries and click | From Maven.

3\. In the dialog that opens, specify the necessary library artifact, for example: org.junit.jupiter:junit-jupiter:5.4.2 or org.testng:testng:6.14.3.Apply the changes and close the dialog.




<a name="br6"></a>2. Crear los TEST

Con las librerías y con la estructura adecuadas, ahora ya sí, podemos crear los test que nosservirán para verificar que nuestro código hace lo que tiene que hacer.

Para ello, crearemos los @Test necesarios en cada uno de los métodos, y utilizaremos losasserts oportunos.

Para el ejemplo de la suma, podemos probar que la suma de dos números 0,0 dará comoresultado 0,0:

Desde la clase Calculator




<a name="br7"></a>Y creamos el test:




<a name="br8"></a>Se nos genera un código de Test en la carpeta TEST,

En donde el código que vamos a probar siempre está precedido por @Test

` `En este caso hemos querido probar que la suma de dos 0,0 dá como resultado 0,0.Cuando ejecutamos la prueba, nos dice que la prueba ha pasado satisfactoriamente.
