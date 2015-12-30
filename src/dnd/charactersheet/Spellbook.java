package dnd.charactersheet;

import java.util.HashMap;

/**
 * A spellbook for spell casters which contains their spells
 * Created by Corey on 7/23/2015.
 */
public class Spellbook extends Character {
    // This could be implemented better with a two key hash map somehow
    private HashMap<String, Spell> spells = new HashMap<String, Spell>();

    protected void addSpell(Spell spell) {
        spells.put(spell.getName(), spell);
    }

    protected void removeSpell(String name) {
        spells.remove(name);
    }

    protected Spell getSpell(String name) {
        return spells.get(name);
    }
}
