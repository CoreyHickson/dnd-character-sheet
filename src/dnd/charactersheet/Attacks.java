package dnd.charactersheet;

import java.util.Iterator;
import java.util.*;

/**
 * This will store weapons and their attacks, such that you can
 * call the attacks as if you were going to use the weapon.
 * Created by Corey on 7/23/2015.
 */
public class Attacks extends Character {
    private HashMap<String, Weapon> weapons;

    public Attacks() {
        weapons = new HashMap<String, Weapon>();
    }

    /**
     * Add an attack to the list of attacks
     *
     * @param name     the name of the attack/weapon
     * @param atkBonus the attack bonus (STAT + proficiency)
     * @param damage   how much damage is added on (STAT)
     */
    protected void addAttack(String name, int atkBonus, String damage) {
        this.weapons.put(name, new Weapon(name, atkBonus, damage));
    }

    /**
     * Tries to remove a attack/weapon from the list of attacks
     *
     * @param name the attack trying to be removed
     * @return true if removed, false otherwise
     */
    protected boolean removeAttack(String name) {

        if(weapons.remove(name) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * @param name the name of the weapon you want, ex. Longsword +1
     * @return the weapon class of the attack you requested
     */
    protected Weapon getAttack(String name) {
        return weapons.get(name);
    }
}
