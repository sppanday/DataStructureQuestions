

package assignment1;


public class Question1A {
    private  static double lowerLimit = 1.5;
    private  static double upperLimit = 26;
    private static int number = 5;
      
    public static double deskCheck(){
        while((number >= lowerLimit) && (number <= upperLimit)){
            if(number% 1.25 == 0){
                number += 3;
            } else{
                number+=2;
                
            }
            
        }
        return number;
    }
       public static void main(String[] args) {
        System.out.println(deskCheck());
    }
} 
  


