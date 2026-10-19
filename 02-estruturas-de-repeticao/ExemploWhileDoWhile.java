package repeticao;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Aula: Laços 'while' e 'do-while'
 * Agora com valor da mesada e chances de atendimento informados pelo usuário.
 */
public class ExemploWhileDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // ==========================================
        // 1. LAÇO WHILE: MESADA DE DOCES
        // ==========================================
        System.out.println("=== 1. LAÇO WHILE (GASTANDO MESADA EM DOCES) ===");
        System.out.print("Qual é o valor total da mesada disponível (R$)? ");
        double mesada = scanner.nextDouble();

        int totalDoces = 0;
        double gastoTotal = 0.0;

        while (mesada > 0) {
            // Valor aleatório entre R$ 1.50 e R$ 8.00 por doce
            double valorDoce = ThreadLocalRandom.current().nextDouble(1.50, 8.00);

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            mesada = mesada - valorDoce;
            gastoTotal += valorDoce;
            totalDoces++;

            System.out.printf("🍬 Doce #%d: R$ %.2f | Saldo restante: R$ %.2f\n", totalDoces, valorDoce, mesada);
        }

        System.out.printf("\nFim das compras! Doces comprados: %d | Total gasto: R$ %.2f\n", totalDoces, gastoTotal);

        // ==========================================
        // 2. LAÇO DO-WHILE: TELEFONE TOCANDO
        // ==========================================
        System.out.println("\n=== 2. LAÇO DO-WHILE (DISCANDO ATÉ ATENDER) ===");
        System.out.print("Quantas tentativas máximas você quer esperar antes de desistir? ");
        int maxTentativas = scanner.nextInt();

        int tentativaAtual = 0;
        boolean atendeu = false;

        System.out.println("\nDiscando número...");

        // O do-while roda pelo menos uma vez
        do {
            tentativaAtual++;
            System.out.println("📞 Telefone tocando... Trim trim (Tentativa " + tentativaAtual + "/" + maxTentativas + ")");
            // 35% de chance da pessoa atender a cada toque
            atendeu = ThreadLocalRandom.current().nextInt(100) < 35;
        } while (!atendeu && tentativaAtual < maxTentativas);

        if (atendeu) {
            System.out.println("🎉 Alô?! Ligação atendida na tentativa #" + tentativaAtual + "!");
        } else {
            System.out.println("📵 Ninguém atendeu após " + maxTentativas + " toques. Chamada encerrada.");
        }

        scanner.close();
    }
}
