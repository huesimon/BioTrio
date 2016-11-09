/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave2;

/**
 *
 * @author Simon_
 */
public class GameResult {
    public GameResult (){
        
    }
    public String toString(){
        return "Spilresultat:" +"\n" + Game.player.getPoints() ;
    }
}
