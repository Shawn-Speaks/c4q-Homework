package nyc.c4q.shawnspeaks;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

import static nyc.c4q.shawnspeaks.Enemies.Foes.DRAGON;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double winChance = 0;
        boolean liveToSeeAnotherDay;
        Methods methods = new Methods();
        Enemies enemies = new Enemies();
        methods.print("Welcome to the Arena of Doom young Champion");
        methods.print("Your death is certain, but King Girugamesh has been so kind as to let you choose your fate!");
        methods.chooseWeapon();
        enemies.whomYouBattle();


        switch (enemies.foe){
            case GOBLINS: if(methods.weapon.equals(Methods.Weapon.MACE)) {
                                winChance = Math.random() * 200;
                            }else
                                methods.print(" You think to yourself 'A Mace would've helped me squash this horde of goblins' ");
                                winChance = Math.random() * 100;
                break;
            case OGRE:    if(methods.weapon.equals(Methods.Weapon.AXE)) {
                               winChance = Math.random() * 200;
                            }else
                                methods.print("The ogre enters the arena and you realize an axe would have been a much better choice!");
                                winChance = Math.random() * 100;
                break;
            case DRAGON:  if(methods.weapon.equals(Methods.Weapon.SWORD)) {
                                winChance = Math.random() * 200;
                                methods.print("Wow, this Sword is perfect");
                            }else
                                winChance = Math.random() * 75;
                break;
            case KING_GIRUGAMESH:
                                winChance = 0;
            }

        System.out.println(winChance);

            if (winChance > 50){
                methods.print("You defeated the : " + enemies.foe + " King Girgamesh is entertained and allows you to live another day!");
            }else if (winChance > 0) {
                methods.print("Your  " + methods.weapon + " was no chance against the " + enemies.foe + ". \n YOU LOSE!");
            }else if (winChance == 0)
                methods.print("King Girugmesh laughs, he snaps his finger and suddenly.... You are no more. \n YOU LOSE!");

    }

}
