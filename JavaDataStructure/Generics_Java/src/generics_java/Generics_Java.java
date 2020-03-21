
package generics_java;

import java.util.*;
import java.io.*;

public class Generics_Java {
    
 ArrayList<String> songList = new ArrayList<String>();
    
    public static void main(String[] args) {
       
    new Jukebox1().go();   
        
    } 
    
    public void go(){
        
        getSongs();
        System.out.println(songList);
    }
    
    void getSongs() {
        
        try {
            
            File file = new File("SongList.txt");
            BufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine() != null)){
                addSong(line);
            }
        } catch(Exception ex) {
            ex.printStackTrack();
        }
    }
    void addSong(String lineToParse) {
         String[] tokens = lineToParse.split("/");
         songList.add(tokens[0]);
    }
}
