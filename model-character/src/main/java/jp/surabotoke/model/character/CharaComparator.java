package jp.surabotoke.model.character;

import java.util.Comparator;

import jp.surabotoke.model.character.parameter.calculator.SpeedCalculator;

public class CharaComparator implements Comparator<Chara> {

	@Override
	public int compare(Chara o1, Chara o2) {
		double speed1 = SpeedCalculator.calculate(o1);
		double speed2 = SpeedCalculator.calculate(o2);
		return speed1 < speed2 ? -1 : 1;
	}
}
