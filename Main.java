package Principal;
import java.util.Scanner;
import FigPlanas.*;
import FigEspace.*;
public class Main {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

System.out.println("Qual tipo de figura você deseja?");
System.out.println("\t[1] Figura Planas");
System.out.println("\t[2] Figuras Espaciais");
System.out.println("\t[3] Sair");
int opcao1 = sc.nextInt();

if(opcao1 == 1) {
System.out.println("Qual figura plana? ");
System.out.println("\t[1] Triângulo");
System.out.println("\t[2] Quadrado");
System.out.println("\t[3] Círculo");
System.out.println("\t[4] Trapézio");
System.out.println("\t[5] Paralelogramo");
System.out.println("\t[6] Retângulo");

int opcao2 = sc.nextInt();
switch(opcao2) {
case 1:
Triângulo Tri1 = new Triângulo();
Tri1.calcareaT();
Tri1.perimetro();
break;
case 2:
quadrado Qua1 = new quadrado();
Qua1.calcarea();
Qua1.perimetro();
break;
case 3:
círculo Cir1 = new círculo();
Cir1.calcAC();
Cir1.perimetro();
break;
case 4:
trapézio  tra1 = new trapézio ();
tra1.calctrap();
tra1.perimetro();
break;
case 5:
paralelograma par1 = new paralelograma();
par1.calcPL();
par1.perimetro();
break;
case 6:
retângulo ret1 = new retângulo();
ret1.calcreto();
ret1.perimetro();
break;
default:
System.out.println("Digite uma opção valida");
break;
}
}
else if (opcao1== 2){

System.out.println("Qual figura espacial : ");
System.out.println("\t[1] Cilindro");
System.out.println("\t[2] Cone");
System.out.println("\t[3] Cubo");
System.out.println("\t[4] Esfera");
System.out.println("\t[5] Pirâmide");
System.out.println("\t[6] Prisma");

int opcao3 = sc.nextInt();
switch(opcao3) {
case 1:
cilindro cl1 = new cilindro();
cl1.calcV();
cl1.areaTO();
break;
case 2:
cone con1 = new cone();
con1.calcV();                  
break;
case 3:
cubo cub1 = new cubo();
cub1.calcL();
cub1.calcAT();
cub1.calcV();
break;
case 4:
esfera ef = new esfera();
ef.calcAE();
ef.calcV();
break;
case 5:
pirâmide  pr1 = new pirâmide ();
pr1.calcareaL();
pr1.calcV();
break;
case 6:
prisma pri1 = new prisma();
pr1.calcV();
pri1.areaP();
break;
default:
break;
}
}
else if(opcao1 ==3) {
System.out.println("Acabo :)");
}
else {
System.out.println("Oxi!?");
}





}

  
    }
    

