import java.util.Scanner;
public class ejercicioprom {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int sum ;
        int prom;
        int n;
        int n2;
        int n3;
         n = leer.nextInt();
         n2 = leer.nextInt();
         n3 = leer.nextInt();
         sum = n+n2+n3;
         prom = sum /3;
         System.out.println("promedio es: "+prom);
    }


}