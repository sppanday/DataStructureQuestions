
package collections;

import java.util.Arrays;

public class UsingArrays {
    private int intArray[]= {1,2, 3,4,5,6};
    private double doubleArray[]= {8.4, 9.3, 0.2, 7.9, 3.4};
    private int filledIntArray[], intArrayCopy[];
    //constructor initializes arrays
   public UsingArrays(){
       filledIntArray = new int[10]; // create int with 10 elements in it. 
       intArrayCopy = new int[intArray.length];
       Arrays.fill(filledIntArray, 7); // fill with 7s
       Arrays.sort(doubleArray);//sort doubleArray ascending
       //copy array intArray into array intArrayCopy
       System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
   }   // end UsingArrays constructor
   //input values in each arrays
   public void printArrays(){
       System.out.print("doubleArray: ");
       for(double doubleValue : doubleArray)
           System.out.printf("%.1f", doubleValue);
       System.out.print("\nintArray:");
       for(int intValue : intArray)
           System.out.printf("%d", intValue);
        System.out.print("\nfilledIntArray:");
        for(int intValue: filledIntArray)
            System.out.printf("%d", intValue);
        System.out.print("\nintArrayCopy:");
        System.out.println("\n");
   }// end method printArrays
   public int searchForInt(int value){
       return Arrays.binarySearch(intArray, value);
   }// end method searchForInt
   public void printEquality(){
       boolean b = Arrays.equals(intArray, intArrayCopy);
       System.out.printf("intArray %s intArrayCopy\n", (b?"==": "!="));
   }//end printEquality method
}
