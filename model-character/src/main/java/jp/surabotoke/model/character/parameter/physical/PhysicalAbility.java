package jp.surabotoke.model.character.parameter.physical;

public class PhysicalAbility {
    private Strength strength;
    private Agility agility;
    private Vitality vitality;
    private Luck luck;
    
    public PhysicalAbility(Strength strength, Agility agility, Vitality vitality, Luck luck) {
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
        this.luck = luck;
    }

    public Strength getStrength() {
        return strength;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public Agility getAgility() {
        return agility;
    }

    public void setAgility(Agility agility) {
        this.agility = agility;
    }

    public Vitality getVitality() {
        return vitality;
    }

    public void setVitality(Vitality vitality) {
        this.vitality = vitality;
    }

    public Luck getLuck() {
        return luck;
    }

    public void setLuck(Luck luck) {
        this.luck = luck;
    }
}
