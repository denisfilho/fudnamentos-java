import java.util.Scanner;

public class ExerciciosLoops {
    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);

        System.out.print("Informe um número: ");

        int num = leTeclado.nextInt();
        System.out.println("Números pares entre "+ num + " e 1000");
        while(num<=1000){
            if(num%2==0){
                System.out.println(num);
            }

            num++;
        }
    }
}
