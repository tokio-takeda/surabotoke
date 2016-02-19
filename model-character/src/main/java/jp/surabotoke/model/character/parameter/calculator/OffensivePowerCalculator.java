package jp.surabotoke.model.character.parameter.calculator;

import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.parameter.physical.PhysicalAbility;
import jp.surabotoke.model.character.parameter.physical.Strength;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class OffensivePowerCalculator {
	public static int calculate(Avatar avatar) {
		Integer strength = getStrength(avatar);
		
		Integer power = new Integer(strength);
		
		return power;
	}
	
	public static int calculate(Surabotoke surabotoke) {
		Integer strength = getStrength(surabotoke);
		
		Integer power = new Integer(strength);
		
		return power;
	}
	
	private static Integer getStrength(Chara character) {
		Parameter parameter = character.getParameter();
		PhysicalAbility physicalAbility = parameter.getPhysicalAbility();
		Strength strength = physicalAbility.getStrength();
		return strength.getValue();
	}
}
