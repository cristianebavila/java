
import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Por favor, digite um valor da base do quadrado");
        base = teclado.nextDouble();

        System.out.println("Por favor, digite um valor da altura do quadrado");
        altura = teclado.nextDouble();
        
        area = (base * altura)/2;
        System.out.println("A area do quadrado e = " + area);
               
        }

}
        