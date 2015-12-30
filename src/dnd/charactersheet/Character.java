package dnd.charactersheet;

/**
 * Character class for D&D. Contains all of the different parts found on a D&D character sheet.
 * The primary purpose being to store data.
 * Created by Corey on 7/22/2015.
 */
public class Character {

    /**
     * Variables
     */
    // Info
    private String name;
    private String Class;
    private int level;
    private String race;
    private String background;
    private String alignment;
    private String playerName;
    private int experiencePoints;

    private AbilityScores abilityScores;

    // Proficiency, saving throws, skills
    private int proficiencyBonus;

    private SavingThrows savingThrows;
    private Skills skills;

    private int armorClass;
    private int speed;
    private int maxHP;
    private int currentHP;
    private String hitDice;

    private Characteristics characteristics;

    private Attacks attacks;
    private Features features;

    private Proficiencies proficiencies;

    private Wallet money;
    private Inventory equipment;

    private Appearance appearance;

    private String backstory;
    private Inventory treasure;

    private String spellcastingAbility;
    private int spellSaveDC;
    private int spellAttackBonus;

    private Spellbook spells;

    public Character() {

    }

    /**
     * Setters and getters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return Class;
    }

    public void setCharacterClass(String aClass) {
        Class = aClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public AbilityScores getAbilityScores() {
        return abilityScores;
    }

    public void setAbilityScores(AbilityScores abilityScores) {
        this.abilityScores = abilityScores;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public SavingThrows getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(SavingThrows savingThrows) {
        this.savingThrows = savingThrows;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    // TODO finish when we have attributes
    public int getInitiative() {
        return 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Attacks getAttacks() {
        return attacks;
    }

    public void setAttacks(Attacks attacks) {
        this.attacks = attacks;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Proficiencies getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Proficiencies proficiencies) {
        this.proficiencies = proficiencies;
    }

    public Wallet getMoney() {
        return money;
    }

    public void setMoney(Wallet money) {
        this.money = money;
    }

    public Inventory getEquipment() {
        return equipment;
    }

    public void setEquipment(Inventory equipment) {
        this.equipment = equipment;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public Inventory getTreasure() {
        return treasure;
    }

    public void setTreasure(Inventory treasure) {
        this.treasure = treasure;
    }

    public String getSpellcastingAbility() {
        return spellcastingAbility;
    }

    public void setSpellcastingAbility(String spellcastingAbility) {
        this.spellcastingAbility = spellcastingAbility;
    }

    public int getSpellSaveDC() {
        return spellSaveDC;
    }

    public void setSpellSaveDC(int spellSaveDC) {
        this.spellSaveDC = spellSaveDC;
    }

    public int getSpellAttackBonus() {
        return spellAttackBonus;
    }

    public void setSpellAttackBonus(int spellAttackBonus) {
        this.spellAttackBonus = spellAttackBonus;
    }

    public Spellbook getSpells() {
        return spells;
    }

    public void setSpells(Spellbook spells) {
        this.spells = spells;
    }
}
