import com.sun.nio.sctp.AbstractNotificationHandler;
import com.sun.source.tree.WhileLoopTree;

import javax.sound.midi.Soundbank;
import javax.swing.undo.AbstractUndoableEdit;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("1- Crear un una función donde se ingrese un numero n y" +
//                "se muestre su valor + (nro de *). \n" +
//                "Ejemplo:\n" +
//                "1 *\n" +
//                "3 ***\n" +
//                "5 *****");
        //Ejercicio q dado un nro muestro ese valor expresado en *
//        int[] arr = {10,5,6,2};
//        ejercicio1(arr);

        //Ejercicio serie Fibanacci de un nro N
        //fibonacci(10);

        //Ejercicio que busca una palabra en un array de String y devuelve el indice de las coincidencias
        //ejercicio2("Ahora esta entre nos","esta");


      //Ejercicio con Cola Queue #######################
//        Queue<String> cola = new LinkedList<String>();
//        ejercicioCola(cola,"Marcos",1);
//        ejercicioCola(cola,"Marcelo",1);
//        ejercicioCola(cola,"Matias",1);
//        System.out.println(cola);
//        ejercicioCola(cola,"Marcos",2);
//        System.out.println("Cola actualizada: "+cola);

        //Ejercicio dado un Array de enteros devuelvo un array en orden inverso
//        int[] array = {2,4,6,8,10};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        int[] res = inversoArray(array);
//        System.out.println();
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+" ");
//        }

        //Matriz cuadradas donde se muestra la suma de las diagonales
//        int[][] matriz = {{5,2,5},
//                          {4,5,6},
//                          {7,8,9}};
//
//        System.out.println("Suma de la diagonal 1: "+sumaDiagonalesMatrizIzqDer(matriz));
//        System.out.println("Suma de la diagonal 2: "+sumaDiagonalesMatrizDerIzq(matriz));

        //mostrarArray(50);

        //CRUD con HasMap de Persona
//        Persona p1 = new Persona(41301605,"Marcos","Berttoni");
//        Persona p2 = new Persona(44311140,"Jessica","Da Rosa");
//        Persona p3 = new Persona(43006007,"Gian","Pierre");
//        Persona p4 = new Persona(55555555,"Apolo","Creed");
//        HashMap<Integer,Persona> personaPorCedula = new HashMap<>();
//        personaPorCedula.put(p1.getCi(),p1);
//        personaPorCedula.put(p2.getCi(),p2);
//        personaPorCedula.put(p3.getCi(),p3);
//        mostrarHasMapPersona(personaPorCedula);
//        boolean op = true;
//        while(op){
//
//            System.out.println("");
//            System.out.println("#############################");
//            System.out.println("# 1 ----> Agregar   Persona #");
//            System.out.println("# 2 ----> Eliminar  Persona #");
//            System.out.println("# 3 ----> Listar    Persona #");
//            System.out.println("# 4 ----> Modificar Persona #");
//            System.out.println("# 5 ----> Mostrar   Persona #");
//            System.out.println("# 0 ----> S A L I R         #");
//            System.out.println("#############################");
//            System.out.println("Ingrese opcion: ");
//            Scanner sc = new Scanner(System.in);
//            int opcion  = sc.nextInt();
//            if(opcion == 1){
//                System.out.println("Ingrese Cedula Persona: ");
//                int cedula = sc.nextInt();
//                System.out.println("Ingrese Nombre: ");
//                String nombre = sc.next();
//                System.out.println("Ingrese Apellido: ");
//                String apellido = sc.next();
//                Persona persona = new Persona(cedula,nombre,apellido);
//                personaPorCedula.put(persona.getCi(),persona);
//                System.out.println("¡¡Persona agregada con exito!!");
//
//            }else if(opcion == 2){
//                System.out.println("Ingrese Cedula Persona que desea eliminar: ");
//                int cedula = sc.nextInt();
//                if(buscarPersonaPorCedula(personaPorCedula,cedula)!=null){
//                    personaPorCedula.remove(cedula);
//                    System.out.println("¡¡ Persona eliminada con exito!!");
//                }else {
//                    System.out.println("No existe el persona que desea eliminar");
//                }
//
//            }else if(opcion == 3){
//                System.out.println("Ingrese Nro de Cedula de la Persona a buscar: ");
//                Scanner io = new Scanner(System.in);
//                int nroCedula = io.nextInt();
//                if(buscarPersonaPorCedula(personaPorCedula,nroCedula) != null){
//                    System.out.println("La persona con el nro de Cedula es correcto, sus datos son: "+buscarPersonaPorCedula(personaPorCedula,nroCedula).toString());
//                }else {
//                    System.out.println("la persona no existe");
//                }
//            }else if(opcion == 4) {
//                System.out.println("Ingrese Cedula Persona que desea MODIFICAR: ");
//                int cedula = sc.nextInt();
//                if(buscarPersonaPorCedula(personaPorCedula,cedula) != null){
//                    Persona persona = buscarPersonaPorCedula(personaPorCedula,cedula);
//                    System.out.println("Ingrese nuevo nombre: ");
//                    String nombre = sc.next();
//                    System.out.println("Ingrese nuevo apellido: ");
//                    String apellido = sc.next();
//                    persona.setNombre(nombre);
//                    persona.setApellido(apellido);
//                    //personaPorCedula.get(persona.getCi()).setNombre(nombre);
//                } else {
//                    System.out.println("No existe el persona que desea eliminar");
//                }
//
//
//            } else if (opcion==5) {
//                System.out.println("######### L I S T A D O P E R S O N A S ########");
//                mostrarHasMapPersona(personaPorCedula);
//            } else if(opcion == 0){
//                op = false;
//            }
//        }

