package weeklytasks;  
import java.util.Scanner;
public class weeklytask3 {
  
    public static void main(String[] args){
       int number;
       System.out.println("Enter a number please: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        

        if(number%2==0){
        System.out.println("The number you entered an even number.");
        }else if (number%2 != 0)
        { System.out.println("The number you entered is an odd number.");
}}
}