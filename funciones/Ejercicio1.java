import java.util.Scanner;


public class Ejercicio1{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int s;
        num = leer.nextInt();
        num2 = leer.nextInt();
        s = sumar(num,num2);
        visualizar(s);
        leer.close();
        
    
    }
    public static int sumar(int a,int b){
        int s;
        s=a+b;
        return s;
    }
    public static void visualizar(int resultado){
        System.out.println("El resultado es: "+resultado);
    }
}