//    String serie = "123456a";
//    String serie2 = "b123456";
//    String serie3 = "12c456";
//    String serie4 = "01106789";
//    System.out.println("Serie1 : "+validadDato(serie));
//    System.out.println("Serie2 : "+validadDato(serie2));
//    System.out.println("Serie3 : "+validadDato(serie3));
//    System.out.println("Serie4 : "+validadDato(serie4));
        //Escribe una función llamada palíndromo, que dada una cadena de
        //caracteres, compruebe si es palíndromo o no, devolviendo true o false.
        //Los palíndromos son palabras que se leen igual aun estando
        //invertidas.
//        String palabra = "solos";
//        String palabra2 = "martes";
//        System.out.println("Es Palindromo la palabra "+palabra+" es: "+esPalindramo(palabra));
//        System.out.println("Es Palindromo la palabra "+palabra2+" es: "+esPalindramo(palabra2));

        //Escribe una función llamada invertir, que, dado una cadena de
        //caracteres, de vuelta la cadena invierta el orden de sus caracteres, sin
        //usar métodos propios del lenguaje, sólo estructuras de control.
//        String cadena = "Marcos";
//        System.out.println("Invertir cadena "+java.util.Arrays.toString(cadena.toCharArray())+" en: "+invertirCadena(cadena));
//        String cadena2 = "Liceo San Antonio Salto";
//        System.out.println("Invertir cadena "+java.util.Arrays.toString(cadena2.toCharArray())+" en: "+invertirCadena(cadena2));

        //Escribe una función llamada coincidencia, que, dada una palabra, la
        //busque en una frase y devuelva la cantidad de veces que aparece la
        //palabra en la frase. La palabra y la frase deben ser los parámetros de
        //la función.
//        String frase = "el cielo es cielo marron y celeste cielo pero cielo azul";
//        String palabra= "cielo";
//        System.out.println("La cantidad de coincidencias de la palanra: "+palabra+" es: "+coincidenciaFrasePalabra(palabra,frase));


        //Escribe una función llamada cuadrado, que recibe un entero, que
        //dibuje cuadrados con asteriscos en todos los lados, pero con el centro
        //hueco, en base a un parámetro dado.
//        cuadradoAsterisco(4);
//        System.out.println();
//        cuadradoAsterisco(6);

        //Escribe una función llamada maximin que, dado un arreglo de
        //números, indique el máximo valor y, en el caso de que esté repetido,
        //mostrar todas las posiciones en las que se presenta ese valor.
//        int[] nros = {19,42,60,7,60,7,12,30,12,10};
//        maximin(nros);

        //Escribe una función posearch que, dado un arreglo de números y un
        //valor numérico, indique la posición del elemento más cercano.
