/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcom2;
import java.io.*;
/**
 *
 * @author surendrapanday
 */
public class GameHelper {
    public void setLocationCells(int[] locations){
        locations = locations;
    }
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length()==0) return null;
        }catch(IOException e){
            System.out.println("IOException: "+e);
        }
          return inputLine;
    }
}
