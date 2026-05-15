public class Suma{
    private int a;
    private int b;
    private int resultado;


    public Suma(){}
    public Suma(int a,int b){
        this.a=a;
        this.b=b;
        resultado=0;
    }
    public void sumar(){
        resultado=a+b;
    }
    public void set_a(int a){
        this.a=a;
    }
    public void set_b(int b){
        this.b=b;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public int get_resultado(){
        return resultado;
    }
}