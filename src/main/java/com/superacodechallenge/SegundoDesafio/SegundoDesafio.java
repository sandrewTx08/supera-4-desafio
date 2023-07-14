package com.superacodechallenge.SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    private double dinheiro;
    private final int[] moedasAceitaveis = { 100, 50, 25, 10, 5, 1 };
    private final int[] notasAceitaveis = { 100, 50, 20, 10, 5, 2 };

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public SegundoDesafio(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void logNotasEMoedas() {
        double dinheiro2 = getDinheiro();

        for (int nota : notasAceitaveis) {
            int div = (int) dinheiro2 / nota;
            System.out.println(message(div, nota));
            dinheiro2 -= div * nota;
        }

        int dinheiroMoedas = (int) Math.ceil(
                ((this.dinheiro - (int) this.dinheiro) * 100));

        for (double moeda : moedasAceitaveis) {
            int div = (int) ((int) dinheiroMoedas / moeda);
            System.out.println(message(div, moeda));
            dinheiroMoedas -= div * moeda;
        }
    }

    public String message(int dinheiro, int div) {
        return String.format("%s Notas(s) de R$ %s.00", dinheiro, div);
    }

    public String message(double dinheiro, double div) {
        return String.format("%s Moedas(s) de R$ %s", (int) dinheiro, div);
    }

    public static void main(String[] args) {
        System.out.println("Valor dinheiro: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double input = scanner.nextDouble();

            new SegundoDesafio(input).logNotasEMoedas();

            scanner.close();
        }
    }
}
