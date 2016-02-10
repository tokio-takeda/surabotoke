package jp.surabotoke.model.character.avatar.job;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.profile.Profile;

public class Novice implements Avatar{
    private Profile profile;
    private Parameter parameter;

    @Override
    public Profile getProfile() {
        return profile;
    }

    @Override
    public Parameter parameter() {
        return parameter;
    }

}
