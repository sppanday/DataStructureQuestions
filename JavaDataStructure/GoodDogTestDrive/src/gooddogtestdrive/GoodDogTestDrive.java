/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gooddogtestdrive;

/**
 *
 * @author surendrapanday
 */
public class GoodDogTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GoodDog one = new GoodDog();
        one.setSize(10);
        GoodDog two = new GoodDog();
        two.setSize(30);
        
        System.out.println("dog one with "+ " "+ one.getSize() );
          System.out.println("dog two"+ " "+two.getSize() );
          one.bark();
          two.bark();
        
    }
    
}
