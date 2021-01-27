import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);

    int hrini;
    int hrfim;
    int minini;
    int minfim;
    int totalhora = 0;
    int totalmin = 0;

    hrini = teclado.nextInt();
    hrfim = teclado.nextInt();
    minini = teclado.nextInt();
    minfim = teclado.nextInt();
        
    if (hrini == hrfim && minini == minfim && hrini == minfim){
        System.out.println("O JOGO DUROU  24 HORA(S) e 0 MINUTO(S)");
    }
    else if(hrini > hrfim){
        totalhora = 24 - (hrini + hrfim);
    }
    else if(hrini < hrfim){
        totalhora = 24 - (24 - (hrfim + hrini));
    }
    else if(minini > minfim){
        totalmin = 60 + (minfim - minini);
    }
    else if(hrini == hrfim){
        totalmin = 24 + (totalhora - 1);
    }
    else if(totalhora = totalhora -1){
    }
    else{
        totalmin = minfim - minini;
        System.out.printf("O JOGO DUROU " + totalhora + " HORA(S) E " + totalmin +  "MINUTO(S)\n");
    }
    
    }
}
