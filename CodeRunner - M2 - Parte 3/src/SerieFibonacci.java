import java.util.ArrayList;
import java.util.List;

public class SerieFibonacci {
    public void generarSerieFibonacci(int N, int a, int b, List<Integer> serie) {
        // Base case: if a exceeds N, we stop the recursion
        if (a > N) {
            return;
        }

        // Add the current number to the list
        serie.add(a);

        // Recursive call to calculate the next number in the series
        generarSerieFibonacci(N, b, a + b, serie);
    }
}
