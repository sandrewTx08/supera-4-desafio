package com.superacodechallenge.QuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digitar o numero de linhas");
            int numeroDeLinhas = scanner.nextInt();

            for (int i = 0; i < numeroDeLinhas; i++) {
                String linha = scanner.nextLine();

                while (linha.isEmpty()) {
                    linha = scanner.nextLine();
                }

                StringBuilder parte1 = new StringBuilder(
                        linha.substring(0, linha.length() / 2))
                        .reverse();

                StringBuilder parte2 = new StringBuilder(
                        linha.substring(linha.length() / 2, linha.length()))
                        .reverse();

                System.out.println(parte1.toString() + parte2.toString());
            }

            scanner.close();
        }
    }
}
