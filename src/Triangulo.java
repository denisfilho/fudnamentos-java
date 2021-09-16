/*
public class Triangulo {
    double lado1;
    double lado2;
    double lado3;
    double area;

    public double calcularPerimetro (){
        return (lado1 + lado2 + lado3)/2;
    }
    public double calcularArea (){
        double perimetro = calcularPerimetro();
        return Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
    }
}
*/

public class Triangulo{
    public double[] lados = new double[3];
    public double area;

    public double calcularPerimetro (){
        return (lados[0] + lados[1] + lados[2])/2;
    }
    public double calcularArea (){
        double perimetro = calcularPerimetro();
        return Math.sqrt(perimetro*(perimetro-lados[0])*(perimetro-lados[1])*(perimetro-lados[2]));
    }
}

/**/