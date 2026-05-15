import java.util.Scanner;
public class ProyectoSuma{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int a,b,r;
        a= leer.nextInt();
        b= leer.nextInt();
        Suma suma1 = new Suma(a,b);
        suma1.sumar();
        r=suma1.get_resultado();
        System.out.println("El resultado es: "+r);
        
        Suma suma3 = new Suma();
        suma3.set_a(4);
        suma3.set_b(5);
        suma3.sumar();
        r=suma3.get_resultado();
        System.out.println("El resultado es: "+r);
        leer.close();
        
    }
}