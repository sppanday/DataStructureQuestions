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
public class threadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Thread getTime = new ThreadLesson1_Derek();
Runnable getMail = new GetTheMail(10);
Runnable getMailAgain = new GetTheMail(20);
getTime.start();

new Thread(getMail).start();
new Thread(getMailAgain).start();
    }
    
}
