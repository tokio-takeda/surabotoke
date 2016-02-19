package jp.surabotoke.service.battle.turnmanagement;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battle.facilitator.Facilitator;
import jp.surabotoke.model.battlefield.BattleField;

public interface TurnManagementService {
	public BattleField turn(BattleField battleField, Inputted inputted);
	
	abstract Facilitator callFacilitator();
}
