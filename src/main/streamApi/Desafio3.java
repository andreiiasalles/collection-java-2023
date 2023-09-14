package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para verificar se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero > 0);

        // Exiba o resultado no console
        System.out.println(todosPositivos ? "Todos os números são positivos." : "Pelo menos um número não é positivo.");
    }
}
