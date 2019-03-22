
/*
 * TXT-based Interface-class, initializes a new game
 * 
 */

package tira2019_craps;

public class Interface {
    
    private Gaming newGame;
    private Gaming newGameTest;

// Constructor
    
    public Interface() {
        
// IO intitialisointi testaukseen??
        
        this.newGame = new Gaming();
        this.newGameTest = new Gaming();
    }
    
// Game starts in class Gaming
    
    public void startgame() {
        this.newGame.startGame();
    }
}
