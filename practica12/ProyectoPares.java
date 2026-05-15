import java.util.Scanner;
public class ProyectoPares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        PromedioPares prom1 = new PromedioPares(n1, n2);
        prom1.calcularPromedioPares();
        System.out.println("El promedio es: " + prom1.get_promedio());
    }
}
