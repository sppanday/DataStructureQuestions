/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistfunctions;
import java.util.ArrayList; 
import java.io.*;
/**
 *
 * @author surendrapanday
 */
public class ArrayListFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg s = new Egg();
        myList.add(s);
        Egg b = new Egg();
        myList.add(b);
        int theSize = myList.size();
        boolean isIn = myList.contains(s); //if list contains something
        int idx = myList.indexOf(b);
        boolean empty = myList.isEmpty();
        myList.remove(s);
    }
    
}
