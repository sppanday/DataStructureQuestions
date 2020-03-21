package Question1;

public class SoftwareNow extends Book {

    private int numberOfStudents;

    public SoftwareNow(String bookName, double price, long isbnNumber,
            int dateOfPublication, String authorName, String lecturerName, int numberOfStudents, boolean isAvailableForLoan) {
        super(bookName, price, isbnNumber, dateOfPublication, authorName, lecturerName, isAvailableForLoan);
        this.numberOfStudents = numberOfStudents;
}
    @Override
    public String toString(){
        return "Number of students being\t"+
numberOfStudents+ "\tin the class it is good for learning 'software now' unit";    
    }
public int getNumberOfStudents() {
        return numberOfStudents;
    }
@Override
public String overridingExample(){
    return "This book is called software now.";
}
}