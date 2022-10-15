package FigEspace;
import java.util.Scanner;
public class cilindro {
    Scanner sc = new Scanner(System.in);
public double raio;
public double altura;
public double volume;
public double areaT;
public double pi;
public cilindro() {
System.out.println("Digite o raio do cilindro: ");
raio = sc.nextDouble();
System.out.println("Digite a altura do cilindro: ");
altura = sc.nextDouble();
pi = 3.14;
volume = 0;
areaT = 0;
}
public void calcV () {
volume = pi * (raio * raio) * altura;
System.out.println("O volume do cilindro é: " + volume);
}
public void areaTO () {
areaT = 2 * pi * (raio * raio) * altura;
System.out.println("A area total do cilindro é: " + areaT);
}
}
