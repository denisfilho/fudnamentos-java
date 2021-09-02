import java.util.Scanner;

public class TipoReferenciadoString {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int a = leTeclado.nextInt(); //Endrigo
        String nome = leTeclado.next();
        double nota = leTeclado.nextDouble();

        System.out.println(a);
        System.out.println(nome);
        System.out.println(nota);
    }
}
