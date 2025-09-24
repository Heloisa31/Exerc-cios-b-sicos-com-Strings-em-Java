package com.mycompany.verificadorpalindromo_atividade4;

import java.util.Scanner;

public class VerificadorPalindromo_Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        // Cria um StringBuilder a partir da palavra, inverte e converte de volta para String
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        scanner.close();
    }
}
