/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication85;

public class Class1
{
 
  public static int recursion( int n )
  {
    if( n <= 1 )
      return 1;
    else
      return n * recursion( n - 1 );
  }  
   
  public static void main(String[] args) {
     System.out.println( recursion(4
     ) );  
  }
   
}
