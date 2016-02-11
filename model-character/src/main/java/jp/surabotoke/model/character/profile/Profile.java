package jp.surabotoke.model.character.profile;

import jp.surabotoke.model.character.profile.basicinformation.Name;

public class Profile {
	private Name name;
	
	public Profile(Name name) {
		this.name = name;
	}
	
    public Name getName() {
    	return name;
    };
}
