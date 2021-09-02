import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leteclado = new Scanner(System.in);

        float a = leteclado.nextFloat();
        float b = leteclado.nextFloat();

        //float media = (a+b)/2;

        System.out.println("A sua média é: " + (a+b)/2);
    }
}
