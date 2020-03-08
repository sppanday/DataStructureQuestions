/**
* Find an two indices of an array which adds upto 5, it can be changed as well depending upon implementation. Array size remains same and 
*values cant be repeated
*/

public class SumFinder{
    
   
     public static void main(String []args){
       
       try {
            int[] arr = {1, 2, 3,4,5,6,7,8,9,10,11};
             // target = 20
        int sum;
       for(int i = 1; i < arr.length; i++) {
          sum = arr[i] + arr[i-1];
          if(sum == 5) {
              System.out.print("Two indices that equal to 20 are::: "+ "\n" + 
              "[" + arr[i] + " " + arr[i-1] +  "]");
          } 
       } 
       }catch (Exception e) {
      
      
         }
     }
}
