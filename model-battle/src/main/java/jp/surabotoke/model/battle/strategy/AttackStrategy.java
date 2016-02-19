package jp.surabotoke.model.battle.strategy;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.Characters;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.parameter.calculator.DefensePowerCalculator;
import jp.surabotoke.model.character.parameter.calculator.OffensivePowerCalculator;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class AttackStrategy implements Strategy{
	private static final AttackStrategy instance = new AttackStrategy();
	
	private AttackStrategy() {};

	public static AttackStrategy getInstance() {
		return instance;
	}
	
	@Override
	public void action(Chara actor, BattleField battleField, Inputted inputted) {
		if(actor instanceof Avatar) {
			Surabotoke target = getTargetAsSurabotoke(battleField);
			attackByAvatar((Avatar) actor, target);
		}
		
		Avatar target = getTargetAsAvatar(battleField);
		attackBySurabotoke((Surabotoke) actor, target);
	}

	private Avatar getTargetAsAvatar(BattleField battleField) {
		Characters characters = battleField.getCharacters();
		return characters.getAvatar();
	}

	private Surabotoke getTargetAsSurabotoke(BattleField battleField) {
		Characters characters = battleField.getCharacters();
		return characters.getSurabotoke();
	}

	private void attackByAvatar(Avatar actor, Surabotoke target) {
		int offensivePower = OffensivePowerCalculator.calculate(actor);
		int defensePower = DefensePowerCalculator.calculate(target);
		
		int damage = offensivePower - defensePower;
		if(damage <= 0) {
			damage = 1;
		}
		
		target.injured(damage);
	}
	
	private void attackBySurabotoke(Surabotoke actor, Avatar target) {
		int offensivePower = OffensivePowerCalculator.calculate(actor);
		int defensePower = DefensePowerCalculator.calculate(target);
		
		int damage = offensivePower - defensePower;
		if(damage <= 0) {
			damage = 1;
		}
		
		target.injured(damage);
	}
}
