package com.mycompany.contadordecaracteres_atividade1;

import java.util.Scanner;

public class ContadorDeCaracteres_Atividade1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");

        String frase = scanner.nextLine();

        int numeroDeCaracteres = frase.length();

        System.out.println("O número total de caracteres na frase é: " + numeroDeCaracteres);

        scanner.close();
    }
}
