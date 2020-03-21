package bubblesort1;

public class BubbleSort1 {

    public static void main(String[] args) {
    

    public static void main(String[] args) {

        char characters[] = {'x', 'd', 'p', 'a', 'z', 'b'};

        char temp;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;
        }

        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] > characters[i + 1]) {
                temp = characters[i + 1];
                characters[i + 1] = characters[i];
                characters[i] = temp;
                fixed = false;
            }
        }
    }
    for(int i = 0;
    i<characters.length;
  i++) {
    System.out.println(characters[i]);
    }
}
