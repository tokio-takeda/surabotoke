package jp.surabotoke.service.battle.createfield;

import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.battlefield.onetoone.OneToOneFactory;

public class CreateOneToOneFieldService implements CreateFieldService {

	@Override
	public BattleField createField(String avatarName) {
		OneToOneFactory oneToOneFactory = OneToOneFactory.getInstance();
		return oneToOneFactory.create(avatarName);
	}
	
}
