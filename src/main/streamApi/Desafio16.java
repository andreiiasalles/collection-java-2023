package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para agrupar os números em pares e ímpares
        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));

        // Exiba os resultados no console
        System.out.println("Números pares: " + grupos.get(true));
        System.out.println("Números ímpares: " + grupos.get(false));
    }
}
