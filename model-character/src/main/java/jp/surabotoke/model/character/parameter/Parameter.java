package jp.surabotoke.model.character.parameter;

import jp.surabotoke.model.character.parameter.context.Context;
import jp.surabotoke.model.character.parameter.physical.PhysicalAbility;

public class Parameter {
	private Context context;
	private PhysicalAbility physicalAbility;
	
	public Parameter(Context context, PhysicalAbility physicalAbility) {
		this.context = context;
		this.physicalAbility = physicalAbility;
	}

	public void injured(int damage) {
		context.injured(damage);
	}
	
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public PhysicalAbility getPhysicalAbility() {
		return physicalAbility;
	}

	public void setPhysicalAbility(PhysicalAbility physicalAbility) {
		this.physicalAbility = physicalAbility;
	}
	
}