//        int[] nros={1,2,4,6,8,10,23,4,33,55,66,78,9};
//        System.out.print("Se busca el valor: "+10+" en el arreglo de int: "+java.util.Arrays.toString(nros)+" " +
//                "se encuentra en la posicion mas cercana: "+poSearch(nros,10));


        //Escribe una función llamada intercala, que genera un tercer array con
        //el resultado de la intercalación ordenada. Por ejemplo: los arrays: (10,
        //20, 50), (1, 2, 20, 24, 80), el resultado sería(1, 2, 10, 20, 20, 24, 50,
        //80). Suponer se dispone de dos arrays ordenados.
//        int[] arreglo1 = {1,3,5,7,8,9,10,12,15,17};
//        int[] arreglo2 = {2,4,6,8,10,11,12,14,16,22};
//        System.out.println("Se intercala dos arreglos "+java.util.Arrays.toString(arreglo1));
//    System.out.println(" y el otro arreglo: "+java.util.Arrays.toString(arreglo2));
//        System.out.println("Array intercalado: "+java.util.Arrays.toString(intercala(arreglo1,arreglo2)));

        //Escribe una función llamada esCuadrada, que dada una matriz, primero
        //verifique si la misma tiene contenido (que no sea vacía) y luego
        //verifique si la matriz dada es cuadrada, devolviendo un booleano como
        //resultado.
//        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9},{23,22,233}};
//        int[][] matriz3 = {null};
//        System.out.println("La matriz es cuadrada:"+esCuadrada(matriz));
//        System.out.println("La matriz2 es cuadrada:"+esCuadrada(matriz2));
//        System.out.println("La matriz3 es cuadrada:"+esCuadrada(matriz3));

        //Escribe una función llamada sumarBorde que tome una matriz y
        //devuelva la suma de los elementos en el borde (los elementos de la
        //primera y última fila, y los elementos de la primera y última columna).
//        int[][] matriz = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
//        int[][] matriz2 = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{12,11,13,15}};
//        int[][] matriz3 = {{1,2,3,4,5,6,7},{4,5,6,7,4,5,8},{2,4,6,7,8,9,10},{10,2,4,12,11,13,15}};
//        System.out.println("La suma de las esquinas de la matriz es: "+sumarEsquinas(matriz3));
//        System.out.println("La suma de los bordes de la matriz es: "+sumarBordes(matriz3));

        //Escribe una función llamada silla, que reciba una matriz y muestre
        //cuáles son los puntos de silla (los puntos de silla de una matriz son
        //aquellos elementos de la misma que cumplen ser el mínimo de su fila
        //y el máximo de su columna).
//        int[][] matriz2 = {{1,2,3,4},{4,5,6,7},{7,5,9,6},{2,1,3,5}};
//        sillaMatriz(matriz2);

        //Escribe una función llamada traspuesta que reciba una matriz y realice
        //la traspuesta de la misma, mostrando la matriz original y la traspuesta.
        //La matriz traspuesta es aquella que surge como resultado de realizar
        //un cambio de columnas por filas y filas por columnas en la matriz
        //original, generándose una nueva matriz.
//        int[][] matriz = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
//        traspuestaMatriz(matriz);


        //Escribe una función llamada dpSuma que tome una matriz cuadrada y
        //devuelva la suma de los elementos que están por encima de la
        //diagonal principal (excluyendo la diagonal).
//        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("La suma de los valores que están por encima de la diagonal son: "+dpSuma(matriz));

        //Serie de Padovan. La formula para calcular el termino n-esimo de la
        //serie de Padovan es:
        //P(n) = P(n-2) + P(n-3)
        //Con los valores iniciales P(0) = P(1) = P(2) = 1
        //Tenemos que armar un array, para que pasado n, llamemos la función
        //padovan(n) y nos arme la serie en un array, si le pasamos en n un
        //valor menor o igual a cero debemos devolver un array vacío.
//        System.out.print("La serie Padovan para N: 10 es = "+java.util.Arrays.toString(padovan(10)));
//        System.out.print("\nLa serie Padovan para N: 20 es = "+java.util.Arrays.toString(padovan(20)));
//        System.out.print("\nLa serie Padovan para N: 0 es = "+java.util.Arrays.toString(padovan(0)));
//        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.print(Arrays.deepToString(matriz));

//        System.out.println("Es vocal "+validarVocal("aeiAEIOU"));
//        System.out.println("Es vocal "+validarVocal("aEccYU"));
//        System.out.println("Es vocal "+validarVocal("AEIju"));
        //Ejercicio Cola de la Prueba
