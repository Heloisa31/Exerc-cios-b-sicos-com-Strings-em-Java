package com.mycompany.remocaoespacos_atividade8;

import java.util.Scanner;

public class RemocaoEspacos_Atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo (com espaços no início ou fim): ");
        String nomeComEspacos = scanner.nextLine();

        String nomeLimpo = nomeComEspacos.trim();

        System.out.println("Nome original: '" + nomeComEspacos + "'");
        System.out.println("Nome limpo: '" + nomeLimpo + "'");

        scanner.close();
    }
}
