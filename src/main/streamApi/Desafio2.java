package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para filtrar os números pares e, em seguida, calcule a soma
        int somaDosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números pares
                .mapToInt(Integer::intValue)        // Converte para um IntStream
                .sum();                              // Calcula a soma

        // Exiba a soma dos números pares no console
        System.out.println("Soma dos números pares: " + somaDosPares);

    }
}
