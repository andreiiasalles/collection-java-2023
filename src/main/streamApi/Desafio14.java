package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para encontrar o maior número primo na lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compareTo);

        // Exiba o resultado no console
        System.out.println(maiorPrimo.map(primo -> "Maior número primo na lista: " + primo)
                .orElse("Não há números primos na lista."));
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
