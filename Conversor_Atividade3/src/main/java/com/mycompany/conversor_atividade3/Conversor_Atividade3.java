package com.mycompany.conversor_atividade3;

import java.util.Scanner;

public class Conversor_Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        String emMaiusculas = texto.toUpperCase();
        String emMinusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + emMaiusculas);
        System.out.println("Texto em minúsculas: " + emMinusculas);

        scanner.close();
    }
}
