package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosSemImpares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números pares
                .collect(Collectors.toList());     // Coleta os resultados em uma lista

        // Exiba a lista resultante no console
        System.out.println("Lista sem números ímpares: " + numerosSemImpares);

    }
}
