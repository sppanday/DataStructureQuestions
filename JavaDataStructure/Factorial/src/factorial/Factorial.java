
package factorial;


public class Factorial {

    private final int num;
    
    public Factorial(int num){
        this.num = num;
    }
    public static int fact(int num){
        if(num<=1){
            
            return 1;
        }
        return num*fact(num-1);
    }
}

