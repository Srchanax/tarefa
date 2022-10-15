package FigEspace;
import java.util.Scanner;
public class cone {
    public double Altura;
public double Raio;
public double Geratriz2;				
public double Pi;
public double Volume;
public double areaT;				
				
public cone() {

Altura = 0;
Raio = 0;
Geratriz2 = Math.pow(Raio,2) * Math.pow(Altura,2);								
Pi = 3.1415;
Volume = 0;
								
}
public void calcVol () {
Volume = (Pi * Math.pow(Raio,2) * Altura) /3;
System.out.println("O volume do cone é: " + Volume);
}
				
public void calcAreaT(){
								
areaT = (Pi * Math.pow(Raio,2)) + (Pi * Raio * Math.pow(Geratriz2,0.5));
System.out.println("A area total do cone é : "+ areaT);								
}				
}
