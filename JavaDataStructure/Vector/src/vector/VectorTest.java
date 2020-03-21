
package vector;
import java.util.Vector;
import java.util.NoSuchElementException;

public class VectorTest {
    private static final String colors[]= {"red", "white", "blue"};
    
    public VectorTest(){
        Vector<String> vector= new Vector<String>();
        printVector(vector); // print vector
        //add elements to vector
        for(String color : colors)
            vector.add(color);
        printVector(vector);
         try
         {
             System.out.printf("First element: %s\n", vector.firstElement());
             System.out.printf("Last element: %s\n", vector.lastElement());
         }//end try
         //catch exception if vector is empty
         catch(NoSuchElementException exception){
             exception.printStackTrace();
             }
                     if(vector.contains("red"))
                     System.out.printf("\n\"red\" found at index %d\n\n", vector.indexOf("red"));
                     else
                     System.out.print("\n\"red\" not found");
                     vector.remove("red");
                     System.out.printf("\"red\" has been removed\n");
                     printVector(vector);
                     //does vector contain red after remove operation ?
                     if(vector.contains("red"))
                     System.out.printf("\"red\"found at index %d\n", vector.indexOf("red"));
                     else
                         System.out.println("\"red\" not found");
                     //print the size and capacity of the vector
                     System.out.printf("\nSize: %d\nCapacity: %d\n", vector.size(), vector.capacity());
                 }//end Vector constructor
                 
        private void printVector(Vector<String>vectorToOutput)
         {
             if(vectorToOutput.isEmpty())
                 System.out.println("vector is empty");
                         else
             {
                 System.out.println("vector contains:");
                 //output elements
                 for(String element: vectorToOutput)
                     System.out.printf("%s", element);
             }
             System.out.println("\n");
         }//end method printVector
         }
          
                
        
    
    

