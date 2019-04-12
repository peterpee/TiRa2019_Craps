
/*
 *  Randomize dices and return sum or dices     
 *
 *
 */

package tira2019_craps;

import java.util.*;

public class Randomizer {
    
    private int max;
    private int last;
    private int total = 0;
    private int[] dices;
    private int dicethrows = 0;
    private int sum;

// Constructor
    
    public Randomizer() {
        
        this.total = total;
        this.dices = new int[20];
        this.dicethrows = dicethrows;
        this.max = 7;
        this.sum = sum;
        this.last = (int) (System.currentTimeMillis() % this.max);
    }

// Randomize two dices
    
    public int nextInt(){
        
        this.last = (this.last * 32719 + 3) % 32749;
        if (this.last % this.max == 0) {
            nextInt();
        }
        return this.last % this.max;
    }
    
// Print randomized dices   

    public void randomizeNumbers() {
 
        System.out.println("You threw dices: ");
        this.sum = 0;

        for (int i = 0; i < 20 ; i++) {
            total += 1;
            if (total < 3) {
                this.dices[i] = this.nextInt();
                System.out.print(nextInt() + "  ");
            }   
        }
        
       System.out.println(this.dices[0] + this.dices[1]);
    }

// Return dices

    public int[] getResult() {
        return dices;
    }
    
// Return sum
    
    public int getSum() {
        this.sum = dices[0] + dices[1];
        return this.sum;
    }
}      
