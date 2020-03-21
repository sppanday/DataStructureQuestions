package weeklytasks;

public class DuckMain {

     String name;//instant variable with private access
    
    public static void main(String[] args) {
        Duck[] pets = new Duck[5]; //creates slot in memory to put in 4 objects of duck.
        Duck a = new Duck();//operator for new duck object a
       a.setWeight(45);
       a.setName("Fred");
        Duck b = new Duck();// operator of new duck object b
        b.setName("Cres");
        b.setWeight(50);
        Duck c = new Duck();// operator of object c
        c.setName("Alfred");
        c.setWeight(55);
        Duck d = new Duck();//operator of object c
        c.setName("harry");
        c.setWeight(65);
       
   for(int i = 0; i < pets.length; i++){
           
            System.out.println(pets[i].getName() +"/n"+ pets[i].getWeight());
        }
       }
    }

