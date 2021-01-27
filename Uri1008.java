import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
    
    
    Scanner teclado = new Scanner(System.in);
    
    int func;
    double horas;
    double valhora;
    double salario;

            func= teclado.nextInt();
            horas= teclado.nextDouble();
            valhora= teclado.nextDouble();

    
    salario = horas * valhora;

    System.out.println("NUMBER = " + func);
    System.out.printf("SALARY = U$ %.2f\n" , salario);
    }
}
