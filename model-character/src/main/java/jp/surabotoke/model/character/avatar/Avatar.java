package jp.surabotoke.model.character.avatar;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.profile.Profile;

public class Avatar {
    private Profile profile;
    private Parameter parameter;

    public Avatar(Profile profile, Parameter parameter) {
    	this.profile = profile;
    	this.parameter = parameter;
    }
    
    public Profile getProfile() {
        return profile;
    }

    public Parameter parameter() {
        return parameter;
    }

    public String getCurrentState() {
    	String currentState = new String();
    	
    	currentState = "元気な状態";
    	
    	return currentState;
    }
}
