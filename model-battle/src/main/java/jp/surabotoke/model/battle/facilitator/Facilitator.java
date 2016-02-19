package jp.surabotoke.model.battle.facilitator;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battlefield.BattleField;

public interface Facilitator {
	public void proceed(BattleField battleField, Inputted inputted);
}
