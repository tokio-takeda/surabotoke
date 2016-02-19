package jp.surabotoke.model.battle.strategy;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.character.Chara;

public interface Strategy {
	public void action(Chara actor, BattleField battleField, Inputted inputted);
}
