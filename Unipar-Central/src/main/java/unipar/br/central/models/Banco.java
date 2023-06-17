package unipar.br.central.models;

public class Banco {
    
    private String nome;
    private String ra;

    public Banco() {
    }

    public Banco(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
}
