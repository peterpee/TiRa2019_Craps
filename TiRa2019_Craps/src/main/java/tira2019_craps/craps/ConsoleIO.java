
/*
 * ConsoleIO class to test depency injection
 * 
 * 
 */

package tira2019_craps.craps;

import java.util.Scanner;
import tira2019_craps.Gaming;

public class ConsoleIO implements IO {
    
    private Scanner reader;
    
    public ConsoleIO() {
        reader = new Scanner(System.in);
    }
 
    @Override
    public int nextInt() {
        return reader.nextInt();
    }
 
    @Override
    public void print(String x) {
        System.out.print(x);
    }
}