/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author surendrapanday
 */
public class car extends Vehicle
{

    private int numDoors;
    private int numWheels;


    public car(String manufacturer,String model,int maxSpeed,double price,int numWheels
            ,int numDoors)
    {
        super(manufacturer,model,maxSpeed,price);
        this.numDoors=numDoors;
        this.numWheels=numWheels;

    }

    public car()
    {

    }


    public int getNumDoors()
    {
        return numDoors;
    }


    public void setNumDoors(int numDoors)
    {
        this.numDoors = numDoors;
    }


    public int getNumWheels()
    {
        return numWheels;
    }


    public void setNumWheels(int numWheels)
    {
        this.numWheels = numWheels;
    }

    public String toString()
    {
        return ("Number of doors:"+numDoors+"\n"+"Number of wheels:"+numWheels+""
                + "\n"+
        "Manufacturer:"+manufacturer+"\n"+
               "Model:"+model+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price in euros:"+price+
               "\n");
    }

}

