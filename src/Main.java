import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// e uma classe para colocar uma funcionalidade de código de entrada
        System.out.println("Digite o nome do aluno: ");
        String completo = teclado.nextLine();//Captura uma linha inteira de texto digitada pelo usuário e armazena na variável completo.
        System.out.println("Valor da nota do aluno: " + completo);
        float nota = teclado.nextFloat();
        System.out.format("Nota de", completo, nota);//usado para exibir mensagens formatadas no console, permitindo maior controle sobre como os dados são apresentados
        //esta dizendo, escreva a nota é %f, transformando numero em real, vírgula separando itens e nota, mas se voce quer colocar duas caass decimais so colocar %.2f(.2 e colocar duas casas decimais)
// %s adiciona a string
//format e o formato
// Entrada de dados
// Java ele já vem com o conjunto de bibliotecas que é java.lang, mas ele já vem carregado, mas o java.lang não tem comando específico para entrada de Dados, vou te que utilizar uma outra classe Java.util.Scanner, não e carregado, então tem que usar import
        int idade = 30;
        String valor = Integer.toString(idade);
        //Converter um número inteiro para string
        System.out.println("Valor da idade do aluno: " + valor);
        String numero = "50";
        int conveter  = Integer.parseInt(numero);
        System.out.println("Valor da conveter do aluno: " + conveter);

    }

}