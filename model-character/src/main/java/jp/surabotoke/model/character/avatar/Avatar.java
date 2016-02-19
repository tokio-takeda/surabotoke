package jp.surabotoke.model.character.avatar;

import jp.surabotoke.model.character.Chara;
import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.profile.Profile;
import jp.surabotoke.model.character.state.CharacterState;

public class Avatar implements Chara{
    private Profile profile;
    private Parameter parameter;

    private CharacterState currentState;

    public Avatar(Profile profile, Parameter parameter, CharacterState currentState) {
    	this.profile = profile;
    	this.parameter = parameter;
    	this.currentState = currentState;
    }
    
    public void injured(int damage) {
    	parameter.injured(damage);
    }
    
    @Override
    public Profile getProfile() {
        return profile;
    }

    @Override
    public Parameter getParameter() {
        return parameter;
    }

	@Override
	public CharacterState getCurrentState() {
		return currentState;
	}

	@Override
	public void setCurrentState(CharacterState currentState) {
		this.currentState = currentState;
	}

	@Override
	public String showCurrentState() {
		return currentState.getValue();
	}
}
