package dnd.charactersheet;

/**
 * AbilityScore class for managing and setting all of your character's abilties.
 * The primary purpose is storing the ability data.
 * Created by Corey on 7/23/2015.
 */
public class AbilityScores extends Character {
    // int storage of scores
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;

    // Getters and setters for scores
    protected int getStrength () {
        return Strength;
    }

    protected void setStrength(int strength) {
        Strength = strength;
    }

    protected int getDexterity() {
        return Dexterity;
    }

    protected void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    protected int getConstitution() {
        return Constitution;
    }

    protected void setConstitution(int constitution) {
        Constitution = constitution;
    }

    protected int getIntelligence() {
        return Intelligence;
    }

    protected void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    protected int getWisdom() {
        return Wisdom;
    }

    protected void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    protected int getCharisma() {
        return Charisma;
    }

    protected void setCharisma(int charisma) {
        Charisma = charisma;
    }

    // Getters for modifiers
    protected int getSTR() {
        return (Strength - 10) / 2;
    }

    protected int getDEX() {
        return (Dexterity - 10) / 2;
    }

    protected int getCON() {
        return (Constitution - 10) / 2;
    }

    protected int getINT() {
        return (Intelligence - 10) / 2;
    }

    protected int getWIS() {
        return (Wisdom - 10) / 2;
    }

    protected int getCHA() {
        return (Charisma - 10) / 2;
    }
}
