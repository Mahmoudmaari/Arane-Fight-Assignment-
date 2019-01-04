package maari.mahmoud.arena_fighter;

import java.util.Arrays;

public class Add_To_Array {
	
	

	public static int[] AddTooAarray(int[] result,int toAdd) {
		boolean isAdded = false;
		
		for(int i = 0; i<result.length; i++) {
			if(result[i] == 0 ) {
				result[i] = (int) toAdd;
				isAdded = true;
				break;
			}			
		}
		
		if(isAdded == false) {
			result = expandArray(result);
			result[result.length-1] = (int) toAdd;
		}
		return result;	
	}

	private static int[] expandArray(int[] result) {
		return Arrays.copyOf(result, result.length + 1);
		
	}
	
		
		
	

	
}
