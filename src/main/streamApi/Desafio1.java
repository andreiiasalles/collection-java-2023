package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para ordenar a lista em ordem crescente
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        // Exiba a lista ordenada no console
        System.out.println("Lista ordenada em ordem crescente: " + numerosOrdenados);




        // Utilize uma expressão lambda para ordenar a lista em ordem crescente
        List<Integer> numerosOrdenados2 = numeros.stream()
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());

        // Exiba a lista ordenada no console
        System.out.println("Lista ordenada em ordem crescente: " + numerosOrdenados2);
    }


}
