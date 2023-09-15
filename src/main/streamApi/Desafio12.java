package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para encontrar o produto de todos os números
        long produto = numeros.stream()
                .mapToLong(Integer::longValue) // Converte para um LongStream
                .reduce(1L, (a, b) -> a * b);   // Reduz os elementos multiplicando

        // Exiba o resultado no console
        System.out.println("Produto de todos os números: " + produto);
    }
}
