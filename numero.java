import java.util.Scanner;

public class numero{
    public static void  main (String[] args){
        Scanner leer = new Scanner(System.in);
        int n;
        int n2;
        int num;
        int num2;
        n = leer.nextInt();
        n2 = leer.nextInt();
        num = n*10+n2;
        num2 = n2*10+n;
        System.out.println("num1: "+num);
        System.out.println("num2: "+num2);
    }
}