package jp.surabotoke.model.battlefield.onetoone;

import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.battlefield.state.FieldState;
import jp.surabotoke.model.character.Characters;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class OneToOne extends BattleField{
	private Characters characters;
	
	public OneToOne(Avatar avatar, Surabotoke surabotoke) {
		characters = new Characters();
		characters.add(avatar);
		characters.add(surabotoke);
		characters.sort();
		
		super.setState(FieldState.IN_BATTLE);
	}
}
