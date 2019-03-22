package maari.mahmoud.arena_fighter.dao;

import java.util.Scanner;

import maari.mahmoud.RNG.RNG1;
import maari.mahmoud.arena_fighter.Play_again;
import maari.mahmoud.arena_fighter.Random_Names;
import maari.mahmoud.arena_fighter_models.BotCharacter;
import maari.mahmoud.arena_fighter_models.UserCharacter;

public class Round {
	Scanner in = new Scanner(System.in);
	String[] name = { "Stan", "Teo", "George", "Rasvan", "Virgil", "Gabriel" };
	String[] lastname = { "Marandici", "Minea", "Urzica", "Alecsandri", "Groza", "Eliade" };

	RNG1 r = RNG1.getinstance();
	Battle battle = new Battle();

	public void Dice() {
		BotCharacter bot = new BotCharacter(botname(name, lastname), 10, 100, true);
		UserCharacter user = new UserCharacter(in.nextLine(), 10, 100, true);
		boolean run = true, again = false;
		int battelRound = 1;
		while (run) {
			do {
				System.out.println("Round " + battelRound+"\n");
				battelRound++;
				int dice = r.RNG(0, 10);
				again = battle.BattleWin(user.getUsername(), user.getUserHP(), bot.getBotname(), bot.getBotHP());
				if (again == false) {
					if (dice < 5) {
						bot.setBotHP(UserAttack(user.getUserStringes(), bot.getBotHP()));
						System.out.println("You Attack.....");
					} else {
						user.setUserHP(BotAttack(bot.getBotstringes(), user.getUserHP()));
						System.out.println("Bot Attack.....");

					}
				}
			} while (!again);
			String[] name = { "Stan", "Teo", "George", "Rasvan", "Virgil", "Gabriel" };
			String[] lastname = { "Marandici", "Minea", "Urzica", "Alecsandri", "Groza", "Eliade" };
			bot.setBotname(Random_Names.getRName(name, lastname));
			bot.setBotHP(100);
			user.setUserHP(100);
			battelRound=1;
			System.out.println("If you want to play again press (y) To retire press any key");

			String answer = in.nextLine();
			run = Play_again.playAgain(answer);

		}
	}

	public int UserAttack(int userpower, int botHP) {
		return botHP - userpower;
	}

	public int BotAttack(int botpower, int userHP) {
		return userHP - botpower;
	}

	public String botname(String[] name, String[] lastname) {
		return Random_Names.getRName(name, lastname);
	}
}
