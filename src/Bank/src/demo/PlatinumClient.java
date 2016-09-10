
package demo;


public class PlatinumClient  extends Client{

    public PlatinumClient(String name, double amount, Long id) {
        super(name, amount, id);
    }

    
    
    @Override
    public void benefits() {
        System.out.println("Benefits of Platinum Client: ");
    }
    
    
    
}
