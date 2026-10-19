package excecoes;

import java.util.Scanner;

/**
 * Aula: Lançando Exceções Customizadas com throw e throws
 * O usuário agora digita o CEP via teclado para testar a validação e o disparo de exceção.
 */
public class FormatadorCepExemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA VALIDADOR E FORMATADOR DE CEP ===");
        System.out.print("Digite um CEP (apenas números, ex: 01001000): ");
        String cepDigitado = scanner.nextLine().trim();

        try {
            String cepFormatado = formatarCep(cepDigitado);
            System.out.println("✅ CEP válido e formatado com sucesso: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("\n❌ [ERRO DE NEGÓCIO]: " + e.getMessage());
            System.err.println("Certifique-se de que o CEP contenha exatamente 8 números.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Valida e formata o CEP.
     * Dispara CepInvalidoException caso o CEP não possua exatamente 8 dígitos.
     */
    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep == null || cep.length() != 8) {
            throw new CepInvalidoException("O valor informado '" + cep + "' tem " + (cep == null ? 0 : cep.length()) + " dígitos (esperado: 8).");
        }

        // Formata no padrão: XX.XXX-XXX
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}
