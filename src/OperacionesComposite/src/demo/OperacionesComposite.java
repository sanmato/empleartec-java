
package demo;


public class OperacionesComposite {

    public static void main(String[] args) {
    ComposedOperation opa = new ComposedOperation();
    opa.add(new Addition(2,3));
    }
    
}
