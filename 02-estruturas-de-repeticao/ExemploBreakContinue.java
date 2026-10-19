package repeticao;

import java.util.Scanner;

/**
 * Aula: Interrupção de Fluxo - break e continue
 * Permite ao usuário escolher o limite da contagem e qual número deve acionar o break/continue.
 */
public class ExemploBreakContinue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DEMONSTRAÇÃO DE BREAK E CONTINUE ===");
        System.out.print("Defina o limite superior da contagem (ex: 10): ");
        int limite = scanner.nextInt();

        System.out.print("Escolha o número que acionará o BREAK (vai parar tudo): ");
        int numeroBreak = scanner.nextInt();

        System.out.print("Escolha o número que acionará o CONTINUE (vai apenas pular ele): ");
        int numeroContinue = scanner.nextInt();

        // 1. Teste do BREAK
        System.out.println("\n--- 1. EXECUTANDO LOOP COM TESTE DE BREAK ---");
        for (int i = 1; i <= limite; i++) {
            if (i == numeroBreak) {
                System.out.println("🛑 Número " + i + " atingido! Executando BREAK (abortando laço)...");
                break;
            }
            System.out.println("Contador: " + i);
        }

        // 2. Teste do CONTINUE
        System.out.println("\n--- 2. EXECUTANDO LOOP COM TESTE DE CONTINUE ---");
        for (int i = 1; i <= limite; i++) {
            if (i == numeroContinue) {
                System.out.println("⏭️ Número " + i + " encontrado -> Executando CONTINUE (pulando para o próximo)...");
                continue;
            }
            System.out.println("Contador: " + i);
        }

        scanner.close();
    }
}
