import java.util.Scanner;

public class Teste1POOTriangulo {
    public static void main(String[] args) {
        /*Triangulo Tri = new Triangulo();
        Scanner leTeclado = new Scanner(System.in);
        //Triângulo 1
        System.out.println("Para o Triângulo 1");
        System.out.print("Informe o lado1: ");
        Tri.lado1 = leTeclado.nextDouble();
        System.out.print("Informe o lado2: ");
        Tri.lado2 = leTeclado.nextDouble();
        System.out.print("Informe o lado3: ");
        Tri.lado3 = leTeclado.nextDouble();

        Tri.area = Tri.calcularArea();

        //Triângulo 2
        Triangulo Tri2 = new Triangulo();
        System.out.println("Para o Triângulo 2");
        System.out.print("Informe o lado1: ");
        Tri2.lado1 = leTeclado.nextDouble();
        System.out.print("Informe o lado2: ");
        Tri2.lado2 = leTeclado.nextDouble();
        System.out.print("Informe o lado3: ");
        Tri2.lado3 = leTeclado.nextDouble();

        Tri2.area = Tri2.calcularArea();

        System.out.println("O triângulo de maior área possui: ");

        if( Tri.area > Tri2.area){
            System.out.println("- Área: " + Tri.area);
            System.out.println("- Lados: " + Tri.lado1 + ", " + Tri.lado1 + ", " + Tri.lado1);
        }
        else{
            System.out.println("- Área: " + Tri2.area);
            System.out.println("- Lados: " + Tri2.lado1 + ", " + Tri2.lado1 + ", " + Tri2.lado1);
        }
        */









        /*
        Triangulo Tri = new Triangulo();
        Scanner leTeclado = new Scanner(System.in);

        for (int i =0; i<Tri.lados.length; i++){
            System.out.print("Informe o lado " + (i+1) + ": ");
            Tri.lados[i] = leTeclado.nextDouble();
        }
        System.out.println(Tri.calcularArea());
        */


        Triangulo tri[] = new  Triangulo[2];
        Scanner leTeclado = new Scanner(System.in);

        //throw ne456w NullPointerException();
        //System.out.println(Tri.length);
        //for (int i =0; i<2; i++) {
            //tri[i] = new Triangulo();
        //}

        for (int i =0; i<tri.length; i++){
            tri[i] = new Triangulo();
            for (int j =0; j<tri[i].lados.length; j++) {
                System.out.print("Informe o lado " + (j + 1) + " do triângulo " + (i + 1) + " : ");
                tri[i].lados[j] = leTeclado.nextDouble();
            }
            tri[i].area = tri[i].calcularArea();
        }
        int indice_maior=0;
        for (int i =1; i < tri.length; i++){
            if(tri[i].area > tri[indice_maior].area){
                indice_maior = i;
            }
        }
        System.out.println("O triângulo de maior área possui: ");
        System.out.println("- Lados: " + tri[indice_maior].lados[0] + ", " + tri[indice_maior].lados[1] + ", " + tri[indice_maior].lados[2]);
        System.out.printf("- Área: %.2f", tri[indice_maior].area);

        /**/
    }
}
