package funcionnal_interface.example;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nehum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar,
 * ou retornar um valor.
 */
public class ConsumerExample {
    //atributos
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Consumer aplicando Interface funcional
        //Usando função Lambda (argumento -> corpo)
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }

}
