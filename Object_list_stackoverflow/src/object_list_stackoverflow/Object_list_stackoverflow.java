
package object_list_stackoverflow;

import java.util.StringTokenizer;
import jdk.internal.util.xml.impl.Input;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;


public class Object_list_stackoverflow {

    
    public static void main(String[] args) {
        String word1 = "hello! hello!! %can you hear me%? Yes I can.";
        String word2 ="*Java is awesome* Do you % agree % with us?";
        String word3 ="%*hello*% friends";
        String regex = "\\*[^\\*]+\\*";
        String regex1= "\\%[^\\%]+\\%";       
  System.out.println(word3.replaceAll(regex, "1").replaceAll(regex1, "1"));  
       }   
    }

