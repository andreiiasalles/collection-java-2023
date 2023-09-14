package main.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para encontrar o segundo número maior
        Integer segundoMaior = numeros.stream()
                .distinct() // Remova duplicatas
                .sorted((a, b) -> b.compareTo(a)) // Ordene em ordem decrescente
                .skip(1) // Pule o primeiro elemento (o maior)
                .findFirst() // Pegue o primeiro elemento restante (segundo maior, se existir)
                .orElse(null); // Se não houver segundo maior, retorne null

        // Exiba o resultado no console
        if (segundoMaior != null) {
            System.out.println("O segundo número maior é: " + segundoMaior);
        } else {
            System.out.println("Não há segundo número maior na lista.");
        }

        // Utilize a Stream API para encontrar o segundo número maior refatorado
        Optional<Integer> segundoMaior2 = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        // Exiba o resultado no console
        segundoMaior2.ifPresentOrElse(
                value -> System.out.println("O segundo número maior é: " + value),
                () -> System.out.println("Não há segundo número maior na lista.")
        );
    }
}
