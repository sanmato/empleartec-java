
package demo;


public class BankAccount {
    double balance;
    Long accountID;
    AccountType accountType;
    int interest;

    public BankAccount(double balance, Long accountID, AccountType accountType, int interest) {
        this.balance = balance;
        this.accountID = accountID;
        this.accountType = accountType;
        this.interest = interest;
    }
    
    
    
    void operate(){
        
        
    }
    
    public double extract(){
        return 0;
    }
    
    public double deposite(double deposit){
        balance+=deposit;
        return balance;
    }
    
    
}
