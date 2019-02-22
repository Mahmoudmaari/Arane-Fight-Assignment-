package maari.mahmoud.arena_fighter.dao;

import java.util.Scanner;

import maari.mahmoud.RNG.RNG1;
import maari.mahmoud.arena_fighter.Add_To_Array;
import maari.mahmoud.arena_fighter.Bot_user_Character;
import maari.mahmoud.arena_fighter.Play_again;
import maari.mahmoud.arena_fighter.Random_Names;
import maari.mahmoud.arena_fighter_models.Shop;

public class BattleAndRound {
	static Scanner buy = new Scanner(System.in);

	static Shop m = new Shop();

	
	public void Attak() {
		int result[] = new int[0];
		int result1[] = new int[0];
		int Bhealth = 50;
		int Uhealth = 50, winpoint = 0, newUpower;
		boolean alive = true, again = false, winattack = false;

		String[] name = { "Stan", "Teo", "George", "Rasvan", "Virgil", "Gabriel" };
		String[] lastname = { "Marandici", "Minea", "Urzica", "Alecsandri", "Groza", "Eliade" };

		System.out.println("Put your username");
		String Pname = getInput();
		RNG1 attack = RNG1.getinstance();
		int roundnum = 1;

		Bot_user_Character botAplayer = new Bot_user_Character(Pname, Random_Names.getRName(name, lastname));

		while (alive) {
			int Bpower = attack.RNG(1, 3);
			int Upower = attack.RNG(1, 10);
			if (alive = true) {

				String play = buy.nextLine();
				switch (play) {
				case "1":

					break;
				case "2":
					Upower = m.sword(Upower, Bpower);
					Bpower = m.powerpuls(Bpower, Upower);
					break;
				case "3":
					Uhealth = m.armor(Uhealth, Bhealth);
					break;
				case "0":

					break;

				default:
					System.out.println("not valid nubmer");
				}
			}
			do {

				System.out.println("Round number is : " + roundnum);
				System.out.println(botAplayer.getPlayername() + " Health : " + Uhealth + "   " + botAplayer.getBotname()
						+ " Health : " + Bhealth);
				System.out.println();
				System.out.println(botAplayer.getPlayername() + " Attak : " + Upower + "   " + botAplayer.getBotname()
						+ " Attak : " + Bpower);
				System.out.println();
				System.out.println("************************************");
				// Is the calcoltion to the bot and the player.
				result = Add_To_Array.AddTooAarray(result, Uhealth -= Bpower);
				result1 = Add_To_Array.AddTooAarray(result1, Bhealth -= Upower);
				// End when Upower <= Bhealth and Bhealth >= 0
				if (Upower <= Bhealth && Bhealth >= 0) {

					System.out.println();
					winattack = false;
					alive = true;
					again = false;
				}
				// to avoid making user health maines if the user wins
				if (Bhealth <= 0) {
					int nr = roundnum;
					Uhealth += Bpower;
					System.out.println();
					System.out.println("Round number is : " + (nr + 1));
					System.out.println();
					System.out.println(botAplayer.getPlayername() + " Health : " + Uhealth + "   "
							+ botAplayer.getBotname() + " Health : " + Bhealth);
					System.out.println();
					System.out.println("==========You Win==========");

					winpoint += attack.RNG(50, 150);
					m.setWinpoint(winpoint);
					System.out.println(winpoint);
					alive = false;
					again = true;
					winattack = true;

				}
				if (winattack == true) {

					alive = false;
					again = true;
				}

				if (Uhealth <= 0) {
					System.out.println("-_-_-_-_-_-You Lost-_-_-_-_-_-");
					System.out.println();
					alive = false;
					again = true;
				}

				roundnum++;

			} while (!again);

			Uhealth = 10;
			Bhealth = 10;
			roundnum = 1;
			result = new int[0];
			result1 = new int[0];
			botAplayer.setBotname(Random_Names.getRName(name, lastname));
			System.out.println("If you want to play again press (y) To retire press any key");

			String answer = getInput();
			alive = Play_again.playAgain(answer);

		}
	}

	private static Scanner in = new Scanner(System.in);

	public static String getInput() {
		return in.nextLine();

	}
	}


