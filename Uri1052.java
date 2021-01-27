import java.util.Scanner;

public class Uri1052{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);

    int cod;
    String mes;

    cod = teclado.nextInt();

    if (cod == 1) {
        mes = "January";
    }
    else if (cod == 2){
        mes = "February";
    }
    else if (cod ==3){
        mes = "March";
    }
    else if (cod == 4){
        mes = "April";
    }
    else if (cod == 5){
        mes = "May";
    }
    else if (cod == 6){
        mes = "June";
    }
    else if (cod == 7){
        mes = "July";
    }
    else if(cod == 8){
        mes = "August";
    }
    else if(cod == 9){
        mes = "September";
    }
    else if(cod == 10){
        mes = "October";
    }
    else if(cod == 11){
        mes = "November";
    }
    else{
        mes = "December";
    }
    System.out.println(mes);
    
    }
}
