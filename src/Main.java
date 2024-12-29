//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Operador ternário
        int number1 =4, number2 =8;
        int resultado = (number1 > number2) ? 0 : 1;
        System.out.println(resultado);
        //Comparação String
        String nome1 = "Erick";
        String nome2 = "Silva";
        String nome3 = new String("Erick");
        String res = (nome1.equals(nome3)) ? "Igual" : "Diferente";// se eu colocar nome3 vai mostrar e diferente, o ultimo objeto foi instanciar utilizando a clásula new, conteúdo e igual, mas objeto não
        //.equals() é o método que verifica igual o CONTEÚDO DO OUTRO OBJETO
        System.out.println(res);

    }
}