package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para encontrar a soma dos quadrados de todos os números
        int somaDosQuadrados = numeros.stream()
                .map(numero -> numero * numero) // Mapeie cada número para o seu quadrado
                .mapToInt(Integer::intValue)    // Converte para um IntStream
                .sum();                         // Some todos os quadrados

        // Exiba o resultado no console
        System.out.println("Soma dos quadrados de todos os números: " + somaDosQuadrados);
    }
}
