
/*
 * Test EndGame class
 * 
 * 
 */

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import tira2019_craps.EndGame;

public class EndGameTest extends SecurityManager {
      
   private EndGame gameender = new EndGame();
    
   public static final class ExitSecurityException extends SecurityException {
       
        private final int status;
 
        public ExitSecurityException(final int status) {
            this.status = status;
        }
 
        public int getStatus() {
            return this.status;
        }
    }
 
    @Override
    public void checkExit(final int status) {
        throw new ExitSecurityException(status);
    }

public class EndGameTesting {
    
    @BeforeClass
    public void setUpClass() {
        System.setSecurityManager(new EndGameTest());
    }
    
    @AfterClass
    public void tearDownClass() {
    }
 
    @Test
    public void ExpectExit() {
         
        try {       
            gameender.endGame();
            Assert.fail("Expected exit");
        } catch (ExitSecurityException e) {
            int status = e.getStatus();
            Assert.assertEquals(1, status);
        }
    }
}
}