/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credit_Inquiry;

public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
  public AccountRecord(){
      this(0,"","",0.0); // call four-arguement constructor  
  }  //end four arguements constructor
  public AccountRecord(int acct, String first, String last, double bal){
      setAccount(acct);
      setFirstName(first);
      setLastName(last);
      setBalance(bal);
  }// end four-arguement AccountRecord constructor
  //set account number

    public void setAccount(int acct) {
         account = acct;
    }
    public int getAccount(){
        return account;
    }

    public void setFirstName(String first) {
       firstName = first;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }
    public String getLastName(){
        return lastName;
    }

    public void setBalance(double bal) {
        balance = bal;
    }
   public double getBalance(){
        return balance;
    }
  
}
