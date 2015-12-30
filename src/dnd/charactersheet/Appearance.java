package dnd.charactersheet;

/**
 * Contains all of the different attributes of how a character looks.
 * Created by Corey on 7/23/2015.
 */
public class Appearance extends Character {
    private String age;
    private String height;
    private String weight;
    private String eyes;
    private String skin;
    private String hair;

    protected String getAge() {
        return age;
    }
    protected void setAge(String age) {
        this.age = age;
    }

    protected String getHeight() {
        return height;
    }

    protected void setHeight(String height) {
        this.height = height;
    }

    protected String getWeight() {
        return weight;
    }

    protected void setWeight(String weight) {
        this.weight = weight;
    }

    protected String getEyes() {
        return eyes;
    }

    protected void setEyes(String eyes) {
        this.eyes = eyes;
    }

    protected String getSkin() {
        return skin;
    }

    protected void setSkin(String skin) {
        this.skin = skin;
    }

    protected String getHair() {
        return hair;
    }

    protected void setHair(String hair) {
        this.hair = hair;
    }
}
