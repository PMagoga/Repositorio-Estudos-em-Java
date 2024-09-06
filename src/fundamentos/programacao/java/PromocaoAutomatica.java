package fundamentos.programacao.java;

import org.w3c.dom.ls.LSOutput;

/*
Objetivo:
Criar um programa Java que demonstre a promoção automática de tipos em expressões.
Instruções:
1. Crie uma classe chamada PromocaoAutomatica.
2. Dentro da classe, declare variáveis dos tipos byte, short, char, int, long, float e double.
3. Atribua valores diferentes a cada uma dessas variáveis.
4. Realize operações matemáticas envolvendo essas variáveis(por exemplo, soma, multiplicação, etc.).
5. Exiba os resultados na tela com mensagens informativas.
 */
public class PromocaoAutomatica {
    public static void main(String[] args) {
        // declarando as variáveis
        byte a = 10;
        short b = 20;
        char c = 'A'; // o tipo char é usada para declarar caracteres
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5d;

        // promoção automática: byte e short
        int resultado = a + b;

        System.out.println("Resultado da soma: " + resultado);

        // mais exemplos
        long resultadoLong = d + e; // int promovido para long
        float resultadoFloat = d * f; // int promovido para float
        double resultadoDouble = d * g; //int promovido para double

        System.out.println("Resultado long: " + resultadoLong);
        System.out.println("Resultado float: " + resultadoFloat);
        System.out.println("Resultado Double: " + resultadoDouble);

        // exibindo o valor do char
        System.out.println("Valor do char: " + c);
    }

}
