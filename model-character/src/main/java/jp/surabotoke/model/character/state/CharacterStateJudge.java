package jp.surabotoke.model.character.state;

import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.parameter.context.Context;
import jp.surabotoke.model.character.parameter.context.HitPoint;

public class CharacterStateJudge {
	private static final CharacterStateJudge instance = new CharacterStateJudge();
	
	private CharacterStateJudge() {};
	
	public static CharacterStateJudge getInstance() {
		return instance;
	}
	
	public boolean isStillAlive(Chara character) {
		int currentHitPoint = getCurrentHitPoint(character);
		if(currentHitPoint <= 0) {
			character.setCurrentState(CharacterState.DEFEATED);
			return false;
		}
		character.setCurrentState(CharacterState.FINE);
		return true;
	}

	private int getCurrentHitPoint(Chara character) {
		Parameter parameter = character.getParameter();
		Context context = parameter.getContext();
		HitPoint hitPoint = context.getHitPoint();
		return hitPoint.getCurrent();
	}
}
