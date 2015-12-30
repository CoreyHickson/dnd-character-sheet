package dnd.charactersheet;

/**
 * A way to get the modifers for certain skills
 * Created by Corey on 7/23/2015.
 */
public class Skills extends Character {

    protected int getAcrobatics() {
        if(super.getProficiencies().contains("Acrobatics")) {
            return super.getAbilityScores().getDEX() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getDEX();
        }
    }

    protected int getAnimalHandling() {
        if(super.getProficiencies().contains("Animal Handling")) {
            return super.getAbilityScores().getWIS() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }

    protected int getArcana() {
        if(super.getProficiencies().contains("Arcana")) {
            return super.getAbilityScores().getINT() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int getAthletics() {
        if(super.getProficiencies().contains("Athletics")) {
            return super.getAbilityScores().getSTR() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getSTR();
        }
    }

    protected int getDeception() {
        if(super.getProficiencies().contains("Deception")) {
            return super.getAbilityScores().getCHA() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getCHA();
        }
    }

    protected int getHistory() {
        if(super.getProficiencies().contains("History")) {
            return super.getAbilityScores().getINT() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int getInsight() {
        if(super.getProficiencies().contains("Insight")) {
            return super.getAbilityScores().getWIS() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }

    protected int getIntimidation() {
        if(super.getProficiencies().contains("Intimidation")) {
            return super.getAbilityScores().getCHA() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getCHA();
        }
    }

    protected int getInvestigation() {
        if(super.getProficiencies().contains("Investigation")) {
            return super.getAbilityScores().getINT() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int getMedicine() {
        if(super.getProficiencies().contains("Medicine")) {
            return super.getAbilityScores().getWIS() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }

    protected int getNature() {
        if(super.getProficiencies().contains("Nature")) {
            return super.getAbilityScores().getINT() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int getPerception() {
        if(super.getProficiencies().contains("Perception")) {
            return super.getAbilityScores().getWIS() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }

    protected int getPerformance() {
        if(super.getProficiencies().contains("Performance")) {
            return super.getAbilityScores().getCHA() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getCHA();
        }
    }

    protected int getPersuasion() {
        if(super.getProficiencies().contains("Persuasion")) {
            return super.getAbilityScores().getCHA() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getCHA();
        }
    }

    protected int getReligion() {
        if(super.getProficiencies().contains("Religion")) {
            return super.getAbilityScores().getINT() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getINT();
        }
    }

    protected int getSleightOfHand() {
        if(super.getProficiencies().contains("Sleight of Hand")) {
            return super.getAbilityScores().getDEX() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getDEX();
        }
    }

    protected int getStealth() {
        if(super.getProficiencies().contains("Stealth")) {
            return super.getAbilityScores().getDEX() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getDEX();
        }
    }

    protected int getSurvival() {
        if(super.getProficiencies().contains("Survival")) {
            return super.getAbilityScores().getWIS() + super.getProficiencyBonus();
        }
        else {
            return super.getAbilityScores().getWIS();
        }
    }
}
