import java.util.*;

public class RedSocialBFS {
    public void bfs(Map<String, List<String>> redSocial, String inicio) {
        Set<String> visitados = new HashSet<>(); // Conjunto para rastrear usuarios visitados
        Queue<String> cola = new LinkedList<>(); // Cola para gestionar el orden de exploración

        visitados.add(inicio);
        cola.add(inicio);
        System.out.print(inicio + " ");
        while (!cola.isEmpty()) {
            String usuarioActual = cola.poll();

            List<String> amigos = redSocial.get(usuarioActual);
            if (amigos != null) {
                for (String amigo : amigos) {
                    if (!visitados.contains(amigo)) {
                        visitados.add(amigo);
                        cola.add(amigo);
                        System.out.print(amigo + " ");
                    }
                }
            }
        }
    }
}