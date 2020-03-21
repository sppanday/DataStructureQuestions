/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gooddogtestdrive;

/**
 *
 * @author surendrapanday
 */
class GoodDog {
    private int size;
    
    public void setSize(int s){
        size = s;
    }
    
    public int getSize(){
        return size;
    }
    public void bark(){
        if(size>60){
            System.out.println("woof woof");
        }else if(size>20){
            System.out.println("ruff ruff");
        }else{
            System.out.println("yip yip");
        }
    }
}
