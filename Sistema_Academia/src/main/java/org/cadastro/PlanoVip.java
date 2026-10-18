package org.cadastro;

public class PlanoVip extends Plano implements Fidelizavel {
    private int mesesContratados;
    private boolean querPersonal;

    public PlanoVip(String nomeAluno, String cpf, int mesesContratados, boolean querPersonal) {
        super(nomeAluno, cpf, 250);
        this.mesesContratados = mesesContratados;
        this.querPersonal = querPersonal;
    }

    @Override
    public double aplicarDesconto(int meses) {
        if (meses >= 12) {
            return 0.20;
        } else if (meses >= 6) {
            return 0.10;
        }
        return 0.0;
    }

    @Override
    public double calcularMensalidade() {
        double valor = getValorBase();

        if (querPersonal) {
            valor = valor + 50.0;
        }

        double desconto = aplicarDesconto(mesesContratados);
        return valor * (1.0 - desconto);
    }
}