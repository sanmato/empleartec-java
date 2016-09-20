
package demo;


public class Multiplication extends BasicOperation {

    public Multiplication(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void calculate() {
        System.out.println("The result is: "+(numA*numB));
    }
    
}
