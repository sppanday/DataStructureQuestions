/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlesson1_derek;

/**
 *
 * @author surendrapanday
 */
public class GetTheMail implements Runnable{
    private int startTime;
    
  public GetTheMail(int startTime){
        this.startTime = startTime;
    }
    public void run(){
        try{
            Thread.sleep(startTime*1000);
        }
        catch(InterruptedException e){}
        System.out.println("Checking Mail");
    }
}
