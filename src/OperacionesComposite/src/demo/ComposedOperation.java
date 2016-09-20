
package demo;
import java.util.ArrayList;

public class ComposedOperation implements iOperation {
    private ArrayList<ComposedOperation> operations = new ArrayList<ComposedOperation>();
    
    @Override
   public void calculate(){
       
   } 
  
   
   public void add(ComposedOperation composedoperation){
       operations.add(composedoperation);
   }
   
   
   public void remove(ComposedOperation composedoperation){
       operations.remove(composedoperation);
   }
   

   public void show(int profundity){
       for (int i = 0; i < operations.size(); i++)
            operations.get(i).show(profundity + 1);
   }
   
    
}
