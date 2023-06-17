package unipar.br.central.execeptios;

public class TamanhoCampoInvalidoException extends Exception{
    
public TamanhoCampoInvalidoException(String campo, int tamanho) {
        super("O campo "+campo+" foi informado com tamanho("+tamanho+" caracteres)"
                + "invalido. Verifique!");
    }
}
