package Estoque;
import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] estoque = new int[3][4];

        System.out.println("Digite a quantidade de estoque para cada produto em cada loja:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Loja " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }
    }
}