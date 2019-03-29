
/*
 * Class that returns lost, won and current money
 *
 *
 */

package tira2019_craps;

import java.util.Scanner;

public class MoneyCalculator {
    
    private int givenbet;
    private Scanner reader;
    private int input;
    private int total;
    //private int[] array;
    
// Constructors
    
    public MoneyCalculator() {

        this.givenbet = 0;
        this.reader = new Scanner(System.in);
        this.input = input;
        this.total = 1000;
        //this.array = new int[2];
    }

// First bet
    
    public void startBet() {
    
        System.out.println("\nYou have " + this.total + " dollars. You may bet between 5-100 dollars.");
    
        do {
            System.out.println("Choose the bet and press ENTER.");
            this.input = this.reader.nextInt();
            } 
            while (!(this.input > 4 && 101 > this.input));

            if (this.input > 4 && this.input < 101) {
                this.total = 1000 - this.input;    
            }
            System.out.println("Your Bet: " + this.input + "$ Balance: " + this.total + "$\n");   
    }
 
// Get the bet
    
    public int getInput() {
        return this.input;
    }

// Get the balance
    
    public int getTotal() {
        return this.total;
    }
// Muita metodeja lisäämään, vähentämään, yms.
}
            
    

    
    

    

