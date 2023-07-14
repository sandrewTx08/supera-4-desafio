package com.superacodechallenge.TerceiroDesafio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TerceiroDesafioTest {
    @Test
    public void compararArrayETarget1() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 2;

        int count = TerceiroDesafio.compararArrayETarget(2, arr);

        assertEquals(3, count);
    }

    @Test
    public void compararArrayETarget2() {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        int count = TerceiroDesafio.compararArrayETarget(1, arr);

        assertEquals(3, count);
    }
}
