package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para filtrar os números maiores que 5 e calcular a média
        OptionalDouble media = numeros.stream()
                .filter(numero -> numero > 5)         // Filtra os números maiores que 5
                .mapToDouble(Integer::doubleValue)    // Converte para um DoubleStream
                .average();                           // Calcula a média (pode ser vazio)

        // Exiba o resultado no console
        if (media.isPresent()) {
            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 para calcular a média.");
        }
    }
}
