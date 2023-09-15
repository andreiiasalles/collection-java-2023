package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1);

        // Utilize a Stream API para verificar se todos os números são iguais
        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        // Exiba o resultado no console
        System.out.println(todosIguais ? "Todos os números da lista são iguais." : "Pelo menos dois números são diferentes na lista.");
    }
}
