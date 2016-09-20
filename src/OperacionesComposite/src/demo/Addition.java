
package demo;


public class Addition extends BasicOperation{

    public Addition(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void calculate() {
        System.out.println("The result is: "+(numA+numB));
    }
    
    
}
