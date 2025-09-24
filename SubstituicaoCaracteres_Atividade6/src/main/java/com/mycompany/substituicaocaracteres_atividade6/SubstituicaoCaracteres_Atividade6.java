package com.mycompany.substituicaocaracteres_atividade6;

import java.util.Scanner;

public class SubstituicaoCaracteres_Atividade6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String fraseOriginal = scanner.nextLine();

        // Substitui todas as ocorrências de 'a' por 'e'
        String fraseModificada = fraseOriginal.replace('a', 'e');

        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase modificada: " + fraseModificada);

        scanner.close();
    }
}