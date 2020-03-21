package javapersistence;




import java.io.IOException;
import static java.time.Clock.system;
import java.util.Scanner;
import javax.swing.JOptionPane; public class Persistence {

public static void main(String [ ] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer -- Cannot be negative"));

    if (n < 10) {

        int ap = 0;
        int ar;

        ap += 1;
        ar = 1 + ( (n - 1) % 9 );

        JOptionPane.showMessageDialog(null, "The Additive Persistence of " + n + " is " + ap + " and the Digital Root is " + ar);
    }
    try { 
    int num1 = n;
    int num2 = 0;
    int result = 0;

        if (n >= 10) {

            while (true) {

            num2 = num1 % 10;
            result = result + num2;
            num1 = num1 / 10;
            
        JOptionPane.showMessageDialog(null, "Sum:" + result);
            
            } 
                    
                    }
          }catch(NumberFormatException nfe) { 
              System.out.println("Number entered is not numeric."+ nfe.getMessage());
                } 
   }
   }  
