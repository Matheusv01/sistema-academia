import org.cadastro.*;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.IO.*;

void main() {
    Scanner teclado = new Scanner(System.in);
    ArrayList<Plano> alunos = new ArrayList<>();
    String opcao = "";

    do {
        println("\n=== SISTEMA DA ACADEMIA ===\n 1- cadastrar pessoa em plano basico\n 2- cadastrar pessoa em plano vip\n 3- mostrar alunos cadastrados\n 0- sair do sistema");
        opcao = readln("\nescolha uma opcao para iniciar: ");

        switch (opcao) {
            case "1":
                if (alunos.size() >= 3) {
                    println("Limite de 3 alunos cadastrados atingido!");
                    break;
                }

                String nomeBasico = Validador.lerTexto(teclado, "Nome do Aluno: ");
                String cpfBasico = Validador.lerCpf(teclado, "Cpf do Aluno: ");
                alunos.add(new PlanoBasico(nomeBasico, cpfBasico, 15.0));
                println("-> org.cadastro.Plano Basico cadastrado com sucesso!");
                break;

            case "2":
                if (alunos.size() >= 3) {
                    println("Limite de 3 alunos cadastrados atingido!");
                    break;
                }

                String nomeVip = Validador.lerTexto(teclado, "Nome do Aluno: ");
                String cpfVip = Validador.lerCpf(teclado, "CPF do Aluno: ");
                int meses = Validador.lerNumeroInteiro(teclado, "quantidade de meses do plano: ");

                int personalOpcao = Validador.lerNumeroInteiro(teclado, "personal incluso? (50 reais)? [1=Sim e 2=Nao]: ");
                while (personalOpcao != 1 && personalOpcao != 2) {
                    println("Erro: Digite apenas 1 para Sim ou 2 para Nao!");
                    personalOpcao = Validador.lerNumeroInteiro(teclado, "personal incluso? (50 reais)? [1=Sim e 2=Nao]: ");
                }boolean querPersonal = (personalOpcao == 1);

                alunos.add(new PlanoVip(nomeVip, cpfVip, meses, querPersonal));
                println("-> org.cadastro.Plano VIP cadastrado com sucesso!");
                break;

            case "3":
                if (alunos.isEmpty()) {
                    println("Nenhum aluno cadastrado.");
                } else {
                    for (Plano aluno : alunos) {
                        InformacoesAluno.mostrarInformacoes(aluno);
                    }
                }
                break;

            case "0":
                println("fechando o sistema!");
                break;
        }
    } while (!opcao.equals("0"));
}