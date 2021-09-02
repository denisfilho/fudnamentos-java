import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leteclado = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leteclado.next();

        System.out.println("Ola, "+nome);
    }
}
