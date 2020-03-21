/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2page16;

/**
 *
 * @author surendrapanday
 */
public class Lesson2Page16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] wordListOne = {"angry","sad","happy","disappointed","shy",
            "cry","positive","","",};
        // TODO code application logic here
        String[] wordListTwo ={"motivated", "nervous", "tired","horrendous"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int)(Math.random()*twoLength);
        String phrase = wordListOne[rand1]+ " "+wordListTwo[rand2];
        System.out.println("what we need is a"+ phrase);
    }
    
}
