import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);

    int inicio;
    int fim;
    int total;

    inicio = teclado.nextInt();
    fim = teclado.nextInt();
        
    if (fim <= inicio){
        total = 24 - (inicio - fim);
        System.out.println("O JOGO DUROU "  + total +  " HORA(S)");
    }
    else{
        total = fim - inicio;
        System.out.printf("O JOGO DUROU %d HORA(S)\n",total);
    }
    
    }
}
