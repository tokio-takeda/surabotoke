package jp.surabotoke.model.character.profile.basicinformation;

public class Name {
    private String value;
    
    public Name(String value) {
        this.setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
