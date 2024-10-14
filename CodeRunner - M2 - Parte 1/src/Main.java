public class Main {
    public static void main(String[] args) {
        ViajanteLogistica vl = new ViajanteLogistica();
        int[][] distancias = {
                { 0, 10, 15, 20 },
                { 10, 0, 35, 25 },
                { 15, 35, 0, 30 },
                { 20, 25, 30, 0 }
        };
        System.out.println("Distancia mínima: " + vl.tsp(distancias, new boolean[4], 0, 4, 1, 0, Integer.MAX_VALUE));


    }
}