package jp.surabotoke.model.character.avatar;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.profile.Profile;

public interface Avatar {
    public Profile getProfile();
    
    public Parameter parameter();
}
