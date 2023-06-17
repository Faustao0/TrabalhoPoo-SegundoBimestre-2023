package unipar.br.central.execeptios;

public class CampoNaoInformadoException extends Exception{
    
    public CampoNaoInformadoException(String campo) {
        super("O campo "+ campo + " Não Foi Informado. Verique!");
    }
}
