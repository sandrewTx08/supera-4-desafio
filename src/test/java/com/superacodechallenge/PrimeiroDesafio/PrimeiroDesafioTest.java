package com.superacodechallenge.PrimeiroDesafio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeiroDesafioTest {
    private final List<Integer> saidaEsperada = Arrays.asList(
            4,
            32,
            34,
            98,
            654,
            3456,
            6789,
            567,
            543,
            87);

    private final List<Integer> entrada = Arrays.asList(
            10,
            4,
            32,
            34,
            543,
            3456,
            654,
            567,
            87,
            6789,
            98);

    @Test
    public void ordenarParesImpares() {
        List<Integer> resultado = PrimeiroDesafio.ordenarParesImpares(
                new ArrayList<Integer>(entrada));

        assertEquals(resultado, saidaEsperada);
    }

    @Test(expected = PrimeiraLinhaInvalida.class)
    public void primeiraEntrada() {
        ArrayList<Integer> entrada2 = new ArrayList<Integer>(entrada);

        entrada2.remove(0);
        entrada2.add(0, -1);

        PrimeiroDesafio.ordenarParesImpares(entrada2);
    }
}
