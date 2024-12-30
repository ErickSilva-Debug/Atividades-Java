//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int contar = 0;
        while (contar < 11) {
            System.out.println(contar);
            contar++;
            // modificar o fluxo de um laço.
            int cc = 0;
            while (cc < 10) {
                cc++;
                if (cc == 5 || cc == 7 ) {
                    continue;// isso porque se o contador de cambalhota ser 5 e 7 ele vai continuar
                }
                if (cc == 8 || cc == 9) {
                    break;
                }
                System.out.println( "Cambalhota" + cc);
            }
        }
    }
}