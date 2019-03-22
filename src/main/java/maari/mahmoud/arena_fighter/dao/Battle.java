package maari.mahmoud.arena_fighter.dao;

public class Battle {
 
	public boolean BattleWin(String username, int userHP, String botname, int botHP) {
		
		

		System.out.println(username + " HP = " + userHP + "\t\t\t" + botname + " HP =" + botHP+"\n");
		if (userHP == 0) {

			System.out.println(username+" lost VS "+botname+"\n");
			return true;
		} else {
			
			
		}
		if (botHP == 0) {

			System.out.println(username+" win VS " +botname+"\n");
			return true;
		} else {
			
			return false;
		}

	}

}
