

package filedemonstration;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author surendrapanday
 */
public class FileDemonstration {

    /**
     * @param path
     */
    public void analyzePath(String path) {
     File name = new File("/./Documents/text_demo.rtf");
     if(name.exists()){
         System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                 name.getName(), "exists", (name.isFile()? "is a file": "is not a file"),
                 (name.isDirectory()? "is a directory": "is not a directory"), 
                 (name.isAbsolute()? "is a absolute path": "is not absolute path"), "Last modified:",
                 name.lastModified(),"Length:", name.length(), "Path:", name.getPath(), "Absolute path:",
                 name.getAbsolutePath(), "Parent:", name.getParent());
         if(name.isDirectory())//output directory listing
         {
             String directory[]=name.list();
             System.out.println("\n\nDirectory contents:\n");
             for(String directoryName: directory)
                 System.out.printf("%s\n", directoryName);
         } //end if
     }//end outer if
     else // not file or directory, output error message
     {
         System.out.printf("%s%s","text_demo.rtf","does not exist.");
     }//end if
    }//end method analyzePath
    
}//end class FileDemonstration
