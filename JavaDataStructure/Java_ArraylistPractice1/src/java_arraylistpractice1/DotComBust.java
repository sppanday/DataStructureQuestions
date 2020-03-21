/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arraylistpractice1;
import java.util.*; 
import java.util.ArrayList;
/**
 *
 * @author surendrapanday
 */
public class DotComBust {
     GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    int numOfGuesses= 0;
    
    public void setUpGame(){
        //first give dotComs and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    public void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Either a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kills")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    public void finishGame(){
        System.out.println("All dotComs are dead! Your stock is now worthless.");
        if(numOfGuesses <= 18){
            System.out.println("it only took you "+ numOfGuesses + "guesses. ");
            System.out.println("You got out before your option sank. ");
        }else{
            System.out.println("Took you long enough"+numOfGuesses+ "guesses. ");
            System.out.println("Fishes are dancing with your options");
        }
    }
}
