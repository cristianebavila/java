import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
    // vamos somar no Uri1003
    
    Scanner teclado = new Scanner(System.in);
    
    double A;
    double B;
    double MEDIAA;

            A= teclado.nextFloat();

            B= teclado.nextFloat();
    
    MEDIAA = ((A * 3.5f) + (B * 7.5f))/11;

    System.out.printf("MEDIA = %.5f\n" , MEDIAA);
    }
}
