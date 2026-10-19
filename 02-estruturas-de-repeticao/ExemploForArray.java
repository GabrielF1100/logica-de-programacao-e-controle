package repeticao;

import java.util.Scanner;

/**
 * Aula: 'for' com Arrays e 'for-each'
 * O usuário define quantos alunos registrar e insere os nomes interativamente.
 */
public class ExemploForArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO E LISTAGEM DE ALUNOS ===");
        System.out.print("Quantos alunos deseja cadastrar na turma? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpeza de buffer do teclado

        String[] alunos = new String[quantidade];

        // Preenchimento do array usando for indexado
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do aluno #" + (i + 1) + ": ");
            alunos[i] = scanner.nextLine().trim();
        }

        // 1. Exibição com for indexado tradicional
        System.out.println("\n--- 1. CHAMADA USANDO FOR INDEXADO (i) ---");
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Índice [" + x + "] -> Aluno: " + alunos[x]);
        }

        // 2. Exibição com for-each (sintaxe limpa)
        System.out.println("\n--- 2. LISTAGEM USANDO FOR-EACH ---");
        for (String aluno : alunos) {
            System.out.println("Aluno presente: " + aluno);
        }

        scanner.close();
    }
}
