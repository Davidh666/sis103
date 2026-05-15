public class PromedioPrimos {
    private  int n1;
    private  int n2;
    private double promedioPrimos;
    
    public PromedioPrimos(){}
    public PromedioPrimos(int n1, int n2){
        this.n1 = n1;
        this.n2 =n2;

    }
    private int esPrimo (int n){
        int primo = 1;
        for(int i=2; i<n; i++){
            if(n%i ==0){
                primo = 0;
            }
        }//finfor
    return primo;
    }

    public void set_n1(int n1) {
        this.n1 = n1;
    }

    public void set_n2(int n2) {
        this.n2 = n2;
    }
    public int get_n1(){
        return n1;
    }
    public int get_n2(){
        return n2;
    }
    public double get_promedio(){
        return promedioPrimos;
    }

    public void calcularPromedio(){
        int c = n1;
        int suma  = 0;
        int cp =  0;
        while(c<=n2){
            if(esPrimo(c)==1){
                suma = suma + c;
                cp = cp + 1;
            }
            c=c+1;

        }
        promedioPrimos = (double)suma / cp;
    }
}
