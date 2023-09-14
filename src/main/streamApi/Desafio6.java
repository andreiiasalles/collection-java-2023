package main.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Desafio6 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);


        //Verificar se a lista contém algum número maior que 10:
        boolean numeroMaior10 = numeros.stream()
                .anyMatch(numero -> numero > 10);

        // Exiba o resultado no console
        System.out.println(numeroMaior10 ? "Há numeros maiores que 10 " : " Não há numeros maiores que 10");
    }
}
