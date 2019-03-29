
/*
 * Test EndGame class
 * 
 * 
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tira2019_craps.EndGame;

public class EndGameTest {
    
    private EndGame gameender;

    public EndGameTest() {
        
        this.gameender = new EndGame();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
@Test
    public void exitsGameTest() {
        
        gameender.endGame();
// Miten testataan System.exit, jottei itse testi pääty ???
// Tarkisteltava miten...
        //System.exit(0);  
        assertFalse("Exiting...", true);
    }
}
