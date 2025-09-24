package com.mycompany.contadorvogais_atividade7;

import java.util.Scanner;

public class ContadorVogais_Atividade7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase para contar as vogais: ");
        String frase = scanner.nextLine();

        int contadorVogais = 0;
        String fraseMinuscula = frase.toLowerCase(); // Converte para minúsculas

        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char caractere = fraseMinuscula.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("A frase possui " + contadorVogais + " vogais.");
        scanner.close();
    }
}
