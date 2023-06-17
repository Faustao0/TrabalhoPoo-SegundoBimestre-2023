package unipar.br.central.execeptios;

public class EntidadeNaoInformadaException extends Exception{
    
    public EntidadeNaoInformadaException(String entidade) {
        super(entidade + " Não foi informada(o) e deve ser preenchida(o). "
                + "Verifique!");
    }

} 