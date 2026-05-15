import java.util.Scanner;
public class ProyectoPares{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        n1= leer.nextInt();
        n2= leer.nextInt();
        Pares pares1 = new Pares(n1,n2);
        pares1.calcularSumaPares();
        System.out.println(pares1.get_suma());
        
        leer.close();
    }
}
