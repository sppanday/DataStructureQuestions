/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BinarySearchTree {
    private static final String colors[] = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
    private List<String>list; //ArrayList reference
    //create, sort, and output list

    public BinarySearchTree() {
       list = new ArrayList<String>(Arrays.asList(colors));
        Collections.sort(list);// sort the ArrayList
        System.out.printf("Sorted ArrayList: %s\n",list);
    }// end of binary search tree constructor
    public void search(){
        printSearchResults(colors[3]); //first item
        printSearchResults(colors[0]);//second item
        printSearchResults(colors[7]);// last item
        printSearchResults("aqua");
        printSearchResults("gray");// does not exist
        printSearchResults("teal");// doest not exist
       
    }//end method search
   public  void printSearchResults(String key){
        int result = 0;
        System.out.printf("/n Searching for: %s\n", key);
        result = Collections.binarySearch(list, key);
        if(result>0){
            System.out.printf("\n Searching for : %s\n", key);
            
        }else{
            System.out.printf("Not found (%d)\n", result);
        }
    }
    
}
