package funcionnal_interface.example;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    /**
     * Representa uma função que aceirta um argumento do tipo T e retorna um resultado do ripo R.
     * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
     */

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,7,9,21);


        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = n -> n * 2;



        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobro = numeros.stream()
                .map(dobrar)
                .toList();



        // Imprimir numeros dobrados
        numerosDobro.forEach(System.out::println);

    }
}
