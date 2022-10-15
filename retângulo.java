package FigPlanas;
import java.util.Scanner;
public class retângulo {
    Scanner sc = new Scanner(System.in);
    public double areaR;
    public double L;
    public double l;
    public double perimetro;
    public retângulo() {
    areaR = 0;
    L = 0;
    l = 0;
    }
    public void calcreto() {
        System.out.println("Digite o maior lado do retângulo:");
        L = sc.nextDouble();
        System.out.println("Digite o menor lado do retângulo:");
        l = sc.nextDouble();
        areaR = L * l;
        System.out.println("A área do retângulo é "+areaR);
    }
    public void perimetro(){
        perimetro = (L*2)+(l*2);
        System.out.println("O perimetro do retângulo é: "+perimetro);
    }
}
