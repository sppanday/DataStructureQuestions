package application;

public class Application {
    private static boolean cond;

    public static void main(String[] args) {
        int myInt = 5;
       if(myInt < 10) {
        System.out.println("Yes, it's true!");
        }
       else if(myInt < 20) {
           System.out.print("No, it's false!");
       }
       else {
           System.out.println("None of above");
       }
    }
}
