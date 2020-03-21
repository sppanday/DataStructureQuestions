
package collections;

public class UsingArraysTest {

    public static void main(String[] args) {
   UsingArrays arr = new UsingArrays();
   arr.printArrays();
   arr.printEquality();
 int location =arr.searchForInt(5);
 if(location>= 0)
     System.out.printf("Found 5 at element %d in intArray\n", location);
 else
     System.out.println("5 not found in intArray");
 location = arr.searchForInt(8763);
 if(location>=0)
     System.out.printf("Found 8763 at elemtnt %d in intArray\n", location);
 else
     System.out.println("8763 not found in intArray");
    }// end main
    
}//end class UsingArrays
