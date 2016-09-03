package nyc.c4q.shawnspeaks;

import static java.lang.Math.random;

/**
 * Created by shawnspeaks on 9/2/16.
 */
public class Enemies {
    Foes foe;

    public static enum Foes {
        GOBLINS,
        OGRE,
        DRAGON,
        KING_GIRUGAMESH
    }

    public void whomYouBattle (){
        double rndmNum = Math.random();
        if (rndmNum < .3 ){
            this.foe = Foes.GOBLINS;
        }else if (rndmNum < .6){
            this.foe = Foes.OGRE;
        }else if (rndmNum < .9){
            this.foe = Foes.DRAGON;
        }else
            this.foe = Foes.KING_GIRUGAMESH;

        System.out.println("You will fight THE " + this.foe);
    }
}
