
package Question2;
/**
 * @ Author SurendraPanday
 *
 * Play simple guessing games with a user. For one game,
 * a random number is generated. The user continually guesses
 * numbers while the program tells whether the correct number
 * is higher or lower than the user's guess. When the user no longer
 * wants to play, statistics including number of games played, total
 * guesses made, the highest number of guesses made, and the average
 * number of guesses are displayed.
 */
import java.util.*;

public class PlayTheGame {
    public static final int MAX_GUESS = 10;
    private int numGames=0;    // number of games played
    private int totalGuesses;                  // total number of guesses made
    private int maxGuesses;                  // highest number of guesses made
    private double average;   // average number of guesses made
   
    /**------------------------------------------------------------------------
     *  constructor
     *
     * Initialize class variables to starting values, no games yet
     */
   
    public PlayTheGame() {
       numGames= totalGuesses = maxGuesses = 0;
       
    }
    /**------------------------------------------------------------------------
     * play
     *
     * Allow the user to play 5 guessing games.
     * Consists of displaying game rules, playing one game, figuring and
     * reporting results.
     */
    public void play() {
       Scanner keyboard = new Scanner(System.in);
                     // number of guesses user needs for a game
   
       displayGameIntroduction();           // display game rules
       String playGameAgain;             // whether to play again
       // keep playing games for 5 successful guesses
       do {
           
          int guesses = playGame(keyboard);              // play one game
          // compute out statistics: total, average, and max guesses  
          int[] choice = new int[guesses];
          
         for(int i = guesses; i < choice.length; i++){
          System.out.println("The number you entered were:::\n"+choice[i]);
         }
            figureInfo(guesses);
          System.out.print("Do you want to play again?Y/N ");
          playGameAgain = keyboard.next();
          System.out.println();
          } while (playGameAgain.toUpperCase().startsWith("Y"));
       
       resultReport();     // display statictics
       finishGame();
        }
        
    /**------------------------------------------------------------------------
     * displayGameIntroduction
     *
     * Displays the introduction of the game to the user
     */
    private void displayGameIntroduction() {
       System.out.println("This program allows you to play a guessing game.");
       System.out.println("I will think of a number between 0 and " 
                          + MAX_GUESS);
       System.out.println("and will allow you to guess until you get it.");
       System.out.println("For each guess, I will tell you whether the");
       System.out.println("right answer is right, or wrong.");
       System.out.println();
    }
    private String finishGame(){
        numGames++;
        if(numGames<=5){
       return "Sorry, you can't play this game anymore";
       
        }else{  
            return "You are welcome to play another game, until you make 5 successful guesses"; 
            
    }
     }   
    
/**------------------------------------------------------------------------
     * playGame
     *
     * Plays one game: prompts user to enter a number and then determines
     * if it is higher or lower than the correct answer. 
     * At the end of the games, displays how many guesses it took.
     */
    private int playGame(Scanner keyboard) {
        Random r = new Random();
        int answer = r.nextInt(MAX_GUESS);
        int guess = answer - 1;
        int numGuesses = 0;          // number of guesses user needs for a game
        System.out.println("I'm thinking of a number...");

        // keep letting the user guess numbers until the correct
        // number is guessed; tell user if the correct answer is 
        // crroect, or incorrect, if it is less than 0, or more than 10
        //if number user has guessed is in negative, tell them so.
    
        do {
           // prompt user, get their guess, and count it
           System.out.print("What would be your guess number?\n ");
           guess = keyboard.nextInt();
           numGuesses++;
           if (guess >= 0 && guess <= 10) {

                System.out.println("The number you guessed was wrong");
                System.out.println("Please make a correct guess:::");

            } else if (guess < 0) {

                System.out.println("The number you guessed was wrong");
                System.out.println("You can't guess a number less than 0");

            } else if (guess > 10) {

                System.out.println("The number you guessed was wrong" );
                System.out.println("Your guess must be below 10.");
            } else {

                System.out.println("Please make a valid guess.");
            }

        } while (guess != answer);
        System.out.println("Congratulation,You guessed it right!");
          return numGuesses; 
       
        
    }


    /**------------------------------------------------------------------------
     * figureInfo
     *
     * Figure out total number of guesses, number of games, and max guesses.
     */
     private void figureInfo(int guesses) {
        totalGuesses += guesses;
        numGames++;
        if (guesses > maxGuesses) {
           maxGuesses = guesses;
        }
     }

    /**------------------------------------------------------------------------
     * resultReport
     *
     * Displays the overall results including total games played,
     * total number of guesses, average number of guesses, and max guesses.
     */
     private void resultReport() {
        System.out.println("Overall results:");
        System.out.println("    total games   = " + numGames);
        System.out.println("    total guesses = " + totalGuesses);
        average = (double) totalGuesses / numGames;
        System.out.println("    guesses/game  = " + average);
        System.out.println("    max guesses   = " + maxGuesses);
    }
}
