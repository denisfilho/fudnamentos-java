import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Informe o primeiro lado: ");
        double lado1 = leTeclado.nextDouble();
        System.out.print("Informe o primeiro lado: ");
        double lado2 = leTeclado.nextDouble();
        System.out.print("Informe o primeiro lado: ");
        double lado3 = leTeclado.nextDouble();

        double p = (lado1 + lado2 + lado3)/2;
        double A = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));

        System.out.println("A área do triangulo é " + A);
    }
}
