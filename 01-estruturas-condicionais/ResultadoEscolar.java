package condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Aula: Condicionais Encadeadas e Condição Ternária
 * Sistema de Avaliação Escolar com entrada de nota via teclado.
 */
public class ResultadoEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== SISTEMA DE AVALIAÇÃO ESCOLAR ===");

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota de " + nome + " (0 a 10): ");
        double nota = scanner.nextDouble();

        System.out.println("\n--- RESULTADO (IF / ELSE IF / ELSE) ---");
        if (nota >= 7.0) {
            System.out.println("Status: Parabéns, " + nome + "! Você foi APROVADO(A)! 🎓");
        } else if (nota >= 5.0) {
            System.out.println("Status: " + nome + " está de RECUPERAÇÃO. ⚠️");
        } else {
            System.out.println("Status: " + nome + " foi REPROVADO(A). ❌");
        }

        // Demonstração da mesma lógica com operador ternário
        System.out.println("\n--- RESULTADO COM OPERADOR TERNÁRIO ---");
        String resultadoTernario = nota >= 7.0 ? "Aprovado" : nota >= 5.0 ? "Recuperação" : "Reprovado";
        System.out.println("Classificação: " + resultadoTernario);

        scanner.close();
    }
}
