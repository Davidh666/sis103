import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num2,num3;
        double prom;
        num = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        prom = promedio(num,num2,num3);
        visualizar(prom);
        leer.close();
        
    }
    public static double promedio(int a,int b, int c){
        double prom;
        prom = (a + b + c) / 3.0;
        return prom;
    }
    public static void visualizar(double promedio){
        System.out.println("El promedio es: "+promedio);
    }
}