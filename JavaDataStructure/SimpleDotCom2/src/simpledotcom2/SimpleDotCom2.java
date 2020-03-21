/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcom2;

/**
 *
 * @author surendrapanday
 */
public class SimpleDotCom2 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
           int numOfGuesses = 0;
           GameHelper helper = new GameHelper();
           SimpleDotCom theDotCom = new SimpleDotCom();
          
           int ramdomNum = (int)(Math.random()*5);
        int randomNum = 0;
           int[] locations = {randomNum, randomNum+1, randomNum+2};
                   theDotCom.setLocationCells(locations);
           boolean isAlive = true;
           while(isAlive==true){
               String guess = helper.getUserInput("Enter a number");
               String result = theDotCom.checkYourself(guess);
               numOfGuesses++;
               if(result.equals("kill"))
                   isAlive = false;
               System.out.println("You took"+numOfGuesses+"guesses");
               
           }
           
    }
    
}
