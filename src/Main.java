//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        float m = (n1 + n2) / 2;// lembra de expressões numéricas, valor deu 3 porque ele está inteiro, ele foi 3
        System.out.println(m);
        // incremento
        int numero = 5;
        numero ++;
        System.out.println(numero);

        //pós incremento
        int numero2 = 5;
        int valor = numero2 + numero++;// o ++ quando ele vem depois do número, quero somar 5 + 5 depois você coloca incremento
        System.out.println(valor);
        //pré incremento
        int numero3 = 5;
        int valor2 = numero3 + ++numero;// incrementei 3 vezes valor 5. pré incremento vai colocar incremento primeiro
        System.out.println(valor2);
        // decremento é a mesma coisa do incremento

    }
}