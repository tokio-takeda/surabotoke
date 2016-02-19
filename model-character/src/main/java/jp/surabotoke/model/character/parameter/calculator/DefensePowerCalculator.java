package jp.surabotoke.model.character.parameter.calculator;

import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.parameter.physical.PhysicalAbility;
import jp.surabotoke.model.character.parameter.physical.Vitality;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class DefensePowerCalculator {
	public static int calculate(Avatar avatar) {
		Integer vitality = getVitality(avatar);
		
		Integer power = new Integer(vitality);
		
		return power;
	}
	
	public static int calculate(Surabotoke surabotoke) {
		Integer vitality = getVitality(surabotoke);
		
		Integer power = new Integer(vitality);
		
		return power;
	}
	
	private static Integer getVitality(Chara character) {
		Parameter parameter = character.getParameter();
		PhysicalAbility physicalAbility = parameter.getPhysicalAbility();
		Vitality vitality = physicalAbility.getVitality();
		return vitality.getValue();
	}
}
