package com.mycompany.extracaosubstring_atividade5;

import java.util.Scanner;

public class ExtracaoSubstring_Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        if (frase.length() >= 5) {
            String primeirosCinco = frase.substring(0, 5);
            System.out.println("Os 5 primeiros caracteres são: " + primeirosCinco);
        } else {
            System.out.println("A frase é muito curta! Ela tem menos de 5 caracteres.");
            System.out.println("A frase inteira é: " + frase);
        }

        scanner.close();
    }
}
