package maari.mahmoud.arena_fighter;

public class Play_again {
	public static boolean playAgain(String answer) {
		String upperCaseString = answer.toUpperCase();
		switch(upperCaseString) {
		case "Y":
			return true;
		default:
			System.out.println(" @_@ Good bye @_@ ");
			return false;
		}

}
}