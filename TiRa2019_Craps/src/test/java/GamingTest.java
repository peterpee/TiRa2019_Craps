
/*
 * Test Gaming class
 * 
 * 
 */

import tira2019_craps.craps.IO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tira2019_craps.craps.ConsoleIO;
import tira2019_craps.Gaming;
import java.util.ArrayList;

public class GamingTest {
  
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void firstChoice() {
        
        IOStub io = new IOStub(1, 2, 99);
        new tira2019_craps.craps.Gaming(io).startGame();

        assertEquals(" ??? jotain tähän  ", io.nextInt());
    }
}

class IOStub implements IO {

    int input;

    public IOStub(int input, int input1, int input2) {
        this.input = input;
        this.input = input1;
        this.input = input2;
    }

    public int nextInt() {
        return input;
    }

    public void print(String x) {
        System.out.println(x);
    }
}


// // Jatkuu loput Gaming testit ....