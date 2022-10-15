package FigEspace;
import java.util.Scanner;
public class pirâmide  {
    Scanner sc = new Scanner(System.in);
    public double areaB;
    public double LB;
    public double altura;
    public double areaL;
    public double volume;
    public double areaT;
    public double F;
    public double areaF;
    public double apotema;
    public int ladosB;
    
    public pirâmide(){
        areaB = 0;
        LB = 0;
        altura = 0;
        areaL = 0;
        volume = 0;
        areaT = 0;
        F = 0;
        apotema = 0;
        ladosB = 0;
    }
    public void calcareaL(){
        System.out.println("Digite a medida dos lados da base");
        LB = sc.nextDouble();
        System.out.println("Digite a apótema da pirâmide");
        apotema = sc.nextDouble();
        areaB = LB*LB;
        F = (LB*apotema)/2;
        System.out.println("Digite a quantidade de lados da base");
        ladosB = sc.nextInt();
        areaF = F*ladosB;
        areaT = areaB + areaF;
        System.out.print("A área da pirâmide é: "areaT+);
    }    
    public void calcV(){
        System.out.println("Digite a altura da Pirâmide");
        altura = sc.nextDouble();
        volume = (areaB * altura)/3;
        System.out.println("O volume da pirâmide é: "+volume);
    }
}