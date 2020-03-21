package bubblesort;

public class SortNumbers {

    public int[] numbers = {1, -7, 4, 2, 3, 8};

    public static void main(String[] args) {
        sortNumbers();
        BubbleSort();
    }

    public static void sortNumbers() {
        System.out.print("The sorted array is:");

        for (int i : numbers) {
            System.out.print(" " + i + "");
        }
    }

    public static void BubbleSort() {
        int temp = 0;
        int j = 0;
        boolean isRunning = true;
        while (isRunning) {
            isRunning = false;
            j++;
            for (int i = 0; i < numbers.length - j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isRunning = true;
                }
            }
