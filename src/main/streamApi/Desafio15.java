package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio15 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para encontrar e exibir o primeiro número negativo da lista
        Optional<Integer> primeiroNegativo = numeros.stream()
                .filter(numero -> numero < 0)
                .findFirst();

        // Exiba o resultado no console
        ((Optional<?>) primeiroNegativo).ifPresent(negativo -> System.out.println("O primeiro número negativo é: " + negativo));
        if (!primeiroNegativo.isPresent()) {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
