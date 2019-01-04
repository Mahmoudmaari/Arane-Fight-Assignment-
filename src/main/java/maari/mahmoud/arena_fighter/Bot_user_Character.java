package maari.mahmoud.arena_fighter;



public class Bot_user_Character {
	private  String playername=null;
	private String botname=null;

	

	public Bot_user_Character(String playername, String botname) {
		super();
		this.playername = playername;
		this.botname = botname;
	}

	public String getBotname() {
		return botname;
	}

	public void setBotname(String botname) {
		this.botname = botname;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	
}