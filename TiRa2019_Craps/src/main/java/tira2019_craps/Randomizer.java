
/*
 *  Randomize given count of dices and return them     
 *
 */

package tira2019_craps;

import java.util.*;

public class Randomizer {
    
    private int[] dicethrow;
    private int sum;

// Constructor
    
    public Randomizer() {
        
        this.dicethrow = new int[2]; 
        this.sum = 0;
    }

// Randomize two dices
    
    public void randomizeNumbers (int count) {
         
        System.out.println("\nYou threw dices:");
        System.out.println("Dice - Count");
        
        for (int i = 0; i < count; i++){
            int random = 1 + (int)(Math.random() * ((count) + 1));   
            this.dicethrow[i] = random;
            System.out.println(i + 1 + "      "  + this.dicethrow[i]);
            sum = sum + this.dicethrow[i];
        }
        System.out.println("Sum:   " + sum);
        
    }
    //public int[] getResult() {
    //    return dicethrow;
    //}
}