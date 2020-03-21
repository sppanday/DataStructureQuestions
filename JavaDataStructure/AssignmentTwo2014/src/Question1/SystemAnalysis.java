
package Question1;

public class SystemAnalysis extends Book {
    private int tutorialFrequency;
    public SystemAnalysis(){
        
    }
    public SystemAnalysis(String bookName, double price, long isbnNumber,
        int dateOfPublication,String authorName, String lecturerName, int tutorialFrequency, 
        boolean isAvailableForLoan){
        super( bookName, price,isbnNumber,dateOfPublication,authorName,lecturerName,isAvailableForLoan);
      this.tutorialFrequency = tutorialFrequency;
    }
      @Override
      public String toString(){
          return "Tutorial frequency of\t"+tutorialFrequency+ "\tis pretty nice to time for learning.";
      }

    public int getTutorialTime(){
        return tutorialFrequency;
    }
    @Override
    public String overridingExample(){
        return "This book is system analysis and design";
    }
    
}