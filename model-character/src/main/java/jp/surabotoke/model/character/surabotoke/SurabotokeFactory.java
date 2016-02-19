package jp.surabotoke.model.character.surabotoke;

import jp.surabotoke.model.character.parameter.Parameter;
import jp.surabotoke.model.character.parameter.context.Context;
import jp.surabotoke.model.character.parameter.context.HitPoint;
import jp.surabotoke.model.character.parameter.context.Level;
import jp.surabotoke.model.character.parameter.physical.Agility;
import jp.surabotoke.model.character.parameter.physical.Luck;
import jp.surabotoke.model.character.parameter.physical.PhysicalAbility;
import jp.surabotoke.model.character.parameter.physical.Strength;
import jp.surabotoke.model.character.parameter.physical.Vitality;
import jp.surabotoke.model.character.profile.Profile;
import jp.surabotoke.model.character.profile.basicinformation.Name;
import jp.surabotoke.model.character.state.CharacterState;

public class SurabotokeFactory {
	public Surabotoke create() {
		Name name = new Name("スラ仏銅");
		Profile profile = new Profile(name);

		Level level = new Level(1);
		HitPoint hitPoint = new HitPoint(15, 15);
		Context context = new Context(level, hitPoint);

		Strength strength = new Strength(10);
		Agility agility = new Agility(new Double(10));
		Vitality vitality = new Vitality(10);
		Luck luck = new Luck(10);
		PhysicalAbility physicalAbility = new PhysicalAbility(strength, agility, vitality, luck);
		Parameter parameter = new Parameter(context, physicalAbility);
		
		return new Surabotoke(profile, parameter, CharacterState.FINE);
	}
}