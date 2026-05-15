import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        double ar;
        num1=leer.nextInt();
        num2=leer.nextInt();
        ar=area(num1,num2);
        visualizar(ar);
        leer.close();

    }
    public static double area(int a,int b){
        double ar;
        ar = (a*b)/2;
        return ar;
    }
    public static void visualizar(double area){
        System.out.println("El area es: "+area);
    }

}