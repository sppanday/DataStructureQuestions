
package person;
import java.util.*;
public class Person {
private int age;
private String birthDate;
private String opinion;
    public Person(int age) {
        this.age = age;
       
    }
    public String givesOpinion()
    {
        return opinion;
    }
    public int getAge()
    {
        return age;
    }
}
