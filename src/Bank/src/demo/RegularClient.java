
package demo;


public class RegularClient extends Client {

    public RegularClient(String name, double amount, Long id) {
        super(name, amount, id);
    }
    
   
    @Override
    public void benefits() {
        System.out.println("Benefits of Regular Client: ");
    }
    
    
    
}
