package jp.surabotoke.model.battlefield;

import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.avatar.AvatarFactory;
import jp.surabotoke.model.character.surabotoke.Surabotoke;
import jp.surabotoke.model.character.surabotoke.SurabotokeFactory;

public class OneToOneFactory implements BattleFieldFactory {
	private static final OneToOneFactory instance = new OneToOneFactory();
	
	private OneToOneFactory() {};
	
	public static OneToOneFactory getInstance() {
		return instance;
	}
	
	@Override
	public OneToOne create(String avatarName) {
		AvatarFactory avatarFactory = new AvatarFactory();
		Avatar avatar = avatarFactory.create(avatarName);
		
		SurabotokeFactory surabotokeFactory = new SurabotokeFactory();
		Surabotoke surabotoke = surabotokeFactory.create();
		return new OneToOne(avatar, surabotoke);
	}
}
