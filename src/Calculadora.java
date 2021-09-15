import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);

        final int OPCAO1 = 1;
        final int OPCAO2 = 2;
        final int OPCAO3 = 3;
        final int OPCAO4 = 4;
        final int OPCAO5 = 5;

        double n1=0, n2=0;

        boolean saida = false;

        do{
            System.out.println("1 - Sair");
            System.out.println("2 - Somar 2 números");
            System.out.println("3 - Subtrair 2 números");
            System.out.println("4 - Multiplicar 2 números");
            System.out.println("5 - Dividir 2 números");
            System.out.print("Informe uma opcao: ");

            int opcao = leTeclado.nextInt();

            if(opcao>=OPCAO2 && opcao <=OPCAO5){
                System.out.print("Informe o primeiro número: ");
                n1 = leTeclado.nextDouble();
                System.out.print("Informe o segundo número: ");
                n2 = leTeclado.nextDouble();
            }

            switch (opcao){
                case OPCAO1:
                    System.out.println("Programa finalizado");
                    saida = true;
                    break;
                case OPCAO2:
                    System.out.println("A soma de "+ n1 + " e " + n2 + " é igual " + (n1+n2));
                    break;
                case OPCAO3:
                    System.out.println("A subtração de "+ n1 + " e " + n2 + " é igual " + (n1-n2));
                    break;
                case OPCAO4:
                    System.out.println("A multiplicação de "+ n1 + " e " + n2 + " é igual " + (n1*n2));
                    break;
                case OPCAO5:
                    System.out.println("A divisão de "+ n1 + " e " + n2 + " é igual " + (n1/n2));
                    break;
                default:
                    System.out.println("A opção "+ opcao + " é inválida");
            }
        }while(!saida);
    }
}
