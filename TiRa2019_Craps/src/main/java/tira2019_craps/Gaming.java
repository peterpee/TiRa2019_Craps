
/*
 * Class where Game goes on
 * 
 *
 */

package tira2019_craps;

import java.util.Scanner;

public class Gaming {
    
    private ConsoleIO io;
    private Rules rules;
    private Randomizer randomizer;
    private EndGame gameender;
    private Scanner reader;
    private MoneyCalculator moneycalculator;
    private int bet;
    private int sum;
    private int input;
    
// Constructors, IO considered for testing
    
    public Gaming (ConsoleIO io) {
  
        this.io = new ConsoleIO(); 
        this.rules = new Rules();
        this.randomizer = new Randomizer();
        this.gameender = new EndGame();
        this.reader = new Scanner(System.in);
        this.moneycalculator = new MoneyCalculator();
        this.bet = bet;
        this.sum = sum;
        this.input = input;
    }
     
// Game starts with choices
    
    public void startGame() {
          
        io.print("\n### Welcome to Craps ###\n\n");
        io.print("(1) Print Rules.\n");
        io.print("(2) Continue to the Game.\n");
        io.print("(9) Exit.\n\n");

// Loop until correct answer, handled approppriately

        do {
            io.print("Choose and press ENTER.\n");
            this.input = io.nextInt();
        } 
        while (!(this.input == 1 || this.input == 2 || this.input == 9));
        
        if (this.input == 1) {
            this.rules.printRules();
            contGame();
        }
        if (this.input == 2) {
            contGame();
        }
        if (this.input == 9) {
            this.gameender.endGame();
        }
    }
    
// Game continues with bet that player chooses
    
    public void contGame() {
        
        System.out.println("\n(1) Choose your bet.");
        System.out.println("(9) Exit.\n");
        
        do {
            System.out.println("Choose and press ENTER.");
            this.input = this.reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 9));
        
        if (this.input == 1) {
            this.moneycalculator.startBet();
            placeBet();
        }
        if (this.input == 9) {
            this.gameender.endGame();
        }
    }

// Place the bet on either choices
    
    public void placeBet() {
        
        System.out.println("(1) Place Pass Line.");
        System.out.println("(2) Place Don´t Pass Line.");
        System.out.println("(9) Exit.\n");
        
        do {
            System.out.println("Choose and press ENTER.");
            this.input = this.reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 2 || this.input == 9));
        
        if (this.input == 1 || this.input == 2) {
            this.randomizer.randomizeNumbers(2);
        }
        if (this.input == 9) {
            this.gameender.endGame();
        }
    }

}
    

