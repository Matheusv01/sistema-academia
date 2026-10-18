package org.cadastro;

public class PlanoBasico extends Plano {
    private double taxaInscricao;

    public PlanoBasico(String nomeAluno, String cpf, double taxaInscricao) {
        super(nomeAluno, cpf, 150);
        this.taxaInscricao = taxaInscricao;
    }

    @Override
    public double calcularMensalidade() {
        return getValorBase() + taxaInscricao;
    }
}