package nyc.c4q.shawnspeaks;

import java.util.Scanner;

/**
 * Created by shawnspeaks on 9/2/16.
 */
public class Methods {
    Weapon weapon = null;

    public static enum  Weapon {
        SWORD,
        MACE,
        AXE
    }

    public void print (String printStatement) {
        System.out.println(printStatement);
    }

    public void chooseWeapon (){
        boolean validWeapon = false;
        do {
            print("Choose your weapon wisely!");
            Scanner in = new Scanner (System.in);
            String input = in.next();
            if(input.equalsIgnoreCase("sword")){
                validWeapon = true;
                weapon = Weapon.SWORD;
            }else if (input.equalsIgnoreCase("axe")){
                validWeapon = true;
                weapon = Weapon.AXE;
            }else if (input.equalsIgnoreCase("mace")){
                validWeapon = true;
                weapon = Weapon.MACE;
            }
        }while (!validWeapon);
        System.out.println(weapon);
    }
}