package FigEspace;
import java.util.Scanner;
public class paralelepípedo  {
    Scanner sc = new Scanner (System.in);
public double aresta;
public double volume;
public double areaL;
public double areaT;
public double areaF;
 
public paralelepipedo () {
System.out.println("Digite a arest do cubo: ");
aresta = sc.nextDouble();
volume = 0;
areaT = 0;
areaL = 0;
areaF = aresta * aresta;
}
public void calcV () {
volume = (aresta * aresta *aresta);
System.out.println("O volume do paralelepidedo é: " + volume);
}
public void calcAT() {
areaT = (6 * aresta * aresta);
System.out.println("A area total do paralelepidedo é: " + areaT);
}
public void calcL() {
areaL = (areaF * 4);
System.out.println("A area lateral do paralelepidedo é: " + areaL);
}
}
