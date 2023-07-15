package com.superacodechallenge.TerceiroDesafio;

import java.util.Arrays;
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
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        int count = 0;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];
            if (diff == k) {
                count++;
                left++;
                right++;
            } else if (diff < k) {
                right++;
            } else {
                left++;
                if (left == right) {
                    right++;
                }
            }
        }

        return count;
    }
}
