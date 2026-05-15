import java.util.Scanner;
public class ProyectoSerie{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n;
        n= leer.nextInt();
        Serie serie1 = new Serie(n);
        serie1.calcularSerie();
        System.out.println(serie1.get_z());
        Serie serie2 = new Serie();
        serie2.set_n(4);
        serie2.calcularSerie();
        System.out.println(serie2.get_z());
        leer.close();
    }
}