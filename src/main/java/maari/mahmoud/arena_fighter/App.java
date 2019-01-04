package maari.mahmoud.arena_fighter;

import java.util.Scanner;

import maari.mahmoud.RNG.RNG1;

public class App {

	
    
	
	public static void main(String[] args) {
		int result[]= new int [0];
		int result1[]= new int [0];
		int  Bhealth =10;
		int Uhealth=10;
		boolean alive = true,again=false,winattack=false;;
      String[] name = {"Stan","Teo","George","Rasvan","Virgil","Gabriel"};
      String[] lastname = {"Marandici","Minea","Urzica","Alecsandri","Groza","Eliade"};

      System.out.println("Put your username");
      String Pname=getInput();
      RNG1 attack = RNG1.getinstance();
      int roundnum=1;
      
      Bot_user_Character botAplayer= new Bot_user_Character(Pname, Random_Names.getRName(name, lastname));
     while(alive) {
     do{
    	 int Bpower =attack.RNG(2, 5) ;
         int  Upower =attack.RNG(3, 5);
         System.out.println("Round number is : "+roundnum);
         System.out.println(botAplayer.getPlayername()+" Health : "+Uhealth+"   "+botAplayer.getBotname()+" Health : "+Bhealth);
         System.out.println();
         System.out.println(botAplayer.getPlayername()+" Attak : "+Upower+"   "+botAplayer.getBotname()+" Attak : "+Bpower);
         System.out.println();
         System.out.println("************************************");
	 result = Add_To_Array.AddTooAarray(result,  Uhealth -= Bpower);
     result1 = Add_To_Array.AddTooAarray(result1,Bhealth -= Upower );
    	 
	 if ( Upower <=Bhealth && Bhealth >=0) {
	      
		    

		    System.out.println();
		    winattack=false;
			alive=true;
			again=false;
		}if (Bhealth <=0) {
			 int nr=roundnum;
			  Uhealth += Bpower;
			System.out.println();
			System.out.println("Round number is : "+(nr+1));
			System.out.println();
			System.out.println(botAplayer.getPlayername()+" Health : "+Uhealth+"   "+botAplayer.getBotname()+" Health : "+Bhealth);
			System.out.println();
			System.out.println("==========You Win==========");
			alive = false;
			again = true;
			winattack=true;
			
	
	    }if (winattack==true) {
		
			alive =false;
			again=true;
		}
	   
			
		 	
		 if (Uhealth <= 0 ) {
			System.out.println("-_-_-_-_-_-You Lost-_-_-_-_-_-");
			System.out.println();
			alive = false;
			again = true;
		}
		
		roundnum++;
		
       }while(!again);
    
     Uhealth=10;
     Bhealth=10;
     roundnum=1;
     result= new int [0];
     result1= new int [0];
     botAplayer.setBotname(Random_Names.getRName(name, lastname));
     System.out.println("If you want to play again press (y) To retire press any key");

     String answer = getInput();
     alive = Play_again.playAgain(answer);
   }
	}
		 private static Scanner in = new Scanner (System.in);
			public static String getInput() {
		       	return in.nextLine();
		       
			}
	
	
		
	
}

