package demo;


public class Labotatorio2daClaseEj1 {


    public static void main(String[] args) {
        Operacion op1 = new Suma(2, 3);
        System.out.println(+op1.num1+ "+" +op1.num2+  "="+op1.calcular());
        Operacion  op2 = new Resta(5, 2);
        System.out.println(+op2.num1+ "-" +op2.num2+  "="+op2.calcular());
        Operacion op3 = new Producto (9, 9);
        System.out.println(+op3.num1+ "x" +op3.num2+  "="+op3.calcular());
        Operacion op4 = new Division(255, 5);
        System.out.println(+op4.num1+ "/" +op4.num2+  "="+op4.calcular());
        
       
    }
    
}
