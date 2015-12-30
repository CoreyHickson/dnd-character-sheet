package dnd.charactersheet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corey on 7/23/2015.
 */
public class Inventory extends Character {
    private List<String> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    protected void addItem(String name) {
        inventory.add(name);
    }

    protected boolean removeItem(String name) {
        if(inventory.remove(name)) {
            return true;
        }
        return false;
    }

    /**
     * @return a string of the invetory
     */
    protected String getInventory() {
        return inventory.toString();
    }
}
