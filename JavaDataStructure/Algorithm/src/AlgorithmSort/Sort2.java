/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmSort;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Sort2 {
    private static final String suits[]= {"Hearts", "Diamonds", "Clubs", "Spades"};
    //display array elements
    public Sort2(){
    }
    public void printElements(){
        List<String>list = Arrays.asList(suits);
        //output list
        System.out.printf("Unsorted array elements: \n%s\n", list);
        Collections.sort(list); // sort ArrayList
        //output list
        System.out.printf("Sorted array elements: \n%s\n", list);
    }// end method printElements

    
}
