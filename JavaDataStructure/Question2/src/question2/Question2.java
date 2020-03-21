
package question2;

public class Question2 {
  public static void main (String[] args) {
    String str = "There really should be a few regular rapid rabbits around";
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      result += (c == 'r') ? 's' : c;
    }
    System.out.println(result);
  }
}
