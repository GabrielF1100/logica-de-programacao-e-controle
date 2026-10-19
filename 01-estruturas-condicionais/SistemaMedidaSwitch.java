package condicional;

import java.util.Scanner;

/**
 * Aula: Switch-Case
 * Escolha interativa de tamanhos e planos de telefonia via teclado.
 */
public class SistemaMedidaSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 1. TAMANHO DE ROUPAS COM SWITCH E BREAK
        // ==========================================
        System.out.println("=== 1. SISTEMA DE MEDIDAS DE VESTUÁRIO ===");
        System.out.print("Escolha o tamanho desejado (P, M ou G): ");
        String sigla = scanner.nextLine().trim().toUpperCase();

        switch (sigla) {
            case "P": {
                System.out.println("Tamanho selecionado: PEQUENO (Small)");
                break;
            }
            case "M": {
                System.out.println("Tamanho selecionado: MÉDIO (Medium)");
                break;
            }
            case "G": {
                System.out.println("Tamanho selecionado: GRANDE (Large)");
                break;
            }
            default: {
                System.out.println("Tamanho '" + sigla + "' inválido! Escolha apenas P, M ou G.");
            }
        }

        // ==========================================
        // 2. PLANO DE TELEFONIA COM FALL-THROUGH
        // ==========================================
        System.out.println("\n=== 2. SELEÇÃO DE PLANO DE TELEFONIA ===");
        System.out.println("Planos disponíveis: BASIC | MIDIA | TURBO");
        System.out.print("Digite o nome do plano que deseja assinar: ");
        String plano = scanner.nextLine().trim().toUpperCase();

        System.out.println("\nBenefícios incluídos no seu plano " + plano + ":");
        switch (plano) {
            case "TURBO": {
                System.out.println("✔ +5GB de YouTube adicionais");
            }
            case "MIDIA": {
                System.out.println("✔ WhatsApp e Instagram 100% grátis");
            }
            case "BASIC": {
                System.out.println("✔ 100 minutos de ligação para qualquer operadora");
                break; // Encerra a cascata
            }
            default:
                System.out.println("❌ Plano informado não existe.");
        }

        scanner.close();
    }
}
