import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        int p;
        num1=leer.nextInt();
        num2=leer.nextInt();
        p=perimetro(num1,num2);
        visualizar(p);
        leer.close();

    }
    public static int perimetro(int a, int b){
        int p;
        p=2*(a+b);
        return p;
    }
    public static void visualizar(double perimetro){
        System.out.println("El perimetro es: "+perimetro);
    }
}
