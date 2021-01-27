import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);
    
    int idadedias;
    int ano;
    int meses;
    int dias;
        
    idadedias= teclado.nextInt(); 
           
    ano = (idadedias / 365);
    System.out.println(ano +" ano(s)");
    
    meses = (idadedias %365) / 30;
    System.out.println(meses + " mes(es)");
    
    dias = (idadedias %365) % 30;
    System.out.println(dias + " dia(s)");
    
            }
}
