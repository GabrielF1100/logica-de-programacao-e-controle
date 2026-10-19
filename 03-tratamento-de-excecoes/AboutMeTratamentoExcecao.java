package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Aula: Tratamento de Exceções com Try / Catch / Finally
 * 
 * Exemplo clássico da DIO: Formulário AboutMe
 * Demonstra a proteção contra entrada de tipos incompatíveis
 * (ex: digitar texto onde o sistema espera um número ou altura decimal com vírgula).
 */
public class AboutMeTratamentoExcecao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("=== FORMULÁRIO DE CADASTRO COM TRY-CATCH ===");

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade (ex: 22): ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura (padrão US com ponto, ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.println("\n--- DADOS REGISTRADOS COM SUCESSO ---");
            System.out.println("Nome: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + "m");

        } catch (InputMismatchException e) {
            // Captura o erro específico caso o usuário digite letras no lugar de números
            System.err.println("\n[ERRO DE ENTRADA]: Os campos 'idade' e 'altura' precisam ser numéricos!");
            System.err.println("Dica: Use ponto (.) no lugar de vírgula para números decimais.");
        } finally {
            // O bloco finally SEMPRE executa, com ou sem erro
            System.out.println("\nFinalizando processo e liberando recursos do Scanner.");
            scanner.close();
        }
    }
}
