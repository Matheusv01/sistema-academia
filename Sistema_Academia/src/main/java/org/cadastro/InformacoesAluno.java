package org.cadastro;

import static java.lang.IO.*;

public class InformacoesAluno {

    public static void mostrarInformacoes(Plano aluno) {
        println("\n=== ALUNO CADASTRADO ===");
        println("Nome: " + aluno.getNomeAluno());
        println("CPF: " + aluno.getCpf());
        println("Valor base: R$ " + aluno.getValorBase());
        println("Mensalidade: R$ " + aluno.calcularMensalidade());
    }
}