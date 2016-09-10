
package demo;

import java.util.ArrayList;


public abstract class Client implements Comparable<Client>{
    String name;
    double amount;
    Long id;
    ArrayList <BankAccount> bankAccount = new ArrayList();

    public Client(String name, double amount, Long id) {
        this.name = name;
        this.amount = amount;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public abstract void benefits();
    
    
    
    @Override
    public int compareTo(Client o){
        return this.id.compareTo(o.id);
    }
    
}
