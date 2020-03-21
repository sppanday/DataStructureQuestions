
package exam;


public class Exam {

    
    public static void main(String[] args) {
int firstValue = 0;
int secondValue = 1;
while (secondValue < 9){
            firstValue++;
            if (firstValue % 2 == 0){
                secondValue = secondValue + firstValue;
                firstValue +=2;
                
            }
            System.out.println(firstValue + "\t" + secondValue);
            secondValue++;
        }
    }
    
}
