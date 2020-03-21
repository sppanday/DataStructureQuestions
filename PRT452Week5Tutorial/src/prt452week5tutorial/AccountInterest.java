/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prt452week5tutorial;

/**
 *
 * @author surendrapanday
 */
public class AccountInterest {
     
   public AccountInterest(){   
        
    }

    public AccountInterest(BankAccount account){
        account = account;
    }
    public double setInterestRate(){
       return 0;
        
    }
    public double getInterestRate()
            {
               return Account.CalculateInterestRate();
            }
    
             }



