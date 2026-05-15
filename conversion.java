import java.util.Scanner;



public class conversion {


    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        double n;
        double conver;
        n = leer.nextInt();
        conver = n/48;
        System.out.println("La conversion de dinero es a dolar es: "+conver);
    }
    
}
