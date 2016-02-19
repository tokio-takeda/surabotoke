package jp.surabotoke.model.battle.facilitator;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.battlefield.onetoone.OneToOne;
import jp.surabotoke.model.battlefield.state.FieldState;
import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.Characters;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.state.CharacterStateJudge;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class OneToOneFacilitator implements Facilitator {
	private static final OneToOneFacilitator instance = new OneToOneFacilitator(); 
	
	private OneToOneFacilitator() {};
	
	public static OneToOneFacilitator getInstance() {
		return instance;
	}
	
	@Override
	public void proceed(BattleField battleField, Inputted inputted) {
		OneToOne oneToOne = (OneToOne) battleField;

		doFirst(oneToOne, inputted);
		doSecond(oneToOne, inputted);
	}

	private void doFirst(OneToOne oneToOne, Inputted inputted) {
		Characters characters = oneToOne.getCharacters();
		Chara actor = characters.get(0);
		inputted.execute(actor, oneToOne);
		judge(oneToOne);
	}
	
	private void doSecond(OneToOne oneToOne, Inputted inputted) {
		Characters characters = oneToOne.getCharacters();
		Chara actor = characters.get(0);
		inputted.execute(actor, oneToOne);
		judge(oneToOne);
	}
	
	private void judge(OneToOne oneToOne) {
		CharacterStateJudge judge = CharacterStateJudge.getInstance();
		
		Characters characters = oneToOne.getCharacters();
		Avatar avatar = characters.getAvatar();
		
		if(!judge.isStillAlive(avatar)) {
			oneToOne.setState(FieldState.DEFEATED);
			return;
		}
		
		Surabotoke surabotoke = characters.getSurabotoke();
		
		if(!judge.isStillAlive(surabotoke)) {
			oneToOne.setState(FieldState.DEFEAT);
		}
	}
	
}
