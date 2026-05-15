public class impar {

    public static void main(String[] args) {
        int c;
        for(c=2;c<=18;c++){
         if (impares(c)==0) {
              System.out.println(c);
        
         }
         }
    }
    public static int impares(int a){
        int imp;
        if(a%2==0){
            imp=1;
        }else{
            imp=0;
        }
        return imp;

    }
    
}
