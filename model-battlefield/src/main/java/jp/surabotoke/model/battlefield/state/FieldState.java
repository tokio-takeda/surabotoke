package jp.surabotoke.model.battlefield.state;

public enum FieldState {
	IN_BATTLE("戦闘中"),
	DEFEAT("スラ仏を倒した"),
	DEFEATED("スラ仏に倒された");
	
	private String value;
	
	private FieldState(String state) {
		value = state;
	}
	
	public String getValue() {
		return value;
	}
}
