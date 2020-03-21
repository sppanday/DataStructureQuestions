/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobject;

/**
 *
 * @author surendrapanday
 */
public class Driver extends MovingObject {
        private static final int N_STEPS = 1000;
    private static final int PAUSE_TIME = 20;
    private static final double TRAIN_LENGTH = 320;
public void run(){
        Train train = new Train(getGCanvas());
        for (int i = 0; i < N_STEPS; i++) {
            train.move(-100, 0);
            pause(PAUSE_TIME);
    }
}
