
package javaapplication115;



import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication115 {

    
    public static void main(String[] args) {
       ArrayList<Double> score = new ArrayList<Double>();


for (int i = 1; i <= score.size(); i += 2)
{ 
Scanner sc = new Scanner(System.in);
double addedElement = sc.nextDouble();
System.out.println("Enter the element you want to add: ");


score.add(i, addedElement); }

System.out.println(score);
    }
    
}
