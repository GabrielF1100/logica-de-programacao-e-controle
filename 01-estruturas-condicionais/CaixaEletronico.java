package condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Aula: Condicional Simples e Condicional Composta
 * Simulação de Caixa Eletrônico com entradas dinâmicas via teclado.
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        // useLocale(Locale.US) para aceitar decimais com ponto (ex: 25.50)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== SISTEMA DE CAIXA ELETRÔNICO ===");

        System.out.print("Informe o saldo inicial da conta (R$): ");
        double saldo = scanner.nextDouble();

        System.out.print("Informe o valor que deseja sacar (R$): ");
        double valorSolicitado = scanner.nextDouble();

        System.out.println("\nProcessando operação...");

        // Verificação condicional
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("✅ Saque de R$ " + valorSolicitado + " autorizado!");
            System.out.println("💰 Saldo restante atualizado: R$ " + saldo);
        } else {
            System.out.println("❌ Saque não autorizado! Saldo insuficiente.");
            System.out.println("Disponível para saque: R$ " + saldo);
        }

        scanner.close();
    }
}
