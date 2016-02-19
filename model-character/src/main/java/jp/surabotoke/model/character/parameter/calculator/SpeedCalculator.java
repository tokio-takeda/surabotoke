package jp.surabotoke.model.character.parameter.calculator;

import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.parameter.physical.Agility;
import jp.surabotoke.model.character.parameter.physical.PhysicalAbility;

public class SpeedCalculator {
	public static double calculate(Chara character) {
		Double speed = new Double(0);
		
		speed = getAgility(character);
			
		return speed;
	}
	
	private static double getAgility(Chara character) {
		Parameter parameter = character.getParameter();
		PhysicalAbility physicalAbility = parameter.getPhysicalAbility();
		Agility agility = physicalAbility.getAgility();
		return agility.getValue();
	}
}
