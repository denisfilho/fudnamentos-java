import java.util.Scanner;

public class verificaParImpar {
    public static void main(String[] args) {
        Scanner leNumero = new Scanner(System.in);
        /*
        System.out.print("Informe um número: ");

        int num = leNumero.nextInt();

        if(num%2==0){
            System.out.println("O número " + num + " é par");
        }
        else{
            System.out.println("O número " + num + " é ímpar");
        }
        */

        System.out.print("Informe primeiro lado: ");
        float l1 = leNumero.nextFloat();
        System.out.print("Informe segundo lado: ");
        float l2 = leNumero.nextFloat();
        System.out.print("Informe terceiro lado: ");
        float l3 = leNumero.nextFloat();

        if(l1==l2 && l2==l3){
            System.out.println("Equilátero");
        } else{
            if(l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("Isósceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }
        /**/
        /*
        System.out.print("Informe a primeira nota: ");
        float n1 = leNumero.nextFloat();
        System.out.print("Informe a segunda nota: ");
        float n2 = leNumero.nextFloat();
        float media = (n1 + n2)/2;

        if (media>=7){
            System.out.print("Aprovado");
        }else if(media>=4){
                System.out.print("Final");
        }
        else{
                System.out.print("Reprovado");
        }
        System.out.print(" com média " + media);
        */
    }
}
