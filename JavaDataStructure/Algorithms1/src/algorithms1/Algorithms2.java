/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author surendrapanday
 */
public class Algorithms2 {
    private Character[] letters = {'P', 'C', 'M'};
    private Character[] lettersCopy;
   private  List<Character> list;
    private List<Character>copyList;

    /**
     *
     */
    public Algorithms2() {
        list= Arrays.asList(letters);//get List
        lettersCopy = new Character[3];
        copyList = Arrays.asList(lettersCopy);
        System.out.println("Initial list:");
        output(list);
        Collections.reverse(list);
        System.out.println("\nAfter calling reverse: ");
        output(list);
        Collections.copy(copyList, list);//copy List
        System.out.println("\n After copying list: ");
        output(copyList);
        Collections.fill(list, 'R'); // Fill List with Rs
        System.out.println("\n After filling list: ");
        output(copyList);
    }//end of constructor
    private void output(List < Character > listRef){
        System.out.print("This list is: ");
        for(Character element: listRef);
        //System.out.printf("%s", element);
        System.out.printf("\nMax: %s", Collections.max(listRef));
         System.out.printf("\nMin: %s", Collections.min(listRef));
         System.out.println();
    }
    
}
