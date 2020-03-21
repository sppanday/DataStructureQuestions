

package assignment1;
import java.util.Scanner;
//imports scanner library
public class Question2E {
           public static void main(String[] args) {
 
      // main class
       Scanner input = new Scanner(System.in);//scans user input 
       System.out.println("I am gonna reverse your phrase.");
       System.out.println();
       System.out.println("Enter a phrase please: ");
       String string = input.nextLine();
        //string is what user types in from keyboard.
       System.out.println("Reversed Phrase result Result: ");
       for(int i=1; i<=string.length() ;i++)
       {  //input phrase goes thru loop.
            System.out.print(string.charAt(string.length()-i)); 
            //these bunch of code reverse strings of a phrase
       }
       
    }
         
 
}
