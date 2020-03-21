package week1;
import java.util.Arrays;
import java.util.*;
 

public class Question2 {
    
    public static void main(String[] args){
        String[] text = new String[10];
        text[0] = "Choices";
       text[1] = "Name";
        text[2] = "First Choice";
        text[3] = "Second Choice";
        text[4] = "Third Choice";
        text[5] = "Rupert";
        text[6] = "Mildred";
        text[7] = "++++++++++++++++++++++++++++++++++++++++";
        text[8] = "Henbury";
        text[9] = "////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
        int[] num = new int[9];
        num[0] = 17;
        num[1] = 52;
        num[2] = 342;
        num[3] = 6574;
        num[4] = 3;
        num[5] = 292;
        num[6] = 320;
        num[7] = 41;
        num[8] = 9;
        System.out.println( text[9] + "\n" +"\t" + "\t" + "\t" +
                text[0] + "\n" + "\t" +  text[7]);
             
        System.out.println();
        System.out.println(text[1] + "\t" + text[2] +
                "\t" + text[3] + "\t" + text[4]);
        System.out.println();
        System.out.println(text[5] + "\t" + "\t" + num[0] + "\t" 
                + "\t" +  num[1] +  "\t" + "\t" + num[2]);
        System.out.println();
        System.out.println(text[6] + "\t" + "\t" +  num[3] 
                + "\t" + "\t" + num[4] + "\t" + "\t" + num[5]);
        System.out.println();
        System.out.println(text[8] + "\t" + "\t" + num[6] + "\t"
                + "\t" + num[7] + "\t" + "\t" + num[8]);
        }  

}