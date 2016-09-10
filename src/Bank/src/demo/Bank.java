
package demo;


public class Bank {

    public static void main(String[] args) {
    Client pepito = new RegularClient("Pepe", 2000.0, 1L);
    pepito.benefits();
    BankAccount acc1 = new BankAccount(1000, 1L, AccountType.CURRENT_ACCOUNT, 15);
    
    pepito.bankAccount.add(acc1);
        System.out.println(pepito.bankAccount.get(0).deposite(90));
    
    }
    
}
