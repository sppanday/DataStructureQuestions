
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        
        int numbers[] = {1,-7,4,2,3,8};
        int temp;
        boolean fixed=false;
        while(fixed==false) {
            fixed=true;
        }
        
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i+1];
                numbers[i+1]=numbers[i];
                numbers[i]=temp;
                fixed = false;
            
            }
    }
    for(int i = 0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
    }
}