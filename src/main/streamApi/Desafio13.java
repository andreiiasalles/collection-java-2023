package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Defina o intervalo desejado
        int limiteInferior = 6;
        int limiteSuperior = 10;

        // Utilize a Stream API para filtrar os números dentro do intervalo
        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(numero -> numero >= limiteInferior && numero <= limiteSuperior)
                .collect(Collectors.toList());

        // Exiba o resultado no console
        System.out.println("Números dentro do intervalo [" + limiteInferior + ", " + limiteSuperior + "]: " + numerosNoIntervalo);
    }
}
