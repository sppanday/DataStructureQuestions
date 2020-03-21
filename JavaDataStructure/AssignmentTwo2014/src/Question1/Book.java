
package Question1;
public class Book {
   private String bookName; 
   private double price;
   private long isbnNumber;
   private int dateOfPublication;
   private String authorName;
   private String lecturerName;
   private boolean isAvailableForLoan;
public Book(){
}
public Book(String bookName, double price, long isbnNumber,
        int dateOfPublication,String authorName, String lecturerName, boolean isAvailableForLan){
    this.authorName = authorName;
    this.dateOfPublication = dateOfPublication;
    this.isbnNumber = isbnNumber;
    this.lecturerName = lecturerName;
    this.bookName = bookName;
    this.price = price;
    this.isAvailableForLoan = isAvailableForLoan;
}
public String toString(){
    return "We have excellent books to study in CDU:::";
}
public String getBookName(){
    return bookName;
}
public double getPrice(){
    return price;
}
public long getIsbnNumber(){
    return isbnNumber;
}
public int getDateOfPublication(){
    return dateOfPublication;
}
public String getAuthorName(){
    return authorName;
}
public String getLecturerName(){
    return lecturerName;
}
public boolean getIsAvailableForLoan(){
    if (dateOfPublication > 2010){
        return true;
    }else {
        return false;
    }
}
public String overridingExample(){
    return "This is a book." ;
}
public void changePrice(int newPrice){
    price = newPrice;
    
}
}
     