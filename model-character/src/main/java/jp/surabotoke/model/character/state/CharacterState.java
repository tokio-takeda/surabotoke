package jp.surabotoke.model.character.state;

public enum CharacterState {
	FINE("すこぶる元気"),	
	DEFEATED("倒された");
	
	private String value;
	
	private CharacterState(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	};
}
