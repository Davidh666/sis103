import java.util.Scanner;
public class primos{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        double p;
        int n;
        n = leer.nextInt();
        p = dpromedio(n);
        visualizar(p);

        
        

    }
    public static double esprimo(int n1){
        int c;
        int cd;
        int esp;
        c=1;
        cd = 0;
        while(c<=n1){
            if(n1%c==0){
                cd = cd + 1;
            }
            c = c + 1;
        }
        if (cd ==2) {
            esp = 1;
        }else{
            esp = 0;
        }
        return esp;




    }
    public static double dpromedio(int n){
        int c;
        double p;
        double s;
        int cp;
        c=2;
        s=0;
        cp=0;
        while(c<=n){
            if(esprimo(c)==1){
                s=s+c;
                cp=cp+1;
            }
            c=c+1;
        }
        p=s/cp;
        return p;    
        
    }
    public static void visualizar(double p){
        System.out.println("El promedio es: "+p);
    }
}