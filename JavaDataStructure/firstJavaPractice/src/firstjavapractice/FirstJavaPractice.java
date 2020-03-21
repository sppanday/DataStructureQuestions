/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavapractice;

import java.io.FileNotFoundException;

/**
 *
 * @author surendrapanday
 */
public class FirstJavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int size = 27;
        int x;
        String name = "Fido";
        Dog myDog = new Dog(size, name);
        x = size - 5; 
        if (x < 15) myDog.bark(8);
        while (x>3){
            myDog.play();
        }
        int[] numList = {2,4,6,8};
        System.out.print("Hello");
         System.out.print("Dog: " + name);
         String num = "";
         int z = Integer.parseInt(num);
         
         try{
             readTheFile("myFile.txt");
         }
         catch(FileNotFoundException ex){
             System.out.print("File not found");
         }
        
    } 
}
