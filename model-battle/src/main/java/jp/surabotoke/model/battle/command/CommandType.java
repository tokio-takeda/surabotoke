package jp.surabotoke.model.battle.command;

import jp.surabotoke.model.battle.strategy.AttackStrategy;
import jp.surabotoke.model.battlefield.BattleField;
import jp.surabotoke.model.character.Chara;

public enum CommandType {
	ATTACK("攻撃"){
		@Override
		public void execute(Chara actor, BattleField battleField, Inputted inputted) {
			AttackStrategy strategy = AttackStrategy.getInstance();
			strategy.action(actor, battleField, inputted);
		}
	},
	RUN("逃げる") {
		@Override
		public void execute(Chara actor, BattleField battleField, Inputted inputted) {
			// TODO 自動生成されたメソッド・スタブ
		}
	};
	
	private String typeName;
	
	public abstract void execute(Chara actor, BattleField battleField, Inputted inputted); 
	
	private CommandType(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}
}
