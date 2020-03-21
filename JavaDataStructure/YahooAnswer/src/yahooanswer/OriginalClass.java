
package yahooanswer;
import java.util.Scanner;
public class OriginalClass {
    public static void main(String[] args) { 
System.out.println("Hello! What's your first name?"); 
System.out.println("No middle names please"); 
@SuppressWarnings("resource") 
Scanner user_input = new Scanner (System.in); 
String firstname; 
firstname = user_input.next(); 
System.out.println("Now what is your surname?"); 
String surname; 
surname = user_input.next(); 
String full_name = firstname + " " + surname; 
System.out.println("Hello " + full_name); 
String AllynChen = "Allyn Chen"; 
if (full_name.equals( "Allyn Chen"))  
System.out.println("Trolololol"); 
else { System.out.println("I am a Spiderman."); 
} 
    }
} 

