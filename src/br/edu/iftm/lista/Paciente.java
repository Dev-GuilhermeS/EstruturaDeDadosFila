package br.edu.iftm.lista;

public class Paciente {
    
    private String nome;
    private String dataNascimento;
    private String sintoma;
    private int prioridade;

    public Paciente(String nome, int prioridade, String sintoma, String dataNascimento) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataNascimento = dataNascimento;
        this.sintoma = sintoma;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSintoma() {
        return sintoma;
    }
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "{" +
            "------> Prontuário <------\n"+
            " Nome='" + getNome() + "'" +
            ", Data de Nascimento='" + getDataNascimento() + "'" +
            ", Sintomas='" + getSintoma() + "'" + 
            ", Prioridade='" + getPrioridade() + "'" +
            "}\n";
    }
}