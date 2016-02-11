package jp.surabotoke.model.battlefield;

import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class OneToOne extends BattleField{
	private Avatar avatar;
	private Surabotoke surabotoke;
	
	public OneToOne(Avatar avatar, Surabotoke surabotoke) {
		this.avatar = avatar;
		this.surabotoke = surabotoke;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public Surabotoke getSurabotoke() {
		return surabotoke;
	}

	@Override
	public String showCurrentState() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
}
