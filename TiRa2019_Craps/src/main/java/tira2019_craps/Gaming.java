
/*
 * Class Game goes on
 *  
 */

package tira2019_craps;

import java.util.Scanner;

public class Gaming {
    
    private Rules rules;
    private Randomizer randomizer;
    private EndGame gameender;
    private Scanner reader;
    private int bet;
    private int sum;
    private int input1;
    
// Constructors
    
    public Gaming () {
  
        this.rules = new Rules();
        this.randomizer = new Randomizer();
        this.gameender = new EndGame();
        this.reader = new Scanner(System.in);
        this.bet = bet;
        this.sum = sum;
        this.input1 = input1;
    }
     
// Game starts with choices
    
    public void startGame() {
          
        System.out.println("### Welcome to Craps ### \n");
        System.out.println("(1) Print Rules.");
        System.out.println("(2) Continue to the Game.");
        System.out.println("(9) Exit.\n");

// Loop until correct answer, handled approppriately

        do {
            System.out.println("Choose and press ENTER.");
            this.input1 = this.reader.nextInt();
        } 
        while (!(this.input1 == 1 || this.input1 == 2 || this.input1== 9));
        
        if (this.input1 == 1) {
            this.rules.printRules();
            contGame();
        }
        if (this.input1 == 2) {
            contGame();
        }
        if (this.input1 == 9) {
            this.gameender.endGame();
        }
    }
    
// Game continues with betting
    
    public void contGame() {
        System.out.println("Choose:");
        System.out.println("(2) Place your bet.");
        System.out.println("(9) Exit.");
        System.out.println();
        //getInput();
   }
    
}
