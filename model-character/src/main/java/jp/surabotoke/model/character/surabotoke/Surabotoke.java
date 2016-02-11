package jp.surabotoke.model.character.surabotoke;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.profile.Profile;

public class Surabotoke {
    private Profile profile;
    private Parameter parameter;

    public Surabotoke(Profile profile, Parameter parameter) {
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
    	
    	currentState = "普通の状態";
    	
    	return currentState;
    }
}
