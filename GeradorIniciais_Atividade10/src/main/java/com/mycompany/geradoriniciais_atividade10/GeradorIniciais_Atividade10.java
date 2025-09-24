package com.mycompany.geradoriniciais_atividade10;

import java.util.Scanner;

public class GeradorIniciais_Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] nomes = nomeCompleto.split(" "); // Divide a string em um array de palavras
        StringBuilder iniciais = new StringBuilder();

        for (String nome : nomes) {
            // Garante que não pegamos iniciais de "espaços vazios" se houver mais de um espaço entre nomes
            if (!nome.isEmpty()) { 
                iniciais.append(nome.charAt(0));
            }
        }

        System.out.println("As iniciais são: " + iniciais.toString().toUpperCase());

        scanner.close();
    }
}
