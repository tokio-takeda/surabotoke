package jp.surabotoke.model.character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.surabotoke.model.character.avatar.Avatar;
import jp.surabotoke.model.character.surabotoke.Surabotoke;

public class Characters {
	private List<Chara> characters;
	
	public Characters() {
		characters = new ArrayList<>();
	}
	
	public Chara getAtRandom() {
		return characters.get(0);
	}
	
	public Characters getAvatars() {
		Characters avatars = new Characters();
		for(Chara character : characters) {
			avatars.addIfAvatar(character);
		}
		return avatars;
	}
	
	public Avatar getAvatar() {
		Characters avatars = getAvatars();
		return (Avatar) avatars.getAtRandom();
	}
	
	public Characters getSurabotokes() {
		Characters surabotokes = new Characters();
		for(Chara character : characters) {
			surabotokes.addIfSurabotoke(character);
		}
		return surabotokes;
	}
	
	public Surabotoke getSurabotoke() {
		Characters surabotokes = getSurabotokes();
		return (Surabotoke) surabotokes.getAtRandom();
	}
	
	public void add(Chara character) {
		characters.add(character);
	}
	
	private void addIfAvatar(Chara character) {
		if(character instanceof Avatar) {
			characters.add(character);
		}
	}
	
	private void addIfSurabotoke(Chara character) {
		if(character instanceof Surabotoke) {
			characters.add(character);
		}
	}
	
	public Chara get(int index) {
		return characters.get(index);
	}
	
	public void sort() {
		Collections.sort(characters, new CharaComparator());
	}
}
