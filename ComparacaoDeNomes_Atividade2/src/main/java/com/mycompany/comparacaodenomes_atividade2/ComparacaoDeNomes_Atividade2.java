package com.mycompany.comparacaodenomes_atividade2;

import java.util.Scanner;

public class ComparacaoDeNomes_Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o segundo nome: ");
        String nome2 = scanner.nextLine();

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais.");
        } else {
            System.out.println("Os nomes são diferentes.");
        }

        scanner.close();
    }
}
