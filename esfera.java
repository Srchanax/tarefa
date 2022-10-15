package FigEspace;
import java.util.Scanner;
public class esfera {
    Scanner sc = new Scanner(System.in);
public double raio;
public double volume;
public double diametro;
public double p;
public double areaE;

public esfera () {
System.out.println("Qual o raio da sua esfera?: ");
p = 3.14;
raio = sc.nextDouble();
volume = 0;
}
public void calcV () {
volume = ((4 * p) * (raio * raio * raio)) /3;
System.out.println("O volume da esfera é: " + volume);
}
public void calcDI () {
diametro = (raio * 2);
}
public void calcAE () {
areaE = 4 * p * (raio * raio);
    }
}
