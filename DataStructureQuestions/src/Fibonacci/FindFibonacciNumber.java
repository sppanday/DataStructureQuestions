/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.io.IOException;

/**
 *
 * @author surendrapanday
 */
public class FindFibonacciNumber {

    /**
     * In a given array find nth Fibonacci number
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.print(fibonacci(30));
    }

    public static int fibonacci(int n) {
        for (int i = 1; i < n; i++) {
            if (n >= 3) {
               return (fibonacci(n-1) + fibonacci(n-2));
            } else{
               return 1;
            }
        }
        return n;
    }
}
