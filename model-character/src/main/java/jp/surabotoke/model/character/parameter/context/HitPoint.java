package jp.surabotoke.model.character.parameter.context;

public class HitPoint {
    private int max;
    private int current;
    
    public HitPoint(int max, int current) {
        this.max = max;
        this.current = current;
    }

    public int getMax() {
        return max;
    }

    public int getCurrent() {
        return current;
    }
    
    public void damage(int damageValue) {
        
    }
}
