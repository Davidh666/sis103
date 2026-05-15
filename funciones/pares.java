public class pares {
    public static void main(String[] args) {
        int c;
        int sum = 0;
        for(c=51;c<=120;c++){
            if (espar(c)==1) {
                sum += c;
                
            }
        }
        System.out.println( sum);
    }
    
    public static int espar(int a){
        int par;
        if(a%2==0){
            par=1;
        }else{
            par=0;
        }
        return par;
    }
    
    public static int sumEvenNumbers(int s, int e) {
        int sum = 0;
        for(int i=s; i<=e; i++) {
            if (espar(i)==1) {
                sum += i;
            }
        }
        return sum;
    }
}