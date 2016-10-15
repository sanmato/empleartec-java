
package com.empleartec.juego.juego;

//REVISAR
public class DuelService {
    void combat(Character fighterA, Character fighterB)
    {
        boolean winner = false;
     /* while(fighterA.stats.get("Agility")>fighterB.stats.get("Agility")&&!winner)
        {
            fighterA.attack(fighterB);
      
            if(fighterB.getHealth()<=0){
                
                System.out.println("Fighter"+fighterA.name+"Wins the duel");
                winner = true;
                
            }else{
                
                System.out.println("Fighter"+fighterB.name+"Wins the duel");
                winner=true;
            }
            
        }
       */
     do{
         if(fighterA.stats.get("Agility")>fighterB.stats.get("Agility")){
          fighterA.attack(fighterB);
          fighterB.attack(fighterA);
         }else{
          fighterB.attack(fighterA);
          fighterA.attack(fighterB);
         }
             }while((fighterB.getHealth()>=0)&&(fighterA.getHealth()>=0));
     
     if(fighterA.getHealth()<=0)
     {
            System.out.println("Fighter"+fighterA.name+"Wins the duel");
                winner = true;
                
            }else{
                
                System.out.println("Fighter"+fighterB.name+"Wins the duel");
                winner=true;
            }
     }
     
     
        
      /*
        if(fighterA.stats.get("Agility")>fighterB.stats.get("Agility"))
        {
            fighterA.attack(fighterB);
            fighterB.attack(fighterA);
        }
        else
        {
            fighterB.attack(fighterA);
            fighterA.attack(fighterA);
        }
   */
        
        
    }
    
    
    

