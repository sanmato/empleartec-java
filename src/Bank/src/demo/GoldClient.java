
package demo;

public class GoldClient extends Client {

    public GoldClient(String name, double amount, Long id) {
        super(name, amount, id);
    }

    
    
    @Override
    public void benefits() {
        System.out.println("Benefits of Gold client: ");
    }

    
}
