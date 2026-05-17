public class factorial{
    private int n;
    private int x;
    private int y;
    private int suma;

    public factorial(){}
    public factorial(int n){
        this.n = n;
        
    }
    public void set_n(int n){
        this.n = n;
    }
    public void set_x(int x){
        this.x = x;
    }
    public void set_y(int y){
        this.y = y;
    }
    public int get_n(){
        return n;
    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }
    public int get_suma(){
        return suma;
    }

    public void sumatoriafactorial(){
        x=0;
        y=n-1;
        suma = 0; 
        int e;
        int denominador;
        int numerador;
        denominador = 0;
        numerador =0;
        int c;
        c=0;

        
        for(int i= 1; i<=n; i++){
            
            for (int j = 1; j<=n; j++){
                e= (int) Math.pow(x,c);
                
            }

           for(int k= 0;k<=n;k++){
                denominador = denominador+k;
           }
           suma = numerador/denominador;
           
        }
    }

}