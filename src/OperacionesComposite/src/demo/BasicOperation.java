

package demo;


public abstract class BasicOperation implements iOperation {
    double numA, numB;

    public BasicOperation(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
    
    @Override
    public abstract void calculate();
    
    
}
