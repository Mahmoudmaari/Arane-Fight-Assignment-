package maari.mahmoud.arena_fighter_models;

public enum Swords {
	 NormalSword (3),
	 EpicSword (5),
		 RareSword (10),
	 LegendarySword(25);
	
	private Swords (int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	private int value;
}
