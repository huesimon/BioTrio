/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave2;

import java.util.Scanner;

/**
 *
 * @author Simon_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Game game = new Game();
         GameResult gameRS = new GameResult();
         Scanner scan = new Scanner(System.in);
         game.playGame3();
         System.out.println(gameRS);
         System.out.println("tostring");
        
       
    }
    
}
