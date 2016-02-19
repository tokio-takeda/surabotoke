package jp.surabotoke.model.character;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.profile.Profile;
import jp.surabotoke.model.character.state.CharacterState;

public interface Chara{
	public Profile getProfile();
	public Parameter getParameter();

	public void setCurrentState(CharacterState currentState);	
	public CharacterState getCurrentState();
	
	public String showCurrentState();
}
