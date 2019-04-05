
/*
 * Class that places bets and returns lost, won and current money
 *
 *
 */

package tira2019_craps;

import java.util.Scanner;

public class MoneyCalculator {
    
    private EndGame gameender;
    private Scanner reader;
    private int input;
    private int total;
    private int sumremembered;
    private boolean ok;
    
// Constructors
    
    public MoneyCalculator() {

        this.gameender = new EndGame();
        this.reader = new Scanner(System.in);
        this.input = input;
        this.total = 1000;
        this.sumremembered = 0;
        this.ok = false;
    }

// Setting bets and checking balance
    
    public void startBet() { // Tämä omaksi luokaksi ??????????????
    
        System.out.print("\nYou have " + getTotal() + " dollars. You may bet between 5-100 dollars."); 
        
        do {
            System.out.print("\nChoose your bet and press ENTER.\n");
            this.input = reader.nextInt();
            } 
            while (!(this.input > 4 && 101 > this.input));

            if (this.input > 4 && this.input < 101) {
                this.total = this.total - this.input;    
            }
            System.out.print("\nYour Bet: " + this.input + "$\nBalance: " + this.total + "$\n\n");   
    }
    
// Calculate winnning or loosing on the first round 
    
    public void calcMoneyFirst(int bet, int sum) {
        
        if (bet == 1 && (sum == 7 || sum == 11)) {
           this.total = this.total + 2 * this.input;
           System.out.print("\n\nYou Win !!!!");
           System.out.print("\nBalance: " + getTotal() + "$");
           System.out.print("\nGame continues.\n");
           this.ok = true;
        }
        if (bet == 1 && (sum == 2 || sum == 3 || sum == 12)) {
           System.out.print("\n\nCraps !!! You lose."); 
           System.out.print("\nBalance: " + getTotal() + "$");
           System.out.print("\nGame continues.\n");
           this.ok = false;
        }
        if ((bet == 1 || bet == 2) && (sum == 4 || sum == 5 || sum == 6) || sum == 8 || sum == 9 || sum == 10) {
           this.sumremembered = sum;
           System.out.print("\n\nNo Wins or Losses.");
           System.out.print("\nSum to remember now: " + sum + ".");
           System.out.print("\nBalance: " + getTotal() + "$");
           System.out.print("\nGame continues.\n");
           this.sumremembered = sum;
           this.ok = true;
        }
        if (bet == 2 && (sum == 7 || sum == 11)) {
           System.out.print("\n\nCraps !!! You lose."); 
           System.out.print("\nBalance: " + getTotal() + "$");
           System.out.print("\nGame continues.\n");
           this.ok = false;
        }
        if (bet == 2 && (sum == 2 || sum == 3 || sum == 12)) {
           this.total = this.total + 2 * this.input;
           System.out.print("\nYou Win !!!!");
           System.out.print("\nBalance: " + getTotal() + "$");
           System.out.print("\nGame continues.\n");
           this.ok = true;
        }    
    }
// Calculate winnning or loosing after the first round 
    
    public void calcMoneySecond(int bet, int sum) {
        
    }
 
// Return the bet
    
    public int getInput() {
        return this.input;
    }

// Return the balance
    
    public int getTotal() {
        return this.total;
    }
    
// Return situation after first round
    public boolean getSituation() {
        return this.ok;
    }
    
// Return sum to remember
    public int getSumRemembered () {
        return this.sumremembered;
    }
    
}
            
    

    
    

    

