import java.util.Scanner;

public class EstruturaDoWhileMelhorada {
    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);

        int opcaoUsuario;
        final int OPCAO_1 = 1;
        final int OPCAO_2 = 2;
        final int OPCAO_SAIR = 3;

        do{

            System.out.println("1 - Somar 2 número");
            System.out.println("2 - Subtrair 2 número");
            System.out.println("3 - Sair");
            System.out.print("Informe uma opção: ");

            opcaoUsuario = leTeclado.nextInt();
            if (opcaoUsuario == OPCAO_SAIR){
                break;
            }
            if (opcaoUsuario < OPCAO_1 || opcaoUsuario > OPCAO_SAIR){
                System.out.println("A opcao "+ opcaoUsuario + " informada é inválida");
                continue;
            }

            System.out.println("Informe dois números");
            double n1 = leTeclado.nextDouble();
            double n2 = leTeclado.nextDouble();

            if (opcaoUsuario == OPCAO_1){
                System.out.println("A soma entre " + n1 + " e " + n2 + " é " + (n1+n2));
            }
            else{
                System.out.println("A diferença entre " + n1 + " e " + n2 + " é " + (n1-n2));
            }

        }while (true);

        System.out.println("Programa Finalizado");
    }
}
