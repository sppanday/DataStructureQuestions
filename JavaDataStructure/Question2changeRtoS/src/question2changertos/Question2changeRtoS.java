package question2changertos;

public class Question2changeRtoS {

    public static void main(String[] args) {
        String str = "There really should be a few regular rapid rabbits around";
        String str2 = "";
        char[] sentence = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            sentence[i] = str.charAt(i);
        }
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 'r') {
                sentence[i] = 's';
            } else if (sentence[i] == 'R') {
                sentence[i] = 'S';
            } else {
                sentence[i] = sentence[i];
            }
        }
        System.out.print("The original sentence was:\n" + str + "\n\n");
        for (int i = 0; i < sentence.length; i++) {
            str2 += sentence[i];
        }
        System.out.println("The sentence now reads:\n" + str2);
    }
}
