package unipar.br.central.models;

public class Transacao {
    
    private double valor;
    private int tipo;
    private String ra;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao() {
    }

    public Transacao(double valor, int tipo, String ra, Conta contaOrigem, Conta contaDestino) {
        this.valor = valor;
        this.tipo = tipo;
        this.ra = ra;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    } 
}
