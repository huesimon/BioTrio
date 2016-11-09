/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave2;

import java.util.Random;

/**
 *
 * @author Simon_
 */
public class Die {
    private int value;
    private int dieSide;
    public Die() {

    }
    public Die(int dieSide){
        this.dieSide = dieSide;
    }

    public int getDieSide() {
        return dieSide;
    }

    public void setDieSide(int dieSide) {
        this.dieSide = dieSide;
    }

    public int throwDie() {
        //skift til mathRandom
        Random ran = new Random();
        value = ran.nextInt(dieSide) + 1;
        return value;

    }
}
