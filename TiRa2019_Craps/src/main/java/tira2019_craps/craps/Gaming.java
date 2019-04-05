
/*
 * Testing Gaming
 * 
 * 
 */

package tira2019_craps.craps;

import java.util.Scanner;

public class Gaming  {
        
        private IO io;
        private int number1;

        public Gaming(IO io) {
            
            this.io = io;
            this.number1 = number1;
        }
        
        public void startGame() {
          
        io.print("\n### Welcome to Craps ###\n\n");
        io.print("(1)  Print Rules.\n");
        io.print("(2)  Continue to the Game.\n");
        io.print("(99) Exit.\n\n");

        do {
            io.print("Choose and press ENTER.\n");
            number1 = io.nextInt();
        } 
        while (!(this.number1 == 1 || this.number1 == 2 || this.number1 == 99));
    
}
}
