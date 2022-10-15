package FigPlanas;
import java.util.Scanner;
public class trapézio {
    Scanner sc = new Scanner(System.in);
    public double areaTR;
    public double base;
    public double Base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;
    public double lado4;
    public double perimetro;
    public trapézio() {
        areaTR = 0;
        altura = 0;
        base = 0;
        Base = 0;
        lado1 = 0;
        lado2 = 0;
        lado3 = 0;
        lado4 = 0;
        perimetro = 0;
}
    public void calctrap() {
        System.out.println("Digite a base maior");
        Base = sc.nextDouble();
        System.out.println("Digite a base menor");
        base = sc.nextDouble();
        areaTR = ((base + Base) * altura) /2;
        System.out.println("A área do trapézio é: "+areaTR);
    }
    public void perimetro(){
        System.out.println("Digite o 1° lado");
        lado1 = sc.nextDouble();
        System.out.println("Digite o 2° lado");
        lado2 = sc.nextDouble();
        System.out.println("Digite o 3° lado");
        lado3 = sc.nextDouble();
        System.out.println("Digite o 4° lado");
        lado4 = sc.nextDouble();
        perimetro = lado1+lado2+lado3+lado4;
        System.out.println("O perimetro do trapézio é: "+perimetro);
    }
}
