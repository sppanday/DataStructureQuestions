package Week9Task;

public class ProblematicClass {
public int value;

public int numbers[] = {3,6,9};

public void ProblematicClass(int value){
    value = this.value;
}
public int getValue(){
    return value;
}
private int printValue(int whatValue){
whatValue = 3* value;
for (int i =0; i<3;i++){
    System.out.println(numbers[i]);
   }
return whatValue;

} 
}

