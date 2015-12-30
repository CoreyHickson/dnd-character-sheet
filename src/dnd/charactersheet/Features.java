package dnd.charactersheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * A collection of the features a character has.
 * Created by Corey on 7/23/2015.
 */
public class Features extends Character {
    private HashMap<String, Feature> features;

    public Features() {
        features = new HashMap<String, Feature>();
    }

    protected void addFeature(String name, String description) {
        features.put(name, new Feature(name, description));
    }

    /**
     * remove a certain feature based off its name
     * @param name the name of the feature being removed
     * @return true if removed, false otherwise
     */
    protected boolean removeFeature(String name) {
        if(null == features.remove(name)) {
            return false;
        }
        else {
            return true;
        }
    }
}
