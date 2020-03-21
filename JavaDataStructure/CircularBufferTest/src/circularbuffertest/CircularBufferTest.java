/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularbuffertest;

import java.util.concurrent.Executors;

/**
 *
 * @author surendrapanday
 */
public class CircularBufferTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new thread pool with two threads
        ExecutorService application = Executors.newCachedThreadPool();
        //create circularBuffer to store this int
        CircularBuffer sharedLocation = new CircularBuffer();
        //display the initial state of the CircularBuffer
        sharedLocation.displayState("initial state");
        //execute the Producer and Consumer tasks
        application.execute(new Producer(sharedLocation));
        application.execute(new Consumer(sharedLocation));
        application.shutdown();
    }
    
    
}
