package FigPlanas;
import java.util.Scanner;
public class círculo {
    Scanner sc = new Scanner(System.in);
    public double áreaC;
    public double raio;
    public double pi;
    public double perimetro;
    public círculo (){
        áreaC = 0;
        pi = 3.14;
        raio = 0;
    }
    public void calcAC(){
        System.out.println("Digite o raio do círculo:");
        raio = sc.nextDouble();
        áreaC = pi * (raio * raio);
        System.out.println("A área do círculo é: "+áreaC);
    }
    public void perimetro(){
        perimetro = (2*pi)*raio;
        System.out.println("O perimetro do círculo é: "+perimetro);
    }
}
