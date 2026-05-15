import java.util.Scanner;
public class ProyectoImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        PromedioImpar prom1 = new PromedioImpar(n1, n2);
        prom1.calcularPromedioImpar();
        System.out.println("El promedio es: " + prom1.get_promedio());
    }
}
