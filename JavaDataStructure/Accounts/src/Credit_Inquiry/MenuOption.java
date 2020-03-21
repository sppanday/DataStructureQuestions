/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credit_Inquiry;


//Define an enum type for the credit-inquiry program's options
public enum MenuOption {
    //declare content of enum type
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);
    private final int value; //current menu option
    
    MenuOption(int valueOption){
        value = valueOption;
    }// end menuOptions enum constructor
    public int getValue(){
        return value;
    }//end method getValue
    
}//end enum MenuOption
