package maari.mahmoud.arena_fighter;


import java.util.Random;



public class Random_Names {
	private static Random rng = new Random();
	
	public static String getRName (String[] name,String[] lastname) {	
    	return name[rng.nextInt(name.length-1)]+" "+
lastname[rng.nextInt(lastname.length-1)];
    	
	}
}
