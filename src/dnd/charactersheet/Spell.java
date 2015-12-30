package dnd.charactersheet;

/**
 * Created by Corey on 7/25/2015.
 */
public class Spell {
    private String name;
    private int level;
    private String school;
    private String castTime;
    private String range;
    private boolean verbal;
    private boolean somantic;
    private boolean material;
    private String duration;
    private String description;
    private String atHigherLevel;
    private boolean concentration;
    private boolean ritual;

    public Spell(String name, int level, String school, String castTime, String range, boolean verbal, boolean somantic, boolean material, String duration, String description, String atHigherLevel, boolean concentration, boolean ritual) {
        this.name = name;
        this.level = level;
        this.school = school;
        this.castTime = castTime;
        this.range = range;
        this.verbal = verbal;
        this.somantic = somantic;
        this.material = material;
        this.duration = duration;
        this.description = description;
        this.atHigherLevel = atHigherLevel;
        this.concentration = concentration;
        this.ritual = ritual;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getSchool() {
        return school;
    }

    public String getCastTime() {
        return castTime;
    }

    public String getRange() {
        return range;
    }

    public boolean isVerbal() {
        return verbal;
    }

    public boolean isSomantic() {
        return somantic;
    }

    public boolean isMaterial() {
        return material;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public String getAtHigherLevel() {
        return atHigherLevel;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public boolean isRitual() {
        return ritual;
    }
}
