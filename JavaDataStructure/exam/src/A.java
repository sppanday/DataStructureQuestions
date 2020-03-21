
public class A {
      private int value;
    public A() {
        
    }
    public A(int value) {
        this.value = value;
        
    } 
    public int getValue() {
        return value;
    }
    public void changeValue(int newValue){
        value = newValue;
    }
    public String greet(){
        return "Hello from A";
    }
}
