package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args){
        // iniciando o conjunto
        Set<Integer> numeros = new HashSet<>();

        // adicionando números ao conjunto
        numeros.add(5);
        numeros.add(15);
        numeros.add(35);

        //verificando se o o número 15 está presente
        boolean contemNumero15 = numeros.contains(15);
        System.out.println("No conjunto há o número 15: " + contemNumero15);

        // removendo o número 5
        numeros.remove(5);

        // imprimindo os números restantes
        System.out.println("Número do conjunto: " + numeros);

    }
}
