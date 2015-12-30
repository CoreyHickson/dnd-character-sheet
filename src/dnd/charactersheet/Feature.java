package dnd.charactersheet;

/**
 * A name and description of how something works
 * Created by Corey on 7/23/2015.
 */
public class Feature {
    private String name;
    private String description;

    public Feature(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected String getName() {
        return this.name;
    }

    protected String getDescription() {
        return this.description;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}