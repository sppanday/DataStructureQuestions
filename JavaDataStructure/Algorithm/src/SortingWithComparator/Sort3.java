
package SortingWithComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Sort3 {
    public void printElements(){
        List<Time2>list = new ArrayList<Time2>(); //create list
        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));
        //output List elements
        System.out.printf("Unsorted arra elements: \n%s\n", list);
        //sorting in order using comparator
        Collections.sort(list, new TimeComparator());
        //output List elements
        System.out.printf("Sorted list elements:\n%s\n", list);
        Sort3 sort3 = new Sort3();
        sort3.printElements();
    }
    }

