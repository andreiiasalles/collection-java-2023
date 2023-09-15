package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para verificar se todos os números são distintos
        boolean todosDistintos = numeros.size() == numeros.stream()
                .collect(Collectors.toSet()) // Converte a lista em um conjunto (remove duplicatas)
                .size(); // Obtém o tamanho do conjunto

        // Exiba o resultado no console
        System.out.println(todosDistintos ? "Todos os números são distintos (não se repetem)." : "Pelo menos um número se repete na lista.");
    }
}
