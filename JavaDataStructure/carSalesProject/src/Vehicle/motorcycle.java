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
public class motorcycle extends Vehicle{
 
    private String seat;

    public motorcycle(String manufacturer,String model,int maxSpeed,double price
            ,String seat)
    {
        super( manufacturer, model, maxSpeed, price);
        this.seat=seat;
    }


    public motorcycle()
    {

    }


    public String getSeat()
    {
        return seat;
    }


    public void setSeat(String seat)
    {
        this.seat = seat;
    }


    @Override
    public String toString()
    {
        return ("Manufacturer:"+manufacturer+"\n"+
               "Model:"+model+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price in euros:"+price+
               "\n"+"Seat type:"+seat+"\n");
    }

}
