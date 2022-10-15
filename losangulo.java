package FigPlanas;
import java.util.Scanner;
public class losangulo {
    Scanner sc = new Scanner(System.in);
    public double areaL;
    public double diagonal;
    public double Diagonal;
    public double lado;
    public double perimetro;
    
    public losangulo() {
        areaL = 0;
        diagonal = 0;
        Diagonal = 0;
        lado = 0;
        perimetro = 0;
    }
    public void calclos() {
        System.out.println("Digite a maior diagonal do losangulo");
        Diagonal = sc.nextDouble();
        System.out.println("Digite a menor diagonal do losangulo");
        diagonal = sc.nextDouble();
        areaL = (diagonal * Diagonal) /2;
        System.out.println("A área do losangulo é: "+areaL);
    }
    public void perimetro(){
        perimetro = lado * 4;
        System.out.println("O perimetro do losangulo é: "+perimetro);
    }
}
