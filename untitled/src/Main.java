import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, r; // area y radio
        double pi = Math.PI;
        System.out.print("Introduce el radio de un circulo: ");
        r = Integer.parseInt(s.nextLine());
        a = pi * (r * r); // para elevar al cuadrado otra opcion es: Math.pow (r, 2)
        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);


        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);

        sc.close();
    }

}