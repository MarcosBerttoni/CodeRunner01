import java.awt.*;
import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws calcularTamañoException {
        //cadena();
        //palabra();
        //positivoNegativCero();
        //esBisiesto();
        //mayores();
        //diasSemana();
        //vocalConsonante();
        //esParImpar();
        //sumaNumeros();
        //factorialNumero();
        //esPrimo();
        //invertirPalabra();
        //adivinarNumero();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Libro libro = new Libro("Programacion en JAVA","Marcos Berttoni", 2024,250);
//        Libro libro2 = new Libro("Historia de la Educacion","Pedro Picapiedras",1900,50);
//        Libro libro1 = new Libro("Voces Anonimas","Jhony",2000,120);
//        ArrayList<Libro> libros = new ArrayList<Libro>();
//        libros.add(libro);
//        libros.add(libro2);
//        libros.add(libro1);
//        for (Libro lib : libros) {
//            lib.mostrarInformacion();
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Estudiante estudiante1 = new Estudiante("Marcos","Berttoni", "LTI2");
//        Estudiante estudiante2 = new Estudiante("Pedro","Picapiedras", "LTI2");
//        Estudiante estudiante3 =  new Estudiante("Jhony","Berttoni", "LTI2");
//        ArrayList<Estudiante> ListaEstudiantes = new ArrayList<Estudiante>();
//        ListaEstudiantes.add(estudiante1);
//        ListaEstudiantes.add(estudiante2);
//        ListaEstudiantes.add(estudiante3);
//        for (Estudiante estudiante : ListaEstudiantes) {
//            estudiante.mostrarDatosEstudiantes();
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del estudiante para cambiar de carreta: ");
//        String nombre = sc.nextLine();
//        System.out.println("Ingrese la nueva carrera del estudiante: ");
//        String carrera = sc.nextLine();
//        for (Estudiante estudiante : ListaEstudiantes) {
//            if (estudiante.getNombre().equals(nombre)) {
//                estudiante.cambiarCarrera(carrera);
//            }
//        }
//        for (Estudiante estudiante : ListaEstudiantes) {
//            estudiante.mostrarDatosEstudiantes();
//        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////777
//        System.out.println("Programa que calcula Area y Perimetro de un Circulo");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese RADIO del Circulo: ");
//        double radio = sc.nextDouble();
//        Circulo c = new Circulo(radio);
//        double area = c.calcularArea();
//        double perimetro = c.calcularPerimetro();
//        System.out.println("El Area del Circulo, con el radio: "+radio+" es igual a: "+area);
//        System.out.println("El Perimetros del Circulo, con el radio: "+radio+" es igual a: "+perimetro);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println("Clase Padre Figura, donde heredan Circulo y Cuadrado los Metodos CalcularArea() " +
//                "y CalcularPerimetro ");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese valor: ");
//        double valor = sc.nextDouble();
//        Figura figura = new Circulo(valor);
//        Figura figura1 = new Cuadrado(valor);
//        System.out.println("Area de la Figura: "+figura.calcularArea());
//        System.out.println("Perimetro de la Figura: "+figura.calcularPerimetro());
//        System.out.println("Area de la Figura: "+figura1.calcularArea());
//        System.out.println("Perimetro de la Figura: "+figura1.calcularPerimetro());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//          System.out.println("Clases Padre Vehiculo y Automovil hereda de Vehiculo");
//          Vehiculo vehiculo = new Automovil("Ford","RANGER", "GRIS");
//          Vehiculo vehiculo2 = new Automovil("Ford","RANGER", "ROJO");
//          Vehiculo vehiculo3 = new Automovil("Toyota","HYLUX", "NEGRO");
//          ArrayList<Vehiculo> vehiculos = new ArrayList<>();
//          vehiculos.add(vehiculo);
//          vehiculos.add(vehiculo2);
//          vehiculos.add(vehiculo3);
//          for (Vehiculo v : vehiculos) {
//              System.out.println("\n"+v.toString());
//          }
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Ingresa un nuevo Automovil");
//          System.out.print("Marca del vehiculo: ");
//          String marca = sc.nextLine();
//          System.out.print("Modelo: ");
//          String modelo = sc.nextLine();
//          System.out.print("Color: ");
//          String color = sc.nextLine();
//          Vehiculo v = new Automovil(marca,modelo,color);
//          vehiculos.add(v);
//          for (Vehiculo v2 : vehiculos) {
//              v2.mostrarDatos();
//          }

        ///////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Clase Persona y Direccion, donde Persona tiene un Objeto Direccion en sus atributos" +
//                "generando una relacion de composicion");
//        Direccion direccion = new Direccion("San Antonio, Ruta 31 km 13");
//        Direccion direccion1 = new Direccion("Barrio Albisu");
//        Direccion direccion2 = new Direccion("Barrio Tres Marias");
//        Personal persona1 = new Personal("Marcos","Berttoni",35,direccion);
//        Personal persona2 = new Personal("Matias","Lopez",25,direccion1);
//        Personal persona3 = new Personal("Lucas","Furtado",12,direccion2);
//        ArrayList<Personal> personas = new ArrayList<Personal>();
//        personas.add(persona1);
//        personas.add(persona2);
//        personas.add(persona3);
//        for (Personal personal : personas) {
//            personal.mostrarDatos();
//        }

        ///////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Define una clase `Animal` con un método `hacerSonido()`. Luego, crea clases derivadas\n" +
//                "como `Perro` y `Gato` que heredan de `Animal` y sobrescriben el método `hacerSonido()`\n" +
//                "con sonidos específicos para cada animal.");
//
//        Animal gato = new Gato();
//        Animal perro = new Perro();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(gato);
//        animals.add(perro);
//        for (Animal animal : animals) {
//            System.out.println("--------------------------");
//            animal.hacerSonido();
//        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Crea una interfaz `Imprimible` con un método `imprimir()`. Luego, define clases como\n" +
//                "`Documento`, `Foto` y `Video` que implementan la interfaz. Utiliza el polimorfismo para\n" +
//                "imprimir diferentes tipos de objetos sin conocer su tipo exacto");
//
//        Imprimible documento = new Documento("Testing",75);
//        Imprimible foto = new Foto("Foto familiar","1080x720");
//        Imprimible video = new Video("CAIF",12);
//        ArrayList<Imprimible> imprimir = new ArrayList<>();
//        imprimir.add(documento);
//        imprimir.add(foto);
//        imprimir.add(video);
//        for (Imprimible imp : imprimir) {
//            imp.imprimir();
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Realiza la sobrecarga de constructores en las clases derivadas para permitir la creación de\n" +
//                "instancias con información adicional (por ejemplo, canto para el canario y envergadura para\n" +
//                "el águila). Luego, en el método main, crea instancias de Canario y Aguila y muestra sus\n" +
//                "atributos y llama a sus métodos específicos");
//
//        Aguila aguila = new Aguila("Aguila","blanca",12);
//        Canario canario = new Canario("Canario Luna", "Amarillo", "siiiuuuuuu");
//        System.out.println(aguila.toString());
//        aguila.volarAlto();
//        System.out.println(canario.toString());
//        canario.cantar();


        ////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Crea instancias de las clases `Guerrero` y `Mago` con diferentes configuraciones y\n" +
//                "muestra cómo funcionan sus métodos específicos. Utiliza la sobrecarga de constructores\n" +
//                "para permitir la creación de personajes con información adicional según su tipo.");
//
//        Guerrero guerrero = new Guerrero("Guerrero fuego",100,1000);
//        Mago mago = new Mago("Gandalf",150,200000);
//        mago.lanzarHechizo();
//        guerrero.atacar();
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Sistema de Registro de Empleados\n" +
//                "En el contexto de un sistema de registro de empleados para una empresa, se desea\n" +
//                "implementar la clase `Empleado` con funcionalidades diversas. La clase debe tener un\n" +
//                "constructor que permita inicializar el nombre y el salario base de un empleado");
//
//        Empleado empleado = new Empleado("Marcelo",50000);
//        Empleado empleado2 = new Empleado("Juan",45000);
//        empleado.calcularSalarioNeto();
//        empleado2.calcularSalarioNeto();
//        empleado.calcularSalarioNeto(15000);
//        empleado2.calcularSalarioNeto(23000);
//        empleado2.mostrarInformacion();
//        empleado2.mostrarInformacion();
/////////////////////////////////////////MODULO 3 /////////////////////////////////////////////////////////////
//        System.out.println("Crear una lista de strings y mostrar su contenido");
//        LinkedList<String> listaString = new LinkedList<>();
//        listaString.add("hola");
//        listaString.add("chau");
//        listaString.add("otro texto");
//        for (int i = 0; i <= listaString.size()-1; i++) {
//            System.out.println(listaString.get(i));
//        }
//        System.out.println("Buscar un elemento en una lista ");
//        System.out.println("Ingresa palabra a buscar: ");
//        Scanner sc = new Scanner(System.in);
//        String palabra = sc.nextLine();
//        for (int i = 0; i <= listaString.size()-1; i++) {
//            if (listaString.get(i).equals(palabra)){
//                System.out.println(listaString.get(i)+" esta en la lista");
//            }
//        }
//        System.out.println("Buscar el elemento en una lista para eliminarlo ");
//        System.out.println("Ingresa palabra a buscar: ");
//        String eliminar = sc.nextLine();
//        for (int i = 0; i <= listaString.size()-1; i++) {
//            if (listaString.get(i).contains(eliminar)){
//                listaString.remove(i);
//                System.out.println(eliminar+" eliminado en la lista");
//            }
//        }
//        Iterator<String> it = listaString.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//////////////////////////////ARRAYS //////////////////////////////////////////////////////////77
//        int[] lista = {1,3,4,5,7,9,0,10};
//        int suma = 0;
//        for (int i = 0; i < lista.length-1; i++) {
//            System.out.print(lista[i]+" - ");
//        }
//
//        for (int i = 0; i < lista.length-1; i++) {
//            suma += lista[i];
//        }
//        System.out.println("\nLa suma total de los elementos del arrays: "+suma);

        ///////////////////////////////////////////////////////////////////////////////////7777
//        String[] listaCadena = {"Hola","Mundo","Java","Programacion"};
//        for (int i = 0; i < listaCadena.length; i++) {
//            System.out.println(listaCadena[i]+" --> largo palabra: "+listaCadena[i].length());
//        }
        //////////////////////////////////////////////////////////////////////////////////////7
//        int[][] matrizEntero = {{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < matrizEntero.length; i++) {
//            for (int j = 0; j < matrizEntero[i].length; j++) {
//                System.out.print(matrizEntero[i][j] + " - ");
//            }
//            System.out.println();
//        }

        /////////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println(" Ordenamiento Burbuja (Bubble Sort):\n" +
//                "- Implementa el algoritmo de ordenamiento burbuja en Java para ordenar un array de\n" +
//                "enteros de menor a mayor.");
//        int[] listaEnteros = {2,1,5,6,3,9,10,21,33,8,90,65,43,22,46,67};
//        System.out.println("Lista desordenada: ");
//        for (int i=0; i<listaEnteros.length; i++){
//            System.out.print(listaEnteros[i]+" - ");
//        }
//
//        for (int i = 0; i < listaEnteros.length-1; i++) {
//            for (int j = 0; j < listaEnteros.length-i-1; j++) {
//                if (listaEnteros[j] > listaEnteros[j+1]) {
//                    int temp = listaEnteros[j];
//                    listaEnteros[j] = listaEnteros[j+1];
//                    listaEnteros[j+1] = temp;
//                }
//            }
//        }
//        System.out.println("\nLista Ordenada:");
//        for (int i=0; i<listaEnteros.length; i++){
//            System.out.print(listaEnteros[i]+" - ");
//        }

        //////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println("Ordenamiento por Selección (Selection Sort):\n" +
//                "- Implementa el algoritmo de ordenamiento por selección en Java para ordenar un array\n" +
//                "de enteros de mayor a menor.");
//        int[] listaEnteros = {2,1,5,6,3,9,10,21,33,8,90,65,43,22,46,67};
//        System.out.println("Lista desordenada: ");
//        for (int i=0; i<listaEnteros.length; i++){
//            System.out.print(listaEnteros[i]+" - ");
//        }
//        System.out.println();
//        for (int i=0; i<listaEnteros.length; i++){
//            int minIndex = i;
//            for (int j=i+1; j<listaEnteros.length; j++){
//                if (listaEnteros[j]>listaEnteros[minIndex]){
//                    minIndex = j;
//                }
//            }
//            int temp = listaEnteros[minIndex];
//            listaEnteros[minIndex] = listaEnteros[i];
//            listaEnteros[i] = temp;
//        }
//        System.out.println("Lista ordenada: ");
//        for (int i=0; i<listaEnteros.length; i++){
//            System.out.print(listaEnteros[i]+" - ");
//        }
        ///////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Búsqueda Binaria (Binary Search):\n" +
//                "- Implementa el algoritmo de búsqueda binaria en Java para encontrar la posición de un\n" +
//                "elemento en un array ordenado de enteros. Asegúrate de manejar el caso en el que el\n" +
//                "elemento no esté presente en el array.");
//
//        int[] listaEnteros = {1,3,6,8,10,11,14,17,19,21,22,26,29,31,33,44,55,66,77,89,90};
//        for (int i=0; i<listaEnteros.length; i++){
//            System.out.print(listaEnteros[i]+" - ");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nIngrese numero a buscar: ");
//        int num = sc.nextInt();
//
//        if (binarySearch(listaEnteros,num) == -1){
//            System.out.println("El numero "+num+" no esta en la lista");
//        }else{
//            System.out.println("Se encuentra en la posicion "+binarySearch(listaEnteros,num)+" el numero: "+listaEnteros[binarySearch(listaEnteros,num)]);
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Ordenamiento por Inserción (Insertion Sort):\n" +
//                "- Implementa el algoritmo de ordenamiento por inserción en Java para ordenar un array de\n" +
//                "cadenas de caracteres en orden alfabético.\n\n");
//        String[] lista = {"Java","Programacion","Testing","Base de Datos","ARM","Ingles"};
//        System.out.println("\nLista Desordena ");
//        for(String l:lista){
//            System.out.print(l+" - ");
//        }
//        ordenar(lista);
//        System.out.println("\nLista Ordena ");
//        for(String l:lista){
//            System.out.print(l+" - ");
//        }
        ///////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Búsqueda Secuencial (Sequential Search):\n" +
//                "- Implementa el algoritmo de búsqueda secuencial en Java para buscar un elemento en\n" +
//                "un array de enteros no ordenado. Devuelve la posición del elemento si se encuentra, o -1 si\n" +
//                "no está presente.");
//        int[] listaEnteros = {1,3,6,8,10,11,14,17,19,21,22,26,29,31,33,44,55,66,77,89,90};
//        System.out.println("Lista de enteros");
//        for(int l:listaEnteros){
//            System.out.print(l+" - ");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\nIngrese numero a buscar: ");
//        int num = sc.nextInt();
//        if(sequentialSearch(listaEnteros,num) != -1){
//            System.out.println("Se encontro el numero : "+ num+" en la posicion : "
//                    + sequentialSearch(listaEnteros,num)+" de la lista");
//        }else {
//            System.out.println("No esta en numero buscado");
//        }

        //////////////////////////MODULO 4 //////////////////////////////////////////////////////77
//        System.out.println("Calculadora de Áreas\n" +
//                "Crea una interfaz llamada `Calculable` con los métodos `calcularArea` y `calcularPerimetro`.\n" +
//                "Implementa esta interfaz en las clases `Circulo`, `Rectangulo` y `Triangulo`.\n");
//        Circulo2 circulo2 = new Circulo2(5);
//        Cuadrado2 cuadrado2 = new Cuadrado2(12);
//        Rectangulo rectangulo = new Rectangulo(12,5);
//        System.out.println("Area del Rectangulo: "+rectangulo.calcularArea());
//        System.out.println("Perimetro del Rectangulo: "+rectangulo.calcularPerimetro());
//        System.out.println("Area del Circulo: "+circulo2.calcularArea());
//        System.out.println("Perimetro del Circulo: "+circulo2.calcularPerimetro());
//        System.out.println("Area del Cuadrado: "+cuadrado2.calcularArea());
//        System.out.println("Perimetro del Cuadrado: "+cuadrado2.calcularPerimetro());
/////////////////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println("Ordenamiento de Números\n" +
//                "Define una interfaz llamada `Ordenable` que tenga un método llamado `ordenarNumeros`\n" +
//                "que toma un arreglo de enteros y lo ordena de menor a mayor. Implementa esta interfaz en\n" +
//                "una clase llamada `OrdenadorNumeros` utilizando un algoritmo de ordenamiento como el\n" +
//                "de burbuja.\n");
//        int[] listaEnteros = {2,1,5,6,3,9,10,21,33,8,90,65,43,22,46,67};
//        OrdenadorNumeros ordenadorNumeros = new OrdenadorNumeros();
//
//        System.out.println("Lista Desordenada!");
//        ordenadorNumeros.mostrarNumeros(listaEnteros);
//        System.out.println("\nLista Ordenada!");
//        ordenadorNumeros.ordenarNumeros(listaEnteros);
//        ordenadorNumeros.mostrarNumeros(listaEnteros);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println("Sistema de Archivos\n" +
//        "Crea una clase abstracta llamada `Archivo` con atributos como `nombre` y `tamaño`. Luego,\n" +
//        "define clases concretas como `Documento` y `Carpeta` que hereden de `Archivo`. La\n" +
//        "carpeta debe contener una lista de archivos. Implementa un método abstracto\n" +
//        "`calcularEspacioOcupado` en la clase `Archivo` que sea implementado en las clases hijas.\n");
//        Documento2 documento2 = new Documento2("Trabajo final Testing", 12);
//        Documento2 documento3 = new Documento2("Trabajo BD", 0);
//        Documento2 documento4 = new Documento2("Trabajo JAVA", 30);
//        LinkedList<Archivo> listaArchivos = new LinkedList<Archivo>();
//        listaArchivos.add(documento2);
//        listaArchivos.add(documento3);
//        listaArchivos.add(documento4);
//        Carpeta carpeta = new Carpeta("Material Varios");
//        carpeta.mostrarArchivos(listaArchivos);
//        double tamañoTotal = 0;
//        try {
//            for (Archivo archivo : listaArchivos) {
//                tamañoTotal += archivo.calcularEspacioOcupado();
//            }
//        }catch (calcularTamañoException e){
//            throw new calcularTamañoException();
//        }
//        System.out.println("Tamaño total de la carpeta: "+carpeta.nombre+" es: "+tamañoTotal);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del archivo a buscar ");
//        String nombreArchivo = sc.nextLine();
//
//        for (Archivo archivo : listaArchivos) {
//            if (archivo.nombre.equals(nombreArchivo)) {
//                System.out.println("El Archivo: "+archivo.nombre+" es: "+carpeta.nombre);
//            }
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
//        System.out.println("Figuras 3D\n" +
//                "Define una clase abstracta llamada `Figura3D` que tenga un método abstracto\n" +
//                "`calcularVolumen`. Luego, crea clases concretas como `Esfera`, `Cubo` y `Cono` que\n" +
//                "hereden de `Figura3D`. Implementa el método `calcularVolumen` en cada clase concreta.\n");
//
//        Cono cono = new Cono(10,5);
//        Esfera esfera =  new Esfera(16);
//        Cubo cubo = new Cubo(10);
//        System.out.println("Volumen del Cono: "+cono.calcularVolumen());
//        System.out.println("Volumen del Esfera: "+esfera.calcularVolumen());
//        System.out.println("Volumen del Cubo: "+cubo.calcularVolumen());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//        boolean continuar = true;
//
//        try (FileWriter writer = new FileWriter("estudiantes.txt", true)) {
//            while (continuar) {
//                try {
//                    System.out.print("Ingrese el nombre del estudiante: ");
//                    String nombre = scanner.nextLine();
//
//                    System.out.print("Ingrese la edad del estudiante: ");
//                    int edad = Integer.parseInt(scanner.nextLine());
//                    if (edad < 0) {
//                        throw new IllegalArgumentException("La edad no puede ser negativa.");
//                    }
//
//                    System.out.print("Ingrese la calificación del estudiante: ");
//                    double calificacion = Double.parseDouble(scanner.nextLine());
//                    if (calificacion < 0 || calificacion > 10) {
//                        throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
//                    }
//
//                    Estudiante estudiante = new Estudiante(nombre, edad, calificacion);
//                    writer.write(estudiante.toString() + "\n");
//
//                    System.out.print("¿Desea ingresar otro estudiante? (s/n): ");
//                    String respuesta = scanner.nextLine();
//                    if (!respuesta.equalsIgnoreCase("s")) {
//                        continuar = false;
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Error: " + e.getMessage());
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error al escribir en el archivo: " + e.getMessage());
//        }
//
//        System.out.println("Registro de estudiantes finalizado.");




    }
    public static int sequentialSearch(int[] array, int xValor){
        for (int i=0;i<=array.length-1;i++){
            if(array[i] == xValor){
                return i;//retorna la posicion en el array
            }
        }
        return -1;
    }

    public static void ordenar(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            // Mover los elementos del array[0..i-1] que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static int binarySearch(int[] listaEnteros, int num ){
        int izq = 0;
        int der = listaEnteros.length-1;
        while (izq <= der) {
            int medio = izq + (der-izq)/2;
            if (listaEnteros[medio] == num){
                return medio;
            } else if (listaEnteros[medio] < num) {
                izq = medio+1;
            }else {
                der = medio-1;
            }
        }
        return -1;
    }

    public static void adivinarNumero(){
        System.out.println("El juego consiste en adivinar que numero del '0 al 10' estoy 'PENSADO'" +
                "Te ayudaré si estas cerca de adivinar!");


        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroAadivinar = random.nextInt(10)+1;
        boolean adivinado = false;

        while(!adivinado){
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();

            if(numeroAadivinar == numero){
                adivinado = true;
                System.out.println("Felicidades has adivinado!!");
            } else if (numeroAadivinar > numero) {
                System.out.println("MAS!!..");
            } else {
                System.out.println("MENOS!!..");
            }
        }
    }
    public static void invertirPalabra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el palabra: ");
        String palabra = sc.nextLine();
        for (int i = palabra.length()-1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }

    public static void esPrimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        Boolean esprimo = buscarPrimo(num);
        if(esprimo){
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


    }
    public static boolean buscarPrimo(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void factorialNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            //System.out.println(numero+" * "+ fact+" = "+i*fact);
            fact = fact * i;
        }
        System.out.println("Factorial del numero es: "+fact);
    }
    public static void sumaNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int suma = 0;
        for(int i = 1; i <= num; i++){
            suma += i;
            System.out.println(suma);
        }
        System.out.println("La suma desde 1 hasta el nro: "+num+" es: "+suma);
    }

    public static void esParImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
    public static void vocalConsonante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca letra: ");
        String letra = sc.nextLine();
        switch (letra){
            case "a": case "e": case "i": case "o": case "u":
                System.out.println("Es una Vocal");
                break;
            case "d": case "f": case "g": case "h": case "j": case "k":case "l": case "m": case "n": case "p":
            case "q": case "r": case "s": case "t": case "v": case "w": case "x": case "y": case "z":
                System.out.println("Es una Consonante");
                break;
                default: System.out.println("ERROR, ingreso no valido");
        }
    }
    public static void diasSemana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero del dia de la semana: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                    System.out.println("Miercoles");
                    break;
            case 5:
                        System.out.println("Jueves");
                        break;
            case 6:
                            System.out.println("Viernes");
                            break;
            case 7:
                                System.out.println("Sabado");
                                break;
            default:
                System.out.println("Error, ingrese numero entre 1 - 7 - Gracias");
                diasSemana();
        }
    }
    public static void mayores(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero: ");
      int num = sc.nextInt();
      System.out.println("Ingrese otro numero: ");
      int num2 = sc.nextInt();
      System.out.println("Ingrese otro numero: ");
      int num3 = sc.nextInt();
      if (num > num2 && num > num3){
          System.out.println("El numero mayor es: " + num);
        } else if (num2 > num && num2 > num3){
          System.out.println("El numero mayor es: " + num2);
      } else {
          System.out.println("El numero mayor es: " + num3);
      }

    }
    public static void esBisiesto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese año: ");
        int anio = sc.nextInt();
        System.out.println("El año "+anio +" es bisiesto => "+isLeapYear(anio));

    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Es divisible por 100, verificar si es divisible por 400
                return year % 400 == 0;
            } else {
                // No es divisible por 100, entonces es bisiesto
                return true;
            }
        } else {
            // No es divisible por 4, entonces no es bisiesto
            return false;
        }
    }
    public static void positivoNegativCero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num2 = sc.nextInt();
        if(num2<0){
            System.out.println("El numero en Negativo");
        } else if (num2>0) {
            System.out.println("El numero en Positivo");
        }else System.out.println("El numero en CERO");

    }
    public static void cadena(){
        String nombre1 = "Marcos";
        String nombre2 =  new String("Marcos");
        if (nombre1.equals(nombre2)) {
            System.out.println("Son iguales");
        }else {System.out.println("No son iguales");}

    }

    public static void palabra(){
        String palabra = "MARCOS";
        System.out.println(palabra.charAt(0));
        System.out.println(palabra.charAt(1));
        System.out.println(palabra.charAt(2));
        System.out.println(palabra.charAt(3));
        System.out.println(palabra.charAt(4));
        System.out.println(palabra.charAt(5));
        System.out.println("Cantidad de caracteres de la palabra: "+palabra.length());
    }
}