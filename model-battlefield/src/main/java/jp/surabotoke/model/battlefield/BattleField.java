package jp.surabotoke.model.battlefield;

import jp.surabotoke.model.battlefield.state.FieldState;
import jp.surabotoke.model.character.Characters;

public abstract class BattleField {
	private FieldState state;
	private Characters characters;
	
	public void setState(FieldState state) {
		this.state = state;
	}
	
	public FieldState getState() {
		return state;
	}
	
	public Characters getCharacters() {
		return characters;
	}
	
	public String showCurrentState(){
		return state.getValue();
	};
}
