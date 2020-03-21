
package weeklytask8;


public class Vehicle {
  
  private String engineType;
  private double topSpeed;
  private String make;

  public Vehicle() {
  }

  public Vehicle(String engineType, double topSpeed, String make) {
    this.engineType = engineType;
    this.topSpeed = topSpeed;
    this.make= make;
  }
  
  public String getEngineType() {
    return engineType;
  }

  public double getTopSpeed() {
    return topSpeed;
  }
  
  public String getMake(){
    return make;
  }
}
