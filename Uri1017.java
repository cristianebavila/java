import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
    
    
    Scanner teclado = new Scanner(System.in);
    
    int gastoh;
    double velo;
    double consumo;
        
    gastoh= teclado.nextInt(); 
    velo= teclado.nextDouble();

    consumo = (gastoh*velo)/12;
    System.out.printf("%.3f\n" , consumo);
    }
}
