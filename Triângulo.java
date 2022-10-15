package FigPlanas;
import java.util.Scanner;
public class Triângulo {
    Scanner sc = new Scanner(System.in);
    public double base;
    public double altura;
    public double areaT;
    public double lado;
    public double perimetro;
    public Triângulo() {
        altura = 0;
        base = 0;
        areaT = 0;
        lado = 0;
        perimetro = 0;
    }
    public void calcareaT() {
        System.out.println("Digite a base do triângulo: ");
        base = sc.nextDouble(); 
        System.out.println("Digite a altura do triângulo:");
        altura = sc.nextDouble();
        areaT = (base * altura) /2;
        System.out.println("A área do triângulo é "+areaT);
    }
    public void perimetro(){
        perimetro = lado*3;
        System.out.println("O perimetro do triângulo é: "+perimetro);
    }
}
