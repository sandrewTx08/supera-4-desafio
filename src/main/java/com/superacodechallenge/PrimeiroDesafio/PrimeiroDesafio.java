package com.superacodechallenge.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Numero de linhas:");

            ArrayList<Integer> valores = new ArrayList<Integer>();

            Integer totalDeLinhas = scanner.nextInt();

            valores.add(totalDeLinhas);

            for (Integer i = 0; i < totalDeLinhas; i++) {
                System.out.println("Linha " + i + "/" + totalDeLinhas);
                int valor = scanner.nextInt();
                valores.add(valor);
            }

            List<Integer> valoresOrdenados = ordenarParesImpares(valores);

            System.out.println("Saida: ");
            for (int valor : valoresOrdenados) {
                System.out.println(valor);
            }

            scanner.close();
        }
    }

    public static List<Integer> ordenarParesImpares(ArrayList<Integer> valores) {
        if (valores.get(0) != (valores.size() - 1)) {
            throw new PrimeiraLinhaInvalida();
        } else {
            valores.remove(0);
        }

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        List<Integer> valoresOrdenados = new ArrayList<Integer>(pares);
        valoresOrdenados.addAll(impares);

        return valoresOrdenados;
    }
}