//        java.util.Queue<String> cola = new java.util.LinkedList<>();
//        usarCola(cola,"Tarea 1",1);
//        usarCola(cola,"Tarea 2",1);
//        usarCola(cola,"Tarea 3",1);
//        usarCola(cola,"",2);
//        System.out.println(cola);
//        java.util.Queue<String> cola2 = new java.util.LinkedList<>();
//        usarCola(cola2,"imp1",1);
//        usarCola(cola2,"imp2",1);
//        usarCola(cola2,"",2);
//        usarCola(cola2,"imp3",1);
//        usarCola(cola2,"",2);
//        System.out.println(cola2);

        //Fibonacci Prueba
//        System.out.println("Secuencia Fibonacci de 0: "+Arrays.toString(fibonacci2(0)));
//        System.out.println("Secuencia Fibonacci de 1: "+Arrays.toString(fibonacci2(1)));
//        System.out.println("Secuencia Fibonacci de 5: "+Arrays.toString(fibonacci2(5)));
//        System.out.println("Secuencia Fibonacci de 10: "+Arrays.toString(fibonacci2(10)));
//        System.out.println("Secuencia Fibonacci de 20: "+Arrays.toString(fibonacci2(20)));
//        fizzBus(15);
//        System.out.println();
//        fizzBus(30);

        //Traza de una matriz Prueba
//        int[][] matriz = {{1,2,3,1},{5,6,7,2},{9,2,3,2},{5,4,1,2}};
//        for(int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[i].length;j++){
//                System.out.print(matriz[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("La traza derIzq es: "+traza(matriz,true));
//        System.out.println("La traza IzqDer es: "+traza(matriz,false));

        //Sumar Matriz y Sumar dos Matrices
//        int[][] matriz = {{1,2},{5,6}};
//        int[][] matriz2 = {{5,4},{2,6}};
//        for(int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[i].length;j++){
//                System.out.print(matriz[i][j]+"   ");
//            }
//            System.out.println();
//        }
//        System.out.println("-" .repeat(10));
//        for(int i=0;i<matriz2.length;i++){
//            for(int j=0;j<matriz2[i].length;j++){
//                System.out.print(matriz2[i][j]+"   ");
//            }
//            System.out.println();
//        }
//        System.out.println("La suma de la Matriz: "+sumarMatriz(matriz));
//        int[][] resultado = sumarDosMatrices(matriz,matriz2);
//        System.out.println("La suma de las Dos Matriz es ");
//        for(int i=0;i<resultado.length;i++){
//            for(int j=0;j<resultado[i].length;j++){
//                System.out.print(matriz2[i][j]+"   ");
//            }
//            System.out.println();
//        }


        //ValidarDatos Prueba
//        String dato = "1234994";
//        String dato2 = "12349999965";
//        System.out.println("Validar datos numeros: "+validar(dato));
//        System.out.println("Validar datos numeros: "+validar(dato2));


        //Ejercicio Examen Saber la palabra más larde dentro de una lista
