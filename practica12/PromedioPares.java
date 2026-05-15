public class PromedioPares {
    private int n1;
    private int n2;
    private double promedioPares;

    public PromedioPares(){}
    public PromedioPares(int n1, int n2){
        this.n1 = n1;
        this.n2 =n2;
    }

    public void set_n1(int n1) {
        this.n1 = n1;
    }

    public void set_n2(int n2) {
        this.n2 = n2;
    }

    public int get_n1() {
        return n1;
    }

    public int get_n2() {
        return n2;
    }

    public double get_promedio() {
        return promedioPares;
    }

    public void calcularPromedioPares(){
        int c = n1;
        int suma  = 0;
        int cp =  0;
        while(c<=n2){
            if(c%2==0){
                suma = suma + c;
                cp = cp + 1;
            }
            c=c+1;

        }
        promedioPares = (double)suma / cp;
    }

}
