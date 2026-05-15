import java.util.Scanner;
public class sueldo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hor;
        int prec;
        int Suel;
        double total;
        hor = leer.nextInt();
        prec = leer.nextInt();
        Suel = hor * prec;
        total = Suel * 0.1671;
        System.out.println("el sueldo es: " + Suel);
        System.out.println("el total es: " + total);
    }
}
