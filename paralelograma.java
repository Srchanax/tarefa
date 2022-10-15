package FigPlanas;
import java.util.Scanner;
public class paralelograma {
   Scanner sc = new Scanner(System.in);
    public double base;
    public double altura;
    public double lado;
    public double perimetro;
    public double area;
    public paralelograma(){
        perimetro = 0;
        base = 0;
        altura = 0;
        lado = 0;
        area = 0;
    }
    public void calcPL(){
        System.out.println("Digite a base do paralelograma");
        base = sc.nextDouble();
        System.out.println("Digite o lado do paralelograma");
        lado = sc.nextDouble();
        area = base * lado;
        
    }
    public void perimetro(){
        perimetro = 2*(base + lado);
        System.out.println("O perimetro do paralelograma é: "+perimetro);
    }
}
