package jp.surabotoke.model.character.parameter;

import jp.surabotoke.model.character.parameter.physical.Agility;
import jp.surabotoke.model.character.parameter.physical.Luck;
import jp.surabotoke.model.character.parameter.physical.Strength;
import jp.surabotoke.model.character.parameter.physical.Vitality;

public class Parameter {
    private Strength strength;
    private Agility agility;
    private Vitality vitality;
    private Luck luck;
    
    public Parameter(Strength strength, Agility agility, Vitality vitality, Luck luck) {
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
