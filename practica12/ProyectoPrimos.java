import java.util.Scanner;
public class ProyectoPrimos {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        double prom;
        n1= leer.nextInt();
        n2= leer.nextInt();
        PromedioPrimos prom1 = new PromedioPrimos(n1,n2);
        prom1.calcularPromedio();
        prom = prom1.get_promedio();
        System.out.println("El promedio es: "+prom);
        PromedioPrimos prom2 = new PromedioPrimos(2,9);
        prom2.calcularPromedio();
        prom = prom2.get_promedio();
        System.out.println("El promedio es: "+prom2.get_promedio());
        
        leer.close();
    }
}