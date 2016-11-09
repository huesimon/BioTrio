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
public class Game {

    public static Player player = new Player();
    Player house = new Player();
    Die die = new Die();
    private int playerScore;
    private int houseScore;

    public void playGame1() {
        die.setDieSide(6);
        player.setPlayerName("player");
        house.setPlayerName("house");
        player.setPoints(0);
        house.setPoints(0);

        for (int i = 1; i <= 10; i++) {
            System.out.println("--------------------\n");
            playerScore = playerScore + die.throwDie();
            player.setPoints(playerScore);

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("--------------------\n");
            houseScore = houseScore + die.throwDie();
            house.setPoints(houseScore);

        }

        System.out.println("player points: " + player.getPoints());
        System.out.println("house points: " + house.getPoints());

        if (player.getPoints() < house.getPoints()) {
            System.out.println("house wins");

        }
        if (house.getPoints() < player.getPoints()) {
            System.out.println("player wins");
        }
        if (player.getPoints() == house.getPoints()) {
            System.out.println("draw");
        }

//        for (int i = 1; i <= 6; i++) {
//            System.out.println("--------------------\n");
//            System.out.println("Round: " + i);
//            System.out.println("player thorw: " +die.throwDie());
//            
//            System.out.println("house throw: " + die.throwDie());
//            
//            
//            
//        }
        System.out.println("game 1 done");

    }

    public void playGame2() {
        die.setDieSide(12);
        player.setPlayerName("player");
        house.setPlayerName("house");
        player.setPoints(0);
        house.setPoints(0);
        System.out.println(house.getPoints());

        for (int i = 1; i <= 5; i++) {
            System.out.println("--------------------\n");
            playerScore = playerScore + die.throwDie();
            player.setPoints(playerScore);

        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("--------------------\n");
            houseScore = houseScore + die.throwDie();
            house.setPoints(houseScore);

        }
        
        //// setting die sides to 24 after 5 rolls ////
        die.setDieSide(24);
        ///////////////////////////////////////////////
        for (int i = 1; i <= 5; i++) {
            System.out.println("--------------------\n");
            playerScore = playerScore + die.throwDie();
            player.setPoints(playerScore);

        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("--------------------\n");
            houseScore = houseScore + die.throwDie();
            house.setPoints(houseScore);

        }

        if ((player.getPoints() & 1) == 0) {
            System.out.println(player.getPlayerName() + " even bonus! " + player.getPoints());
            int i = player.getPoints();
            i = i + i;
            player.setPoints(i);

        }
        if ((house.getPoints() & 1) == 0) {
            System.out.println(house.getPlayerName() + " even bonus! " + house.getPoints());
            int i = house.getPoints();
            i = i + i;
            house.setPoints(i);

        }

        System.out.println("player points: " + player.getPoints());
        System.out.println("house points: " + house.getPoints());

        if (player.getPoints() < house.getPoints()) {
            System.out.println("house wins");

        }
        if (house.getPoints() < player.getPoints()) {
            System.out.println("player wins");
        }
        if (player.getPoints() == house.getPoints()) {
            System.out.println("draw");
        }
    }

    public void playGame3() {
        die.setDieSide(6);
        player.setPlayerName("player");
        house.setPlayerName("house");
        player.setPoints(0);
        house.setPoints(0);

        if (die.throwDie() <= 3) {
            System.out.println( house.getPlayerName()+  "'s die throw 1-3, die sides now 12");
            die.setDieSide(12);

        } else {
            System.out.println(house.getPlayerName() + "'s die thow 4-6, die sides now 10");
            die.setDieSide(10);
        }
        for (int i = 1; i <= 1; i++) {
            System.out.println("--------------------\n");
            houseScore = houseScore + die.throwDie();
            house.setPoints(houseScore);

        }
        if (die.throwDie() <= 3) {
            System.out.println(player.getPlayerName()+" die throw 1-3, die sides now 12");
            die.setDieSide(12);

        } else {
            System.out.println(player.getPlayerName() + " die thow 4-6, die sides now 10");
            die.setDieSide(10);
        }
        for (int i = 1; i <= 1; i++) {
            System.out.println("--------------------\n");
            playerScore = playerScore + die.throwDie();
            player.setPoints(playerScore);
        }

        System.out.println(player.getPlayerName() + " points: " + player.getPoints());
        System.out.println(house.getPlayerName() + " points: " + house.getPoints());

        if (player.getPoints() > house.getPoints()) {
            System.out.println(house.getPlayerName() + " wins");

        }
        if (house.getPoints() > player.getPoints()) {
            System.out.println(player.getPlayerName() + " wins");
        }
        if (player.getPoints() == house.getPoints()) {
            System.out.println("draw");
        }
    }
}
