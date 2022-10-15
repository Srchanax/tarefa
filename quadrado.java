package FigPlanas;
import java.util.Scanner;
public class quadrado {
    Scanner sc = new Scanner(System.in);    
    public double lado;
    public double área;
    public double perimetro;
    public quadrado() {
        lado = 0;
        área = 0;
        perimetro = 0;
    }
    public void calcarea() {
        System.out.println("Digite o lado do quadrado:");
        lado = sc.nextDouble();
        área = lado * lado;
        System.out.println("A área do quadrado é "+área);
    }
    public void perimetro(){
        perimetro = lado * 4;
        System.out.println("O perimetro do quadrado é: "+perimetro);
    }
}
