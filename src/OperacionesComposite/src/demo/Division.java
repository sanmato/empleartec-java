
package demo;

public class Division extends BasicOperation {

    public Division(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void calculate() {
        System.out.println("The result is: "+(numA/numB));
    }
    
    
}
