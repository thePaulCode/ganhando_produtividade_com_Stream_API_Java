package funcionnal_interface.example;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    /**
     *  Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     *  É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vinda(o)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(999)
                .toList();

                listaSaudacoes.forEach(System.out::println);

    }
}
