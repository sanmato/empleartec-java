
package com.empleartec.juego.juego;

//REVISAR
public class DuelService {
    void combat(Character fighterA, Character fighterB)
    {
        if(fighterA.stats.get("Agility")>fighterB.stats.get("Agility"))
        {
            fighterA.attack(fighterB);
        }
        else
        {
            fighterB.attack(fighterA);
        }
    }
    
}
