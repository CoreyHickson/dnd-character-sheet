package dnd.charactersheet;

/**
 * The saving throws of a character
 * Created by Corey on 7/23/2015.
 */
public class SavingThrows extends Character {

    protected int strSavingThrow() {
        if(super.getProficiencies().contains("Strength")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getSTR();
        }
        else {
            return super.getAbilityScores().getSTR();
        }
    }

    protected int dexSavingThrow() {
        if(super.getProficiencies().contains("Dexterity")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getDEX();
        }
        else {
            return super.getAbilityScores().getDEX();
        }
    }

    protected int conSavingThrow() {
        if(super.getProficiencies().contains("Constitution")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getCON();
        }
        else {
            return super.getAbilityScores().getCON();
        }
    }

    protected int intSavingThrow() {
        if(super.getProficiencies().contains("Intelligence")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getINT();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int wisSavingThrow() {
        if(super.getProficiencies().contains("Wisdom")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getWIS();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }

    protected int chaSavingThrow() {
        if(super.getProficiencies().contains("Charisma")) {
            return super.getProficiencyBonus() + super.getAbilityScores().getCHA();
        }
        else {
            return super.getAbilityScores().getCHA();
        }
    }
}
