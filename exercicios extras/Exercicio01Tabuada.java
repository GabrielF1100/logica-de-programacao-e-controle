package exercicios_extras;

import java.util.Scanner;

/**
 * Exercício 1:
 * Escreva um código onde o usuário entra com um número
 * e seja gerada a tabuada de 1 até 10 desse número.
 */
public class Exercicio01Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GERADOR DE TABUADA ===");
        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- TABUADA DO " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %2d = %d\n", numero, i, resultado);
        }

        scanner.close();
    }
}
