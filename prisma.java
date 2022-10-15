package FigEspace;
import java.util.Scanner;
public class prisma {
    Scanner sc = new Scanner (System.in);

public double aresta;
public double volume;
public double areaB;
public double altura;
public double areaP;
public double areaL;

public prisma () {
System.out.println("Digite a aresta do quadrado da base do prisma: ");
aresta = sc.nextDouble();
System.out.println("Digite a altura do prisma: ");
altura = sc.nextDouble();
areaB = 0;
areaP = 0;
areaL = 0;
volume = 0;
}
public void calcA () {
areaP = aresta * 4;
}
public void calcB () {
areaB = 2 * areaP;
}
public void calcV () {
volume = areaB * altura;
System.out.println("O volume do prisma é: " + volume);
}
public void calcL () {
areaL = (aresta * altura) * 4;
}
public void areaP () {
areaP = 2 * areaB + areaL;
System.out.println("A area do prisma é: " + areaP);
}
}
