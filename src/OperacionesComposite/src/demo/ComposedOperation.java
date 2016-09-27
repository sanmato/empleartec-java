
package demo;
import java.util.ArrayList;

public class ComposedOperation implements iOperation {
    private ArrayList<iOperation> operations = new ArrayList<>();
    
    @Override
   public void calculate(){
       
      for (int i = 0; i < operations.size(); i++){
          operations.get(i).calculate();
          }         
   } 
  
   
   public void add(iOperation composedoperation){
       operations.add(composedoperation);
   }
   
   
   public void remove(iOperation composedoperation){
       operations.remove(composedoperation);
   }
   

   
   
   
    
}
