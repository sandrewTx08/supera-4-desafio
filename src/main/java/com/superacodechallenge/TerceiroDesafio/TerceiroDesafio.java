package com.superacodechallenge.TerceiroDesafio;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Target:");
            int target = scanner.nextInt();

            System.out.println("Numero do lista:");
            int numeroTotalDoLista = scanner.nextInt();

            int[] lista = new int[numeroTotalDoLista];

            for (int i = 0; i < lista.length; i++) {
                System.out.println(String.format("[%s/%s] Numero que da lista:", i, lista.length));
                int input = scanner.nextInt();
                lista[i] = input;
            }

            System.out.println(compararArrayETarget(target, lista));

            scanner.close();
        }
    }

    public static int compararArrayETarget(int k, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (Math.abs(arr[i] - (arr.length - i == 1 ? 0 : arr[i + 1])) == k) {
                ++count;
            }
        }

        return count;
    }
}
