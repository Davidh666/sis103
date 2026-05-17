import java.util.Scanner;
public class ProyectoFactorial{
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n;
        n = leer.nextInt();
        factorial fact1 = new factorial(n);
        fact1.sumatoriafactorial();
        System.out.println("promedio es:"+fact1.get_suma());
    }
}