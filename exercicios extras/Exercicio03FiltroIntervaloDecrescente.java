package exercicios_extras;

import java.util.Scanner;

/**
 * Exercício 3:
 * Escreva um código que o usuário entre com:
 * 1. Um primeiro número;
 * 2. Um segundo número maior que o primeiro;
 * 3. Escolha entre a opção par ou ímpar;
 * 
 * O código deve informar todos os números pares ou ímpares (conforme a seleção)
 * no intervalo de números informados, INCLUINDO os extremos e em ORDEM DECRESCENTE.
 */
public class Exercicio03FiltroIntervaloDecrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FILTRO DE INTERVALO EM ORDEM DECRESCENTE ===");

        System.out.print("Digite o primeiro número (início): ");
        int numInicio = scanner.nextInt();

        System.out.print("Digite o segundo número (deve ser maior que o primeiro): ");
        int numFim = scanner.nextInt();

        // Validação da regra
        while (numFim <= numInicio) {
            System.out.print("Atenção! O segundo número deve ser MAIOR que " + numInicio + ". Digite novamente: ");
            numFim = scanner.nextInt();
        }

        scanner.nextLine(); // Limpeza de buffer

        System.out.print("Deseja filtrar por [PAR] ou [IMPAR]? ");
        String opcao = scanner.nextLine().trim().toUpperCase();

        while (!opcao.equals("PAR") && !opcao.equals("IMPAR")) {
            System.out.print("Opção inválida! Digite exatamente PAR ou IMPAR: ");
            opcao = scanner.nextLine().trim().toUpperCase();
        }

        boolean filtrarPares = opcao.equals("PAR");

        System.out.println("\n--- NÚMEROS " + opcao + "ES NO INTERVALO [" + numInicio + " até " + numFim + "] EM ORDEM DECRESCENTE ---");

        // Loop partindo do número maior (numFim) até o menor (numInicio)
        int encontrados = 0;
        for (int i = numFim; i >= numInicio; i--) {
            boolean ehPar = (i % 2 == 0);

            if (filtrarPares && ehPar) {
                System.out.print(i + " ");
                encontrados++;
            } else if (!filtrarPares && !ehPar) {
                System.out.print(i + " ");
                encontrados++;
            }
        }

        System.out.println("\nTotal de números encontrados: " + encontrados);

        scanner.close();
    }
}
