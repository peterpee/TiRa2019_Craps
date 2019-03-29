
/*
 * Class ending Game
 *
 *
 */

package tira2019_craps;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EndGame {
    
// Game ends after 5 seconds
    
    public void endGame() {
        
        System.out.println("Exiting.....");
        
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gaming.class.getName()).log(Level.OFF, null, ex);
            }
            System.exit(0);
    }
}