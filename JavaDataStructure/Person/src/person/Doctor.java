
package person;
import java.util.*;

public class Doctor extends Person {
    String professionalOpinion;
    boolean isQualified;
    public Doctor(int age, boolean qualified)
    {
        super(age);
        isQualified = qualified;
       
    }
    @Override
    public String givesOpinion()
    {
        if(isQualified)
        {
            return professionalOpinion;
        }else
            return "not qualified";
        
    }
}
    

