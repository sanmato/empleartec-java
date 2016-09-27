
package demo;


public class OperacionesComposite {

    public static void main(String[] args) {
    ComposedOperation opa = new ComposedOperation();
    opa.add(new Addition(3,5));
    opa.add(new Multiplication (0, 5));
    opa.calculate();
    }
    
}
