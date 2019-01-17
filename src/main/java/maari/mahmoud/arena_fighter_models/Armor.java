package maari.mahmoud.arena_fighter_models;

public enum Armor {
	NormalArmor(2),
	 EpicArmor(4),
	RareArmor (8),
	 LegendaryArmor(18);
	
	private Armor(int value) {
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
