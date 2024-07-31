        import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                System.out.print("Introduce Capital: ");
                int capital = Integer.parseInt(s.nextLine());

                System.out.print("Introduce tiempo en meses: ");
                int tiempoEnMeses = Integer.parseInt(s.nextLine());

                float tiempoEnAnios = tiempoEnMeses / 12;
                float interes = 0;
                if (tiempoEnAnios <= 1){
                    interes = 1;
                } else if (tiempoEnAnios <= 2){
                    interes = 2;
                } else if (tiempoEnAnios <= 3){
                    interes = 3;
                } else if (tiempoEnAnios <= 4){
                    interes = 4;
                } else if (tiempoEnAnios <= 5){
                    interes = 5;
                } else {
                    interes = 6;
                }

                float TasaInteres = interes / 100;
                float InteresFinal = capital * tiempoEnAnios * TasaInteres;
                float Monto = capital + InteresFinal;
                float ValorCuota = Monto / tiempoEnMeses;
                System.out.println("Interes Porcentual: "+interes);
                System.out.println("Tasa Interes: "+TasaInteres);
                System.out.println("Monto Final: $"+Monto);
                System.out.println("Valor Cuota: $"+ValorCuota);

            }
        }