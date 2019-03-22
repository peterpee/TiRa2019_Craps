
/*
 *  Randomize given count of dices and return them     
 *
 */

package tira2019_craps;

import java.util.*;

public class Randomizer {
    
    private int[] dicethrow;
    int sum;

// Constructor
    
    public Randomizer() {
        
        this.dicethrow = new int[2]; 
        this.sum = sum;
    }

// Randomize dices by given count and add to int[]
    
    public void randomizeNumbers (int count) {
         
        System.out.println("You threw dices: ");
        
        for (int i = 0; i < count; i++){
            int random = 1 + (int)(Math.random() * ((count) + 1));   
            this.dicethrow[i] = random;
            System.out.println(this.dicethrow[i] + " ja " + this.dicethrow[i+1]);
            sum = this.dicethrow[i] + this.dicethrow[i+1];
        }
        System.out.println("Together: " + sum);
        
    }
    //public int[] getResult() {
    //    return dicethrow;
    //}
}