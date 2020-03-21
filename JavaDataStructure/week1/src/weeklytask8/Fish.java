
package weeklytask8;

public class Fish {
   private String type;
   private boolean scales;
   public Fish(){
       }
   public Fish(String type, boolean scales){
    this.type = type;
    this.scales = scales;
}
   public void swim(){
       System.out.println("a fish is swimming");
   }
   public String getType(){
       return type;
   }
   public boolean hasScales(){
       return scales;
   }
}
