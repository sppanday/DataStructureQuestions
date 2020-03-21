

package assignment1;


public class Question2D {
       public static void main(String[] args) {
        String str = "Sue SellS Sea ShellS on the SeaShore!";
        String str2 = "";
        char[] sentence = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            sentence[i] = str.charAt(i);
        }
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 'S') {
    //the code below will replace S with blank space.
                
                sentence[i] = ' ';
    
            } else {
                sentence[i] = sentence[i];
                //if condition not being true, it will 
                //print characters as they are.
            }
        }
        System.out.print("The original sentence was:\n" + str + "\n\n");
        for (int i = 0; i < sentence.length; i++) {
            str2 += sentence[i];
        }
        System.out.println("The sentence is:\n" + str2);
    }
}


