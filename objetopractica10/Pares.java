public class Pares{
    private int n1;
    private int n2;
    private long suma;
    public Pares(){}
    public Pares(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void set_n1(int n1){
        this.n1=n1;
    }
    public void set_n2(int n2){
        this.n2=n2;
    }
    public int get_n1(){
        return n1;
    }
    public int get_n2(){
        return n2;
    }
    public long get_suma(){
        return suma;
    }
    public void calcularSumaPares(){
        suma=0;
        
        
        for(int i=n1;i<=n2;i++){
            if(i%2==0){
                suma=suma+i;
            }
        }
    }
}
