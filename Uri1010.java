import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
    
    
    Scanner teclado = new Scanner(System.in);
    
    int codp1;
    int nump1;
    double valorp1;
    
    int codp2;
    int nump2;
    double valorp2;
    double valorpago;
    
    codp1= teclado.nextInt(); nump1= teclado.nextInt(); valorp1= teclado.nextDouble();
    codp2= teclado.nextInt(); nump2= teclado.nextInt(); valorp2= teclado.nextDouble();

    valorpago = ((nump1 * valorp1) + (nump2 * valorp2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorpago);
    }
}
