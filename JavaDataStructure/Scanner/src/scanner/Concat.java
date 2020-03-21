

package scanner;

import java.util.Scanner;
public class Concat {

   
    public static void main(String[] args) {
        String s = new String("Elephants are huge");
        int length = s.length();
        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            if((c == 'e')|| (c == 'E')){
                System.out.println(i);
            }
        }
        String sentence = "Do not use your camera near flammable or" + "explosive gases and liquids";
        int length1 = sentence.length();
        for (int i = 0; i < length1; i++){
            char c = sentence.charAt(i);
            if(c =='x' ){
                System.out.println("I've found the letter x at index" + i);
                break;
            }
        }
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your first name");
    String firstName = scan.next();
    System.out.println("Please enter your country of birth:");
    String countryOfBirth = scan.next();
    System.out.println("Please now enter the suburb you currently live in:");
           String suburb = scan.next();
           String output = "Your name is".concat(" "+ firstName).concat(" " + "and you were "
                   + "born in"+ " "+countryOfBirth).concat(" "+ "but you now live in"+" ".concat(suburb));
           System.out.println(output);
    }
    
}
