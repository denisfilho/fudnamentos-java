import java.util.Scanner;

public class VerificaNome {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Informe seu primeiro nome: ");

        String nome = leTeclado.nextLine().trim();


        if(!nome.equals("")){
            System.out.println("Ola, Sr(a) " + nome);
        }
    }

}
