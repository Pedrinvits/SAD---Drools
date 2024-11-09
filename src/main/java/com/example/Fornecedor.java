package com.example;

public class Fornecedor {
    private double preco;
    private int qualidade;
    private int prazosEntrega;
    private double reputacao;
    private int capacidadeAtendimento;
    private int pontuacao;

    // Construtor
    public Fornecedor(double preco, int qualidade) {
        this.preco = preco;
        this.qualidade = qualidade;
        this.prazosEntrega = 0;
        this.reputacao = 0;
        this.capacidadeAtendimento = 0;
        this.pontuacao = 0;
    }

    // Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getPrazosEntrega() {
        return prazosEntrega;
    }

    public void setPrazosEntrega(int prazosEntrega) {
        this.prazosEntrega = prazosEntrega;
    }

    public double getReputacao() {
        return reputacao;
    }

    public void setReputacao(double reputacao) {
        this.reputacao = reputacao;
    }

    public int getCapacidadeAtendimento() {
        return capacidadeAtendimento;
    }

    public void setCapacidadeAtendimento(int capacidadeAtendimento) {
        this.capacidadeAtendimento = capacidadeAtendimento;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
               "preco=" + preco +
               ", qualidade=" + qualidade +
               ", prazosEntrega=" + prazosEntrega +
               ", reputacao=" + reputacao +
               ", capacidadeAtendimento=" + capacidadeAtendimento +
               ", pontuacao=" + pontuacao +
               '}';
    }
}
