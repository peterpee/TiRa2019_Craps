
/*
 *  Randomize given count of dices and return the sum    
 *
 */

// // Tehtävä generointi itse, kesken
package tira2019_craps;

import java.util.*;

public class Randomizer {
    
    private int[] dicethrow;
    private int sum;
    private int throwcount;

// Constructor
    
    public Randomizer() {

        this.dicethrow = new int[2]; 
        this.sum = sum;
        this.throwcount = 0;
    }

// Randomize two dices
    
    public void randomizeNumbers (int count) {
        
        this.sum = 0;
         
        System.out.print("\nRolling the dices....");
        System.out.print("\nYou threw dices:");
        System.out.print("\nDice - Count\n");
        this.throwcount = throwcount + 1;
        
        for (int i = 0; i < count; i++){
            int random = 1 + (int)(Math.random() * ((count) + 1));   
            this.dicethrow[i] = random;
            System.out.print(i + 1 + "      "  + this.dicethrow[i] + "\n");
            this.sum = this.sum + this.dicethrow[i];
        }
        System.out.print("Sum:   " + this.sum);
        
    }

// Return the thrown sum
    
    public int getSum () {
        return this.sum;
    }
    
// Return the counted throws
    
    public int getThrowcount (){
        return this.throwcount;
    }
}