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

	private static String[] expandArray(String[] result) {
		return Arrays.copyOf(result, result.length + 1);
		
	}
	
		/**
		 * just for test 
		 * @param result = expecteds
		 * @param toAdd  =  name[i]+" "+lastname[j]
		 * @return to expecteds
		 */
		
	public static String[] AddTooAarray(String[] result,String toAdd) {
		boolean isAdded = false;
		
		for(int i = 0; i<result.length; i++) {
			if(result[i] == null ) {
				result[i] = toAdd;
				isAdded = true;
				break;
			}			
		}
		
		if(isAdded == false) {
			result = expandArray(result);
			result[result.length-1] =  toAdd;
		}
		return result;	
	}

	private static int[] expandArray(int[] result) {
		return Arrays.copyOf(result, result.length + 1);
		
	}
	
		

	
}
