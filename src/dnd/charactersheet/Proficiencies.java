package dnd.charactersheet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corey on 7/23/2015.
 */
public class Proficiencies extends Character {
    private List<String> proficiencies;

    public Proficiencies() {
        proficiencies = new ArrayList<>();
    }

    protected boolean contains(String s) {
        return proficiencies.contains(s);
    }

    protected void addProficiency(String name) {
        proficiencies.add(name);
    }

    protected boolean removeProficiency(String name) {
        if(proficiencies.remove(name)) {
            return true;
        }
        return false;
    }
}
