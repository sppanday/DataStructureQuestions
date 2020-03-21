

package yahooanswer;

public class Mathematics { 
public static void main(String[] args) { 
int a = 1, b = 2, c = 5; 
System.out.println("a = "+a+", b = "+b+", c = "+c); 
System.out.println(); 
int answer = a + (b + c); 
System.out.println("a + (b + c) = " + answer); 
answer = a + b + c; 
System.out.println("(a + b + c) = " + answer); 
answer = (a + b) + c; 
System.out.println("(a + b) + c = " + answer); 
} 
}