//        String[] lista = {"Marcos","Seba","Mati","Marcela","Teo"};
//        System.out.println("Lista de nombre "+Arrays.deepToString(lista));
//        System.out.println("El nombre más largo es: "+Arrays.deepToString(masLargoMasCorto(lista)));

        //Recorrer los bordes de una matriz y mostrar la suma de los valores, se recorre de forma horario/Antihorario
        //dependiendo de una variable Booleana.
        int[][] matriz = {{1,2,3,4},
                          {5,6,7,8},
                          {3,4,5,6},
                          {5,6,7,8}};
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println("Suma borde matriz "+sumarBordes(matriz));
        System.out.println("Suma borde matriz "+sumarBordeMatriz(matriz,true));




    }
    public static int sumarBordeMatriz(int[][] matriz, boolean op){
       int suma = 0;

        if(op) {
            for (int i = 0; i < matriz.length; i++) {
                for(int j=0;j<matriz[i].length;j++) {
                    if(i==0 && j<matriz.length || i==0 && j==matriz.length || j==matriz.length && i<matriz.length || i<matriz.length && j==0) {
                        System.out.print(matriz[i][j] + ",");
                        suma += matriz[i][j];
                    }
                }
            }
        }else {

        }

        return suma;
    }

    public static String[] masLargoMasCorto(String[] lista){
        String[] resultado = new String[2];
        String nombreLargo = lista[0];
        String nombreCorto = lista[0];

        for(String nombre: lista){
            if(nombre.length() > nombreLargo.length() ){
                nombreLargo = nombre;
            }else if (nombre.length() < nombreCorto.length()){
                nombreCorto = nombre;
            }
        }
        resultado[1]=nombreCorto;
        resultado[0]=nombreLargo;
        return resultado;

    }

    public static boolean validar(String dato){
        //boolean resultado =  false;
        String numeros = "0123456789";
        if(dato.length() > 0 && dato.length() <= 9){
            for(char a : dato.toCharArray()){
                if(numeros.indexOf(a) == -1){
                    return false;
                }
            }
        }else {
            return false;
        }

        return true;
    }

    public static int[][] sumarDosMatrices(int[][] matriz1,int[][] matriz2){

        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1.length;j++){
                matriz2[i][j] += matriz1[i][j];
            }
        }
        return matriz2;
    }

    public static int sumarMatriz(int[][] matriz){
        int suma = 0;
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }


        return suma;
    }

    public static int traza(int[][] matriz, boolean izqADer){
        int traza = 0;
        int n=matriz.length;
        int h=matriz[0].length;
        if(izqADer) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < h; j++) {
//                    if (i == j) {
//                        traza += matriz[i][j];
//                    }
//                }
//            }
            for(int i=0;i<n;i++) {
                traza += matriz[i][i];
            }
        }else {
            for(int i=0;i<n;i++){
                    traza += matriz[i][n-i-1];
            }
        }

        return traza;
    }

    public static void fizzBus(int n){
         for(int i=1; i<=n; i++){
             if(i % 3 == 0 && i % 5 == 0){
                 System.out.println("FizzBus");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else {
                 System.out.println(i);
             }
         }
    }

    public static int[] fibonacci2(int n){
        int[] fibo = new int[n+1];

        if(n == 0) {
            fibo[0] = 0;
        } else if(n == 1) {
            //fibo[0] = 0;
            fibo[1] = 1;
        } else if (n > 1) {
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i=2;i<=n;i++){
                fibo[i] = fibo[i-2] + fibo[i-1];
            }
        }

        return fibo;
    }

    public static void usarCola(java.util.Queue<String> cola, String s, int i){
        if(i == 1){
            System.out.println("Agrego "+s+" ->"+cola.offer(s));
        } else if (i == 2) {
            System.out.print("Elimino:"+cola.poll());
        }

    }

    public static boolean validarVocal(String palabra) {
        // aca debe completar el codigo
        //String mini = palabra.toLowerCase();
        //System.out.println(mini);
        String vocales = "aeiouAEIOU";
        if(palabra.length() > 2 && palabra.length() < 7){
            for(char p: palabra.toCharArray()){
                if(vocales.indexOf(p) == -1){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static int[] padovan(int nro){
        int[] padovan = new int[nro];
        int p1 = 0;
        int p2 = 0;
        if(nro <= 0){
            return new int[0];
        }
        if (nro > 0) padovan[0] = 1;
        if (nro > 1) padovan[1] = 1;
        if (nro > 2) padovan[2] = 1;

        for (int i=3;i<=nro-1;i++){
            padovan[i] = padovan [i - 2] + padovan [i - 3];
        }

        return padovan;
    }
    public static int dpSuma(int[][] matriz){
        int suma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(j > i ){
                    suma += matriz[i][j];
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println();
        }


        return suma;
    }

    public static void traspuestaMatriz(int[][] matriz){
        int[][] matrizTraspuesta = new int[matriz.length][matriz[0].length];
        System.out.println("Matriz Original -----------------");
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz.length-1; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz.length-1; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Traspuesta -----------------");
        for (int i = 0; i <= matrizTraspuesta.length-1; i++) {
            for (int j = 0; j <= matrizTraspuesta.length-1; j++) {
                System.out.print(matrizTraspuesta[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sillaMatriz(int[][] matriz){
        int[] sillaFila = new int[matriz.length];

        int[] sillaColumna = new int[matriz[0].length];
        //Cargo el array sillaFila con -999
        for (int i = 0; i < sillaFila.length-1; i++) {
            sillaFila[i] = 9999;
        }

        for (int i=0;i<=matriz.length-1;i++){
            for (int j=0;j<=matriz[i].length-1;j++){
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j] < sillaFila[i]){
                    sillaFila[i] = matriz[i][j];
                    System.out.print("F["+sillaFila[i]+"]["+i+","+j+"] ");
                }
                if(matriz[i][j] > sillaColumna[j]){
                    sillaColumna[j] = matriz[i][j];
                }
            }
            System.out.println();
        }
        for (int i=0;i<=sillaFila.length-1;i++){
            for (int j=0;j<=sillaColumna.length-1;j++){
                if (sillaFila[i] == sillaColumna[j]){
                    System.out.println("MinXFil: "+sillaFila[i]+" MaxXCol: "+sillaColumna[j]);
                }
            }

        }

    }

    public static int sumarBordes(int[][] matriz){
        int sumaBorde = 0;
        for(int i=0;i<=matriz.length-1;i++){
            for (int j=0;j<=matriz[i].length-1;j++){
                if(i==0 || j==0 || (i>0 && j==matriz[i].length-1) || (i==matriz.length-1 && j>=0)){
                    System.out.print(matriz[i][j]+" ");
                    sumaBorde+=matriz[i][j];
                }
            }
        }
        return sumaBorde;
    }
    public static int sumarEsquinas(int[][] matriz){
        for (int i=0; i<=matriz.length-1;i++){
            for(int j=0; j<=matriz[i].length-1;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
         return matriz[0][0] + matriz[0][matriz.length-1] + matriz[matriz.length-1][0] + matriz[matriz.length-1][matriz.length-1];
    }

    public static boolean esCuadrada(int[][] matriz){

        if (matriz[0] != null) {
            if (matriz.length != matriz[0].length) {
                return false;
            } else {
                for (int i = 0; i <= matriz.length - 1; i++) {
                    for (int j = 0; j <= matriz[i].length - 1; j++) {
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println();
                }
            }
        }else System.out.println("La matriz es NULL");
        return true;
    }

    public static int[] intercala(int[] arreglo1, int[] arreglo2){
        int[] intercala = new int[arreglo1.length + arreglo2.length];
        int i=0,j=0,h = 0;
        while (i<arreglo1.length && j<arreglo2.length){
            if(arreglo1[i]<=arreglo2[j]){
                intercala[h++]=arreglo1[i++];
            }else {
                intercala[h++]=arreglo2[j++];
            }
        }


        return intercala;
    }

    public static int poSearch(int[] nros, int valor){
        int posicion=0;
        for (int i=0;i<=nros.length-1;i++){
            if(nros[i]==valor){
                posicion=i-1;
            }
        }

        return posicion;
    }

    public static void maximin(int[] nros){
        int maximo = 0;
        String posiciones="";
        int[] posición = new int[nros.length];
        for (int i=0;i<=nros.length-1;i++){
            if(nros[i]>=maximo) {
                maximo = nros[i];
                //posiciones += "," + i;
            }
        }
        for (int i=0;i<=nros.length-1;i++){
            if(nros[i]==maximo) {
                posiciones += i+" ";
            }
        }
        System.out.println("El valor maximo del arreglo: "+maximo);
        System.out.println("Se repite el nro en las posiciones: "+posiciones);
    }

    public static void cuadradoAsterisco(int nro){
        int[][] matriz = new int[nro][nro];
        for(int i=0;i<=matriz.length-1;i++){
            for(int j=0;j<=matriz[i].length-1;j++){
                if (j==0 || j==nro-1 || i==0 || i== nro-1) {
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static int coincidenciaFrasePalabra(String palabra, String frase){
        int cont = 0;
       while (frase.indexOf(palabra)>-1){
           frase = frase.substring(frase.indexOf(palabra)+palabra.length()-1,frase.length());
           cont ++;
       }
        return cont;
    }
    public static String invertirCadena(String cadena){
        char[] nuevaCadena = new char[cadena.length()];
        char[] original = cadena.toCharArray();
        for (int i=original.length-1;i>=0;i--){
            nuevaCadena[original.length-1-i]=original[i];
            //System.out.print(original[i]);
        }
//        System.out.println("CADENA: "+java.util.Arrays.toString(cadena.toCharArray()));
//        System.out.println("Original: "+java.util.Arrays.toString(original));
//        System.out.println("Nueva cadena invertida: "+java.util.Arrays.toString(nuevaCadena));
        return java.util.Arrays.toString(nuevaCadena);
    }

    public static boolean esPalindramo(String palabra){
        char[] invertadaPalabra = new char[palabra.length()];
        char[] derecha = palabra.toCharArray();
        System.out.println(java.util.Arrays.toString(derecha));
        for (int i=derecha.length-1;i>=0;i--){
            invertadaPalabra[derecha.length-1-i] = derecha[i];
        }
        System.out.println(java.util.Arrays.toString(invertadaPalabra));
        for (int i=0;i<derecha.length;i++){
            if (derecha[i] != invertadaPalabra[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean validadDato(String xvalidar){
        //Se pasa un String, y validarDato(tienen que ser todos números)
        // donde tienen q ser mayor a 0 y menor a 9.
        char[] dato = xvalidar.toCharArray();
        System.out.print(java.util.Arrays.toString(dato)+" ");
//        if(dato.length == 0 || dato.length >= 9){
//            System.out.println("El numero debe ser entre 1 y 9");
//            return false;
//        }
        for (char c : dato) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    public static boolean esNumero(char c){
        return "0123456789".indexOf(c) != -1;
    }
    public static Persona buscarPersonaPorCedula(HashMap<Integer,Persona> personaPorCedula, int cedula){
        Persona persona = null;
        persona = personaPorCedula.get(cedula);
        return persona;
    }
    public static void mostrarHasMapPersona(HashMap<Integer,Persona> personaPorCedula) {
        for (Persona persona : personaPorCedula.values()) {
            System.out.println(persona.toString());
        }
    }

    public static void mostrarArray(int nro){
        //Mostrar array de forma vertical, donde si el valor es
        // multiplo de 3 mostrar "Sil", multiplo de 5 "Ber" y
        // los dos "SilBerSoft", en caso contrario mostrar el numero.
        int[] array = new int[nro];
        for(int i=1; i<=nro;i++){
            if(i%3==0 && i%5==0){
                System.out.println("SilBerSoft");
            } else if (i%5==0) {
                System.out.println("Ber");
            } else if (i%3==0) {
                System.out.println("Sil");
            }else {
                System.out.println(i);
            }
        }
    }
    public static int sumaDiagonalesMatrizIzqDer(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            suma += matriz[i][i];
        }
        return suma;

    }
    public static int sumaDiagonalesMatrizDerIzq(int[][] matriz) {
        int suma = 0;
//        for (int i = matriz.length; i > 0 ; i--) {
//            System.out.print(matriz[i-1][matriz.length-i] + " ");
//            suma += matriz[i-1][matriz.length - i];
//        }
        for (int i = matriz.length-1; i >= 0; i--) {
            System.out.print(matriz[matriz.length-1-i][i] + " ");
            suma += matriz[matriz.length-1-i][i];
        }
        return suma;

    }

    public static int[] inversoArray(int[] array){
        int[] res = new int[array.length];
        for(int i=0; i<array.length; i++){
            res[i] = array[array.length-1-i];
        }
        return res;
    }
    public static void ejercicioCola(Queue<String> cola, String dato, int op){
        if(op == 1){
            //agregar elemento a la cola
            cola.add(dato);
        } else if (op == 2){
            //eliminar elemento de la cola
            System.out.println(cola.poll());
        }
    }
    public static void ejercicio1(int[] n) {
        for(int num: n){
            System.out.println(num+" "+"*".repeat(num));
        }
    }

    public static void ejercicio2(String oracion, String palabra) {
        int[] pos = new int[palabra.length()-1];
        System.out.println("Oracion: "+oracion);
        System.out.println("Palabra buscada: "+palabra);
        oracion = oracion.toUpperCase(); //convierto a minuscula
        palabra = palabra.toUpperCase(); //convierto a minuscula
            if(oracion.contains(palabra)) {
                //pos = oracion.indexOf(palabra);

            }

    }
    public static void fibonacci(int n) {
        //función Fibonacci 0-1-1-2-3-5-8
        int a=0, b = 1, c;
        if (n>0) {
            for (int i = 0; i < n; i=i+1) {
                System.out.print(a+"-");
                c = a + b;
                a = b;
                b = c;


            }
        } else if (n==0) {
            System.out.print(n);
        } else if (n<0) {
            System.out.print("No se puede realizar la serie Fibonacci");

        }
    }
}