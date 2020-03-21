package hattjosephprog4;

import java.util.Scanner;

public class HattJosephProg4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double speed; //speed of the vehicle 
        double stoppingDistance; //stopping distance 
        double tailgatingDistance; //tailgating distance 


        do {
            System.out.println("Enter the speed of the vehicle: ");
            speed = stdIn.nextDouble();
            System.out.println("Enter the distance the vehicle is tailgating: ");
            tailgatingDistance = stdIn.nextDouble();
            stoppingDistance = (double) speed * (2.25 + (speed / 21));

            if (stoppingDistance >= tailgatingDistance) {
                if (stoppingDistance == tailgatingDistance) {
                    System.out.println("Minor Wreck.");
                } else if (stoppingDistance > tailgatingDistance) {
                    System.out.println("Major Wreck!");
                } else {
                    System.out.println("No Problem.");
                }

