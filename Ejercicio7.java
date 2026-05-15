import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador;
        contador =1;
        int n;
        n=leer.nextInt();
        int sum;
        sum=0;
        while(contador <=n){
            if(contador%2==0){
                sum=sum+contador;
            }
            contador=contador+1;

        }
        System.out.println(sum);
    }
    
}
