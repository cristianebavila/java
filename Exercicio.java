
import java.util.Scanner;

public class Exercicio{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double lado1;
        double lado2;
        double area;

        System.out.println("Por favor, digite um valor lado1 do quadrado");
        lado1 = teclado.nextDouble();

        System.out.println("Por favor, digite um valor lado2 do quadrado");
        lado2 = teclado.nextDouble();
        
        area = lado1 * lado2;
        System.out.printf("A area do quadrado e = %.3f\n", area);
        // printf restringe a qtd de casas decimais depois do ponto %.3f
        // o  /n pula a linha       
        }

}
        