import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class ArbolRecorridos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            TreeNode root = new TreeNode(scanner.nextInt());
            root.left = new TreeNode(scanner.nextInt());
            root.right = new TreeNode(scanner.nextInt());
            root.left.left = new TreeNode(scanner.nextInt());
            root.left.right = new TreeNode(scanner.nextInt());

            System.out.print("Preorden: ");
            preorder(root);
            System.out.println();

            System.out.print("En orden: ");
            inorder(root);
            System.out.println();

            System.out.print("Posorden: ");
            postorder(root);
            System.out.println();

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void preorder(TreeNode node) {
        // Implementa el recorrido en preorden aquí
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(TreeNode node) {
        // Implementa el recorrido en orden aquí
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public static void postorder(TreeNode node) {
        // Implementa el recorrido en posorden aquí
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

}
