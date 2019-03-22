package maari.mahmoud.arena_fighter_models;



public class BotCharacter {
	
	private String botname;
	private int botstrength;
	private int botHP;
	private boolean alive = true;
	



	public BotCharacter(String botname, int botstringes, int botHP, boolean alive) {
		super();
		this.botname = botname;
		this.botstrength = botstringes;
		this.botHP = botHP;
		this.alive = alive;
	}

	public BotCharacter() {
		super();
	}

	public int getBotstringes() {
		return botstrength;
	}

	public void setBotstringes(int botstringes) {
		this.botstrength = botstringes;
	}

	public int getBotHP() {
		return botHP;
	}

	public int setBotHP(int botHP) {
		return this.botHP = botHP;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getBotname() {
		return botname;
	}

	public void setBotname(String botname) {
		this.botname = botname;
	}


}