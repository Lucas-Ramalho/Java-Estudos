package dio.java.desafios;

import java.util.Scanner;

/*Desafio
        Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele
        construísse um programa para verificar, à partir de dois valores inteiros A e B,
        se B corresponde aos últimos dígitos de A.
*/

public class EncaixaNencaixa {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            //complete a resolução do problema com sua solução
            String A = scan.next();
            String B = scan.next();
            if (A.endsWith(B)          ) {
                System.out.println("Encaixa. o valor B corresponde aos ultimos digitos de A");
            }
            else {
                System.out.println("Nao encaixa. o valor B NAO corresponde aos ultimos digitos de A");
            }
        }

    }
}
