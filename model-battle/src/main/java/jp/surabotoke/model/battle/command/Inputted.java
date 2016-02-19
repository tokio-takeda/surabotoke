package jp.surabotoke.model.battle.command;

import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.character.Chara;

public class Inputted {
	private String[] textArray;
	
	public Inputted(String text) {
		this.textArray = text.split(" ");
	}
	
	public void execute(Chara actor, BattleField battleField) {
		Commands commands = new Commands(getCommand());
		commands.execute(actor, battleField, this);
	}
	
	public String get(int index) {
		return textArray[index];
	}
	
	private String getCommand() {
		return textArray[0];
	}
}
