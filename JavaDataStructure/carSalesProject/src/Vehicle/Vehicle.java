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

    public abstract class Vehicle{
        protected String manufacturer;
        protected String model;
        protected int maxSpeed;
        protected double price;

        public Vehicle(String manufacturer,String model,int maxSpeed,double price)
        {
            this.manufacturer=manufacturer;
            this.model=model;
            this.maxSpeed=maxSpeed;
            this.price=price;

        }

        public Vehicle()
        {

        }


        public String getManufacturer()
        {
            return manufacturer;
        }


        public void setManufacturer(String manufacturer)
        {
            this.manufacturer = manufacturer;
        }


        public String getModel()
        {
            return model;
        }


        public void setModel(String model)
        {
            this.model = model;
        }


        public int getMaxSpeed()
        {
            return maxSpeed;
        }


        public void setMaxSpeed(int maxSpeed)
        {
            this.maxSpeed = maxSpeed;
        }


        public double getPrice()
        {
            return price;
        }


        public void setPrice(double price)
        {
            this.price = price;
        }



       public String toString()
        {
           return ("Manufacturer:"+manufacturer+"\n"+
                   "Model:"+model+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price in euros:"+price+
                   "\n");
        }



    }
