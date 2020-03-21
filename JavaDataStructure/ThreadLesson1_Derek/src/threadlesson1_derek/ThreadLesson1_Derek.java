/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlesson1_derek;
import java.util.*;
import java.text.DateFormat;
/**
 *
 * @author surendrapanday
 */
public class ThreadLesson1_Derek extends Thread {

    /**
     * @param args the command line arguments
     */
      public void run(){
          Date rightNow;
          Locale currentLocale;
          DateFormat timeFormatter;
          DateFormat dateFormatter;
          String timeOutput;
          String dateOutput;
          for(int i =1; i <=20; i++){
              rightNow = new Date();
              currentLocale = new Locale("en");
              timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
              dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
              timeOutput = timeFormatter.format(rightNow);
              dateOutput = dateFormatter.format(rightNow);
              
              System.out.println(timeOutput);
              System.out.println(dateOutput);
              System.out.println();
              
              try{
                  Thread.sleep(2000);
              } 
              catch(InterruptedException e){
              }
          }
      }
}
    

