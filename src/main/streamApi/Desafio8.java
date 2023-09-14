package main.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .map(numero -> somarDigitos(numero)) // Mapeie cada número para a soma dos dígitos
                .mapToInt(Integer::intValue) // Converte para um IntStream
                .sum(); // Some todas as somas dos dígitos

        // Exiba o resultado no console
        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);

        int somaDosDigitos2 = numeros.stream()
                .map(n -> String.valueOf(n)) // Converte cada número em uma string
                .flatMapToInt(str -> str.chars()) // Obtém os caracteres como IntStream
                .map(Character::getNumericValue) // Converte caracteres em inteiros
                .sum(); // Some todos os dígitos

        // Exiba o resultado no console
        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos2);
    }

    // Método para calcular a soma dos dígitos de um número
    private static int somarDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10; // Adiciona o último dígito à soma
            numero /= 10; // Remove o último dígito do número
        }
        return soma;
    }



}
