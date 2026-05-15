import java.util.Scanner;
public class exa{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num2;
        int contador;
        int num;
        double prom;
        num2 = 0;
        contador = 0;
        do{
            num = leer.nextInt();
            if(num%2==0){
                num2 = num2 + num;
            contador = contador +1;
            }
        }while(num!=0);
        prom = num2/contador;
        System.out.println(prom);
    }
}