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
public class BankAccount {
    private final int AccountAge;
    private final int CreditScore;
    private final AccountInterest AccountInterest;
    
     
    
    public BankAccount(int accountAge, int creditScore, AccountInterest accountInterest)
    {
        AccountAge = accountAge;
        CreditScore = creditScore;
        AccountInterest = accountInterest;
        
    }
    public double CalculateInterestRate(){
        if(CreditScore>800){
            return 0.02;
        }
        if(AccountAge > 10){
            return 0.08;
        }
        return 0.05;
    }
    
}
