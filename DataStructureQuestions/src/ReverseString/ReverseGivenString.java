/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseString;

/**
 *
 * @author surendrapanday
 */
public class ReverseGivenString {

    public static void main(String[] args) {
        String str = "I killed 100 rats when I was 16 years old.";
        System.out.print("Given String:::"+ str+"\n\n");
        String reversedString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString = reversedString + str.charAt(i);

        }
        System.out.println("Reversed string ::: ");
        System.out.println(reversedString);
    }

}
