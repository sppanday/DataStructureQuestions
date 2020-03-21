

package weeklytasks;


public class Duck {
    int kilos;//instance variables
    String name = "";//instance variables
     boolean canFly;//instance variables
    
 
    public Duck(String aName, boolean fly, int weight){//method arguements
        name = aName;    //instant variable assigned value
        canFly = fly;     //instant variable assigned value
        kilos = weight;   //instant variable assigned value
    }

    Duck() {
    }
    public String setName(String name){   //a method to set name
        return name;
    }
        public int setWeight(int weight){  //a method to set weight
            return kilos;
        }
        public boolean canFly(){
            return true;
        }
        public String getName(){   //a method to get name
            return name;
        }
        public int getWeight(){   //a method to get weight
            return kilos;
        }
    }
    

