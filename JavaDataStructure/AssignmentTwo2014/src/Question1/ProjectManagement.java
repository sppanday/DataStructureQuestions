

package Question1;

public class ProjectManagement extends Book {
   
    private String tutorialBuilding;
    public ProjectManagement(String bookName, double price, long isbnNumber,
        int dateOfPublication,String authorName, String lecturerName, String tutorialBuilding, boolean isAvailableForLoan){
        super( bookName, price,isbnNumber,dateOfPublication,authorName,lecturerName,isAvailableForLoan);
      this.tutorialBuilding = tutorialBuilding;
}
    @Override 
    public String toString(){
        return tutorialBuilding+"\tis pretty good tutorial building for\t"
                + "large number of students.";
    }
public String getTutorialBuilding(){
    return tutorialBuilding;
}
@Override
public String overridingExample(){
    return "This book is project management";
}
}
