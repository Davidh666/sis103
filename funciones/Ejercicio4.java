import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        double h;
        num = leer.nextInt();
        h = hora(num);
        visualizar(h);
      
    }
    public static  double hora(int a){
        double h;
        h = a/60.0;
        return h;
    }
    public static void visualizar(double hora){
        System.out.println("La hora es: "+hora);
    }
}