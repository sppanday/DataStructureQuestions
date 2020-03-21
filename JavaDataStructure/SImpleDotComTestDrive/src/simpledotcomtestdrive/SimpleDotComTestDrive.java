/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcomtestdrive;

/**
 *
 * @author surendrapanday
 */
public class SimpleDotComTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDotCom dot = new SimpleDotCom();//instantiate object
        int[] locations ={2,3,4};
        dot.setLocationCells(locations);//invoke setter method
        String userGuess = "2"; //make a false user guess
        //invoke checkyourself object, and pass fake guess value
        String result = dot.checkYourself(userGuess);
     /**   String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
        **/
    }
    
}
