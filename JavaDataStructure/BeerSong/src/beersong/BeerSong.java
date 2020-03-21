/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author surendrapanday
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int beerNum = 99;
        String word = "bottles";
        while ( beerNum > 0){
            if(beerNum ==1){
            word = "bottle";
        }
        System.out.println(beerNum + " "+word+ "of beer on the wall");
          System.out.println(beerNum + " "+word+ " "+ "beer");
          System.out.println("Pass it around");
          beerNum = beerNum-1;
          if (beerNum > 0){
              System.out.println(beerNum+" "+word+"of beer on the wall.");
          }else{
              System.out.println("No more bottles of beer on the wall");
          }
        }
    }
    
}
