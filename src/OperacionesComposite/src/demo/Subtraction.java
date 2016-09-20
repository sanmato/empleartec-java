
package demo;


public class Subtraction extends BasicOperation {

    public Subtraction(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void calculate() {
        System.out.println("The result is: "+(numA-numB));
    }
    
}
