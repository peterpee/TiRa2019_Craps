
/*
 * TXT-based Interface-class, initializes a new game
 *
 *
 */

package tira2019_craps;

public class Interface {
    
    private Gaming gaming;

// Constructor with ConsoleIO
    
    public Interface () {
               
        this.gaming = new Gaming(new ConsoleIO());
    }
    
// Game starts in class Gaming
    
    public void startgame() {
        this.gaming.startGame();
    }
}
