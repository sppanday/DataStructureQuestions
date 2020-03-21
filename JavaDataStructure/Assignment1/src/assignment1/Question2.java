

package assignment1;


public class Question2 {
 
    public static void main(String[] args) {
        String str = "Sue sells sea shells on the seashore!";
        String str2 = "";
        char[] sentence = new char[str.length()];
          //creates character array
        for (int i = 0; i < str.length(); i++) {
            sentence[i] = str.charAt(i);
        }
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 's') {
                sentence[i] = 'S';
           //reads condition if words contain character S and s.
            } else {
                sentence[i] = sentence[i];
            }
        }
        System.out.print("The original sentence was:\n" + str + "\n\n");
        for (int i = 0; i < sentence.length; i++) {
            str2 += sentence[i];
         //replaces s with S.
        }
        System.out.println("The sentence now is:\n" + str2);
    }
}
