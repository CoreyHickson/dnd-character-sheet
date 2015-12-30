package dnd.charactersheet;

/**
 * The stats of a weapon, specific to a character (stats included)
 * Created by Corey on 7/23/2015.
 */
public class Weapon {
    private String name;
    private int atkBonus;
    private String damage;

    public Weapon(String name, int atkBonus, String damage) {
        this.name = name;
        this.atkBonus = atkBonus;
        this.damage = damage;
    }

    protected String getName() {
        return name;
    }
}
