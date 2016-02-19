package jp.surabotoke.model.battle.command;

import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.character.Chara;

public class Commands {
	private CommandType commandType;
	
	public Commands(String command) {
		commandType = CommandType.valueOf(command);
	}
	
	protected void execute(Chara actor, BattleField battleField, Inputted inputted) {
		commandType.execute(actor, battleField, inputted);
	}
}
