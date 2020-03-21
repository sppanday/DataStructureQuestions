/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumber;

/**
 * @author surendrapanday 
 * print prime numbers between 1 to 100
 */
public class PrimeNumber {
    
    /* prints prime numbers between 1 to 100 */

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if (i >= 2 || !(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) {
                System.out.print(i + " ");
            } 
        }

    }

}
