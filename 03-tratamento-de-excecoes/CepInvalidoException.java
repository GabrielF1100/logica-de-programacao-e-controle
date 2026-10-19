package excecoes;

/**
 * Exceção Customizada de Negócio:
 * Disparada quando um CEP não atende a quantidade exata de 8 dígitos.
 * 
 * Por herdar diretamente de 'Exception', ela é uma Checked Exception
 * (o compilador obriga quem chama a tratar com try-catch ou repassar com throws).
 */
public class CepInvalidoException extends Exception {

    public CepInvalidoException(String mensagem) {
        super(mensagem);
    }
}
