
/*
 * Class where Game goes on
 * 
 *
 */

package tira2019_craps;

import java.util.Scanner;

public class Gaming {
    
    private Rules rules;
    private Randomizer randomizer;
    private EndGame gameender;
    private Scanner reader;
    private MoneyCalculator moneycalculator;
    private CustomHash customhash;
    private int bet;
    private int sum;
    private int input;
    
// Constructors
    
    public Gaming () {
  
        this.rules = new Rules();
        this.randomizer = new Randomizer();
        this.gameender = new EndGame();
        this.reader = new Scanner(System.in);
        this.moneycalculator = new MoneyCalculator();
        this.customhash = new CustomHash();
        this.bet = bet;
        this.sum = sum;
        this.input = input;
    }
     
// Game starts with choices
    
    public void startGame() {
          
        System.out.print("\n### Welcome to Craps ###\n\n");
        System.out.print("(1)  Print Rules.\n");
        System.out.print("(2)  Continue to the Game.\n");
        System.out.print("(99) Exit.\n\n");

// Loop until correct answer, handled approppriately

        do {
            System.out.print("Choose and press ENTER.\n");
            this.input = reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 2 || this.input == 99));
        
// Print rules    

        if (this.input == 1) {
            this.rules.printRules();
            contGame();
        }
        
// Start Game

        if (this.input == 2) {
            contGame();
        }
        
// Game ends

        if (this.input == 99) {
            this.gameender.endGame();
        }
    }
    
// Game continues with bet player chooses
    
    public void contGame() {
               
        System.out.print("\n(1)  Choose your bet.\n");
        System.out.print("(99) Exit.\n\n");
        
        do {
            System.out.print("Choose and press ENTER. \n");
            this.input = reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 99));
 
        if (this.input == 1) {
            // checkBalance();
            this.moneycalculator.startBet();
        }

// Game ends

        if (this.input == 99) {
            this.gameender.endGame();
        }
        
        placeBet();
    }
   
// Place the bet on either choices, first round
    
    public void placeBet() {
        
        System.out.print("(1)  Place Pass Line.\n");
        System.out.print("(2)  Place Don´t Pass Line.\n");
        System.out.print("(99) Exit.\n\n");
        
        do {
            System.out.print("Choose and press ENTER.\n");
            this.input = reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 2 || this.input == 99));

// Throw dices and calculate result

        if (this.input == 1 || this.input == 2) {
            //checkBalance();
            this.randomizer.randomizeNumbers();
            this.sum = this.randomizer.getSum();
            this.moneycalculator.calcMoneyFirst(this.input, this.sum);         
        }

// Game ends

        if (this.input == 99) {
            this.gameender.endGame();
        }
        
// Check situation after first round and continue accordingly

        if (this.moneycalculator.getSituation() == false) {
            contGame();
        }
        if (this.moneycalculator.getSituation() == true) {
            placeBet2();
        }
    }
    
// Game moves on with different choices, rounds after first

    public void placeBet2() {
        
        contGame();
        
        System.out.print("\n\n(1)  Place Pass Line.\n");
        System.out.print("(2)  Place Don´t Pass Line.\n");
        System.out.print("(3)  Place Take Odds.\n");
        System.out.print("(4)  Place Lay Odds.\n");
        System.out.print("(5)  Place Field Bets.\n");
        System.out.print("(6)  Place Pass Line.\n");
        System.out.print("(7)  Place Buy Bet.\n");
        System.out.print("(8)  Place Lay Bet.\n");
        System.out.print("(9)  Place C-Bet.\n");
        System.out.print("(10) Want to see statistics ???\n");
        System.out.print("(99) Exit.\n\n");
        
        do {
            System.out.print("Choose and press ENTER.\n");
            this.input = reader.nextInt();
        } 
        while (!(this.input == 1 || this.input == 2 || this.input == 3
                || this.input == 4 || this.input == 5 || this.input == 6
                || this.input == 7 || this.input == 8 || this.input == 9
                || this.input == 10 || this.input == 99));
        
        if (this.input == 1 || this.input == 2 || this.input == 3
            || this.input == 4 || this.input == 5 || this.input == 6
            || this.input == 7 || this.input == 8 || this.input == 9) {
            
            //checkBalance();
            //moneyBetter();
            
            this.randomizer.randomizeNumbers();
            this.sum = this.randomizer.getSum();
            this.moneycalculator.calcMoneySecond(this.input, this.sum);   
        }
        
// Show statistic

        if (this.input == 10) {
            this.customhash.showResults();
        }
        
// Game ends

        if (this.input == 99) {
            this.gameender.endGame();
        }
    }
}
    

