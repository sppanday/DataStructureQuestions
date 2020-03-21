
public class B extends A {
  private String greeting = "Hello from B";
  private int number;
  public B() {
      
  }
  public B(int number) {
      this.number = number;
  }
 
  public void changeNumber(int newNumber){
      newNumber = number*2;
  }
  public int getChangeNumber(int newNumber){
      return newNumber;
  }
  public String greet() {
      return greeting;
  }
}
