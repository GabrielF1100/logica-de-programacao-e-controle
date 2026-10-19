package exercicios_extras;

import java.util.Scanner;

/**
 * Exercício 4:
 * Escreva um código onde o usuário informa um número inicial.
 * Posteriormente irá informar outros N números.
 * 
 * Regras de execução:
 * 1. A execução do código continuará enquanto o número informado dividido pelo primeiro
 *    número tiver resto IGUAL a 0 (ou seja, for múltiplo dele: numero % primeiro == 0).
 * 2. Quando o número informado tiver resto DIFERENTE de 0 na divisão, o programa encerra.
 * 3. Números menores que o primeiro número devem ser IGNORADOS (não encerram e continuam o loop).
 */
public class Exercicio04MultiplosComParada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE MÚLTIPLOS E CRITÉRIO DE PARADA ===");

        System.out.print("Informe o número base inicial (ex: 5): ");
        int numeroInicial = scanner.nextInt();

        // Evitar divisão por zero
        while (numeroInicial == 0) {
            System.out.print("O número inicial não pode ser 0. Digite outro número: ");
            numeroInicial = scanner.nextInt();
        }

        System.out.println("\nRegras ativas:");
        System.out.println("• Digite múltiplos de " + numeroInicial + " (ex: " + (numeroInicial * 2) + ", " + (numeroInicial * 3) + ") para continuar.");
        System.out.println("• Números menores que " + numeroInicial + " serão ignorados.");
        System.out.println("• O programa ENCERRARÁ assim que você digitar um número cujo resto da divisão por " + numeroInicial + " for diferente de 0.\n");

        int rodada = 1;
        while (true) {
            System.out.print("Digite o " + rodada + "º número: ");
            int numeroAtual = scanner.nextInt();

            // Regra 3: Números menores que o primeiro número devem ser ignorados
            if (numeroAtual < numeroInicial) {
                System.out.println("⚠️ O número " + numeroAtual + " é menor que o inicial (" + numeroInicial + "). IGNORADO!");
                continue; // Pula para a próxima leitura sem parar o programa
            }

            // Regra 1 e 2: Verifica o resto da divisão
            int resto = numeroAtual % numeroInicial;

            if (resto != 0) {
                System.out.println("\n🛑 PARADA ACIONADA!");
                System.out.println("O número " + numeroAtual + " dividido por " + numeroInicial + " tem resto = " + resto + " (diferente de 0).");
                System.out.println("Programa finalizado com sucesso!");
                break; // Encerra o loop
            } else {
                System.out.println("✔ Válido! " + numeroAtual + " é múltiplo de " + numeroInicial + " (resto = 0). Continuando...");
                rodada++;
            }
        }

        scanner.close();
    }
}
