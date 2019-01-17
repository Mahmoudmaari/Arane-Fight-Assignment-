package maari.mahmoud.arena_fighter;

import static org.junit.Assert.*;

import org.junit.Test;

public class Randomnametest {
	@Test
	public void randomname () {
		boolean bool = false;
		String[] name = { "Stan", "Teo", "George", "Rasvan", "Virgil", "Gabriel" };
		String[] lastname = { "Marandici", "Minea", "Urzica", "Alecsandri", "Groza", "Eliade" };
		String actuals =Random_Names.getRName(name, lastname);
		String[] expecteds =new String [0];
		for(int i=0; i<name.length;i++) {
			for(int j=0; j<lastname.length;j++) {
				expecteds = Add_To_Array.AddTooAarray(expecteds, name[i] + " " + lastname[j]);
			
			}
		}
		for (int i=0;i<expecteds.length;i++) {
			if(expecteds[i].equals(actuals)) {
				bool=true;
			}
		}
		
		
		
		assertTrue(bool);
	}

}
