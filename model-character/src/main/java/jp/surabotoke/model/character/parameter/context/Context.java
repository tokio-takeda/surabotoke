package jp.surabotoke.model.character.parameter.context;

public class Context {
	private Level level;
	private HitPoint hitPoint;
	
	public Context(Level level, HitPoint hitPoint) {
		this.level = level;
		this.hitPoint = hitPoint;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public HitPoint getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(HitPoint hitPoint) {
		this.hitPoint = hitPoint;
	}
	
	public void injured(int damage) {
		hitPoint.injured(damage);
	}
}
