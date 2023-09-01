package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public Integer calcularSoma() {
        int total = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                total += numero;
            }
        } else {
            System.out.println("Não há numeros na lista.");
        }

        return total;
    }


    public Integer encontrarMaiorNumero() {
        int maior;
        if (!numeros.isEmpty()) {
            maior = numeros.get(0);
            for (Integer numero : numeros) {
                if (maior < numero) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("Não há numeros na lista.");
        }
    }

    public Integer encontrarMenorNumero() {
        int menor;

        if(!numeros.isEmpty()){
            menor = numeros.get(0);
            for (Integer numero: numeros) {
                if(menor > numero){
                    menor = numero;
                }
            }
            return menor;
        } else{
            throw new RuntimeException("Não há numeros na lista.");
        }
    }


    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}
