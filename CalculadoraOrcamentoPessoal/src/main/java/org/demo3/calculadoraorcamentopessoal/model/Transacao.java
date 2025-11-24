package org.demo3.calculadoraorcamentopessoal.model;

public class Transacao {

    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(double valor, String descricao, TipoTransacao tipo) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String valorFormatado = String.format("%.2f", this.getValor());
        String tipoFormatado = this.getTipo().name().equals("RECEITA") ? "Receita" : "Despesa";

        return String.format("%s / R$ %s / Tipo: %s ", this.getDescricao(), valorFormatado.replace('.', ','), this.getTipo());
    }

}