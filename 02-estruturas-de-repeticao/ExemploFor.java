package repeticao;

import java.util.Scanner;

/**
 * Aula: Estrutura de Repetição 'for'
 * Contagem dinâmica onde o usuário escolhe até quantos carneirinhos contar.
 */
public class ExemploFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONTANDO CARNEIRINHOS COM FOR ===");
        System.out.print("Quantos carneirinhos você deseja contar até dormir? ");
        int totalCarneirinhos = scanner.nextInt();

        if (totalCarneirinhos <= 0) {
            System.out.println("Você já dormiu antes de começar a contar! 😴");
        } else {
            for (int carneirinho = 1; carneirinho <= totalCarneirinhos; carneirinho++) {
                System.out.println("🐑 Contando carneirinho: " + carneirinho);
            }
            System.out.println("\nBateu o sono... Joãozinho dormiu! zZz");
        }

        scanner.close();
    }
}
