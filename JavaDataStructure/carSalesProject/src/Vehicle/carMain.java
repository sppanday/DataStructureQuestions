/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author surendrapanday
 */
public class carMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             car C=new car("Opel","Corsa",220,12000.0,4,5);
            motorcycle M=new motorcycle("KTM","DUKE-690",250,9000.0,"Agressive");
            System.out.println(C.toString());
            System.out.println();
            System.out.println(M.toString());
    }
    
}
