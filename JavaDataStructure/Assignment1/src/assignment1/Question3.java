package assignment1;

public class Question3 {

    public static void main(String[] args) {
        double number = 1.25;
        while ((number >= 0.5) && (number <= 27.5)) {
            if (number % 1.25 == 0) {

                number += 0.75;

            } else {
                number++;

            }
            System.out.println(number);
        }
    }

}
