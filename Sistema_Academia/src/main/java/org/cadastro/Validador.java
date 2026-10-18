package org.cadastro;// org.cadastro.Validador:

import static java.lang.IO.*;
import java.util.Scanner;

public class Validador {

    public static String lerTexto(Scanner scanner, String mensagem) {
        println(mensagem);
        String texto = scanner.nextLine();

        while (texto.trim().equals("") || !texto.matches("[a-zA-ZÀ-ÿ ]+")) {
            println("digite um nome valido");
            println(mensagem);
            texto = scanner.nextLine();
        }
        return texto;
    }

    public static String lerCpf(Scanner scanner, String mensagem) {
        println(mensagem);
        String cpf = scanner.nextLine();

        while (!cpf.matches("\\d{11}")) {
            println("Erro: Digite um CPF valido com exatamente 11 digitos!");
            println(mensagem);
            cpf = scanner.nextLine();
        }
        return cpf;
    }

    public static int lerNumeroInteiro(Scanner teclado, String mensagem) {
        println(mensagem);
        while (!teclado.hasNextInt()) {
            println("Erro: Digite apenas numeros!");
            teclado.next();
            println(mensagem);
        }
        int numero = teclado.nextInt();
        teclado.nextLine();
        return numero;
    }

    public static double lerNumeroDouble(Scanner teclado, String mensagem) {
        println(mensagem);
        while (!teclado.hasNextDouble()) {
            println("Erro: Digite um valor valido (ex: 100.0)!");
            teclado.next();
            print(mensagem);
        }
        double numero = teclado.nextDouble();
        teclado.nextLine();
        return numero;
    }
}