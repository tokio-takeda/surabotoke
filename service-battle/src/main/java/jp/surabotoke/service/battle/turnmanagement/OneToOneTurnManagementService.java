package jp.surabotoke.service.battle.turnmanagement;

import jp.surabotoke.model.battle.command.Inputted;
import jp.surabotoke.model.battle.facilitator.OneToOneFacilitator;
import jp.surabotoke.model.battlefield.BattleField;

public class OneToOneTurnManagementService implements TurnManagementService {
	private OneToOneFacilitator facilitator = callFacilitator();

	@Override
	public BattleField turn(BattleField battleField, Inputted inputted) {
		facilitator.proceed(battleField, inputted);
		return battleField;
	}

	@Override
	public OneToOneFacilitator callFacilitator() {
		return OneToOneFacilitator.getInstance();
	}

}
