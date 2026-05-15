public class Serie{
    private int n;
    private double z;
    public Serie(){}
    public Serie(int n){
        this.n=n;
    }
    private long factorial(int n){
        long p=1;
        for(int i =1;i<=n;i++){
            p=p*i;
        }
        return p;

    }
    public void set_n(int n){
        this.n=n;
    }
    public int get_n(){
        return n;
    }
    public double get_z(){
        return z;
    }
    public void calcularSerie(){
        z=3;
        double termino;
        int numerador= 3;
        int denominador=4;
        int signo=-1;
        int t=2;
        while (t<=n) {
            termino = (double) factorial(numerador) / factorial(denominador);
            z=z+(termino*signo);
            signo =signo*(-1);
            numerador = numerador+2;
            denominador = denominador+2;
            t=t+1;
        }
    }
}