package exercicios_extras;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 2:
 * Escreva um código onde o usuário entra com sua altura e peso,
 * seja feito o cálculo do seu IMC (IMC = peso / (altura * altura))
 * e seja exibida a mensagem de acordo com a tabela oficial:
 * 
 * - Menor ou igual a 18,5: "Abaixo do peso"
 * - Entre 18,6 e 24,9: "Peso ideal"
 * - Entre 25,0 e 29,9: "Levemente acima do peso"
 * - Entre 30,0 e 34,9: "Obesidade Grau I"
 * - Entre 35,0 e 39,9: "Obesidade Grau II (Severa)"
 * - Maior ou igual a 40,0: "Obesidade III (Mórbida)"
 */
public class Exercicio02CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== CÁLCULO DE ÍNDICE DE MASSA CORPORAL (IMC) ===");

        System.out.print("Digite seu peso em kg (ex: 75.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.78): ");
        double altura = scanner.nextDouble();

        if (altura <= 0 || peso <= 0) {
            System.err.println("Erro: Peso e altura devem ser maiores que zero!");
            scanner.close();
            return;
        }

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if (imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade III (Mórbida)";
        }

        System.out.println("\n--- RESULTADO DA AVALIAÇÃO ---");
        System.out.printf("Seu IMC calculado é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
