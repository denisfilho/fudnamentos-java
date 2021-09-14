//crie um programa java que exiba uma opcao de menu
// 1- somar 2 numeros
// 2 - subtrair 2 numeros
// 3 - sair
// realize a operacao escolhida pelo usuario.

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        int opcao;
        double n1, n2;
        do{

            System.out.println("1 - Somar 2 número");
            System.out.println("2 - Subtrair 2 número");
            System.out.println("3 - Sair");
            System.out.print("Informe uma opção: ");

            opcao = leTeclado.nextInt();

            if (opcao == 1){
                System.out.println("Informe dois números");
                n1 = leTeclado.nextDouble();
                n2 = leTeclado.nextDouble();
                double soma = n1+n2;
                System.out.println("Soma = " + soma);
            }
            else if (opcao == 2){
                System.out.println("Informe dois números");
                n1 = leTeclado.nextDouble();
                n2 = leTeclado.nextDouble();
                double sub = n1-n2;
                System.out.println("Subtração = " + sub);
            }
        }while (opcao != 3);
        System.out.println("Finalizado");
    }
}
