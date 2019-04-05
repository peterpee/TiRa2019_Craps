
/*
 * TXT-based Interface-class, initializes a new game
 *
 *
 */

package tira2019_craps;

import tira2019_craps.craps.ConsoleIO;

public class Interface {
    
    private Gaming gaming;

// Constructor with ConsoleIO
    
    public Interface () {
               
    this.gaming = new Gaming();
// // Console IO tähän mukaan ??? Ja craps kansioon io testaus koodit
//this.gaming = new Gaming(new tira2019_craps.craps.ConsoleIO());
    }
    
// Game starts in class Gaming
    
    public void startgame() {
        this.gaming.startGame();
    }
}
