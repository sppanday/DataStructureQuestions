
package accounts;

import java.util.*;

public class AccountMain {
    
    public static void main(String[] args) {
        Accounts ac = new Accounts("Frank", "DJ", 32984723);
        ac.deposit(45.0);
        ac.withdraw(20.0);
        System.out.println("Name : " + ac.getName()
                + "\n" + "Account Number= "
                + ac.getAccountNumber() + "\n" + "Account Balance = " + ac.getBalance());
    }
    
}
