package fundamentos.programacao.java;
/*
Objetivo:
Criar um programa Java que calcule a área de um retângulo com base em sua largura e altura.
Instruções:
1. Crie uma classe chamada
CalculadoraAreaRetangulo
2. Dentro da classe, declare duas variáveis do tipo double:largura e altura.
3. Atribua valores às variáveis largura e altura (por exemplo, 5.0e 3.0, respectivamente).
4. Calcule a área do retângulo usando a fórmula: Área = largura x altura
5. Exiba o resultado na tela com uma mensagem informativa.
*/
public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {

        double largura = 5.0d;
        double altura = 3.0d;
        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}


