import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);

    double salario;
    double reajuste;
    double nsalario;
    
    salario = teclado.nextDouble();
    
    if (salario >= 0 && salario <= 400.00){
        reajuste = salario * 0.15f;
        nsalario = (reajuste + salario);
        System.out.printf("Novo salario: %.2f\n" , nsalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: 15 %");
    }
    else if(salario >= 400.01 && salario <= 800.00){
        reajuste = salario * 0.12f;
        nsalario = (reajuste + salario);
        System.out.printf("Novo salario: %.2f\n" , nsalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: 12 %");
    }
    else if(salario >= 800.01 && salario <= 1200.00){
        reajuste = salario * 0.10f;
        nsalario = (reajuste + salario);
        System.out.printf("Novo salario: %.2f\n" , nsalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: 10 %");
    }
    else if(salario >= 1200.01 && salario <= 2000.00){
        reajuste = salario * 0.07f;
        nsalario = (reajuste + salario);
        System.out.printf("Novo salario: %.2f\n" , nsalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: 7 %");
    }
    else{
        reajuste = salario * 0.04f;
        nsalario = (reajuste + salario);
        System.out.printf("Novo salario: %.2f\n" , nsalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: 4 %");
    }
    
    }
}
