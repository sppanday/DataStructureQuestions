

package Question1;
public class InheritanceMainClass {

   public static void main(String[] args) {
       Book b = new Book();
       String phrase4 = b.toString();
ProjectManagement pm = new ProjectManagement("PROJECT MANAGEMENT"
     , 117.23,458682398,2014,"Kathy Schwalbe","Jennifer Jackelski",
     "Purple",true);
     String bn1 = pm.getBookName();
    double price1 = pm.getPrice();
    long isbn1 = pm.getIsbnNumber();
    int publication1 = pm.getDateOfPublication();
    String author1 = pm.getAuthorName();
    String lecturer1 = pm.getLecturerName();
    String tutorialBuilding = pm.getTutorialBuilding();
    boolean available1 = pm.getIsAvailableForLoan();
    String phrase1 = pm.toString();      //Use of toString
     SoftwareNow sn = new SoftwareNow("SOFTWARE NOW"
     , 99.43,340953900,2010,"Kathy Sierra & Bert Bates","Rebecca England",
     150, true);
     String bn2 = sn.getBookName();
    double price2 = sn.getPrice();
    long isbn2 = sn.getIsbnNumber();
    int publication2 = sn.getDateOfPublication();
      String author2 = sn.getAuthorName();
     String lecturer2 = sn.getLecturerName();
    int studentNumbers = sn.getNumberOfStudents();
     boolean available2 = sn.getIsAvailableForLoan();
     String phrase2 = sn.toString();    //toString used
     SystemAnalysis sa = new SystemAnalysis("SYSTEM ANALYSIS AND DESIGN"
     , 196.45,908035903,2013,"Voffer","Jamal El. Den",4,true);
      String bn3 = sa.getBookName();
    double price3 = sa.getPrice();
    long isbn3 = sa.getIsbnNumber();
    int publication3 = sa.getDateOfPublication();
     String author3 = sa.getAuthorName();
     String lecturer3 = sa.getLecturerName();
    int frequency = sa.getTutorialTime();
     boolean available3 = sa.getIsAvailableForLoan();
     String phrase3 = sa.toString();      //toString used
     
     
     System.out.println("***************************************************");
     System.out.println("Book Name::"+bn1+"\nISBN Number::"+isbn1+"\nPublication Date::"+publication1+"\nAuthor of Book::"
             + ""+author1+"\nlecturer's name::"+lecturer1+"\nStudent Number:::"+studentNumbers+"\ntutorial building:::"+tutorialBuilding+
           "\nIs it availble to borrow:::"+available1+"\nprice:::"+price1);
     System.out.println("***************************************************");
        System.out.println("Book Name::"+bn2+"\nISBN Number::"+isbn2+"\nPublication Date::"+publication2+"\nAuthor of Book::"
             + ""+author2+"\nlecturer's name::"+lecturer2+"\nStudent Number:::"+
             studentNumbers+"\nIs it availble to borrow:::"+available2+"\nPrice::"+price2);
        System.out.println("************************************************");
System.out.println("Book Name::"+bn3+"\nISBN Number::"+isbn3+"\nPublication Date::"+publication3+"\nAuthor of Book::"
             + ""+author3+"\nlecturer's name::"+lecturer3+"\nStudent Number:::"+
             studentNumbers+"\nIs it availble to borrow:::"+available3+"\nbook price:::"+price3+"\nTutorial Frequency::"+
        frequency);
System.out.println("******************************");

//printing toString below
System.out.println("toString used, printing...\n");
System.out.println(phrase4);
System.out.println(phrase1);
System.out.println(phrase2);
System.out.println(phrase3);
System.out.println("**************************************");
System.out.println("Override method used....");
System.out.println(b.overridingExample());
System.out.println(sa.overridingExample());
System.out.println(sn.overridingExample());
System.out.println(pm.overridingExample());

    }
   
    
}
