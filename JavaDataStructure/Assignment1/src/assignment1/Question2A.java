package assignment1;

import java.util.Scanner; 
//imports library for scanner . 
public class Question2A{

public static void main(String[] args) 
{ 
int countBlankSpaces=0; 
int length = 0;
//initializing variables type and their values.
Scanner scan = new Scanner (System.in); 
//setting up scanner for user input.
//
System.out.println ("I am gonna count number of spaces of a sentence you type in."); 
System.out.println (); 

System.out.println ("Enter a sentence or phrase please: "); 

String phrase = scan.nextLine(); 
 length = phrase.length();
//this one reads whole sentence with spaces and words.
for (int count = 0; count <= (phrase.length()-1); count++) 
{ 
char ch = phrase.charAt(count); 
if(ch==' ') 
{ 
countBlankSpaces++; //increments spaces.
} 
}
System.out.println (countBlankSpaces); //prints numbers of spaces
} 
} 
