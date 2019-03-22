package maari.mahmoud.arena_fighter.models;

public class UserCharacter {

	
	private String Username;
	private int UserStrength;
	private int UserHP;
	private boolean alive= true;
	
	
	
	
	
	
	
	public UserCharacter(String username, int userStringes, int userHP, boolean alive) {
		super();
		Username = username;
		UserStrength = userStringes;
		UserHP = userHP;
		this.alive = alive;
	}
	public UserCharacter() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getUserStringes() {
		return UserStrength;
	}
	public void setUserStringes(int userStringes) {
		UserStrength = userStringes;
	}
	public int getUserHP() {
		return UserHP;
	}
	public int setUserHP(int userHP) {
		return UserHP = userHP;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}
