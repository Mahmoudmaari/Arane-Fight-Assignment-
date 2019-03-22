package maari.mahmoud.arena_fighter.models;

import java.util.Scanner;



public class Shop {
	Swords normalsword = Swords.NormalSword;
	Swords epicsword = Swords.EpicSword;
	Swords raresword = Swords.RareSword;
	Swords legendarysword = Swords.LegendarySword;
	Armor normalarmor = Armor.NormalArmor;
	Armor epicarmor = Armor.EpicArmor;
	Armor rarearmor = Armor.RareArmor;
	Armor legendaryarmor = Armor.LegendaryArmor;
	
	Scanner buy = new Scanner(System.in);
	 private int winpoint;
	
	
	public int getWinpoint() {
		return winpoint;
	}
	public void setWinpoint(int winpoint) {
		this.winpoint = winpoint;
	}
	public int sword(int Upower,int Bpower) {
		String bu=buy.nextLine();
		
		switch (bu) {
		case "1": 
			    if (getWinpoint()>=10) { 
			    	money(winpoint);
			System.out.println(normalsword.getValue()+Upower);
			return Upower=Upower+normalsword.getValue();
			    }
		case "2":
			if (getWinpoint()>=epicsword.getValue()) {
				money(winpoint);
			       Bpower +=4;
			return Upower+=epicsword.getValue();
			}else {
				System.out.println("not eingh money");
				return Upower;
			}
		case "3":
			       Bpower +=8;
			return Upower+=raresword.getValue();
		case "4":  
			       Bpower +=20;
			return Upower+=legendarysword.getValue();
			default :
				System.out.println("not vaild number");
				return 0;
		}
		
	}
	public int armor(int Uhealth,int Bhealth){
		String bu=buy.nextLine();
		switch (bu) {
		case "1": 
			       Bhealth +=1;
			return Uhealth+=normalarmor.getValue();
		case "2":
			       Bhealth +=2;
			return Uhealth+=epicarmor.getValue();
		case "3":
			       Bhealth +=5;
			return Uhealth+=rarearmor.getValue();
		case "4":  
			       Bhealth +=10;
			return Uhealth+=legendaryarmor.getValue();
			default :
				System.out.println("not vaild number");
				return 0;
		}
	}
	public int powerpuls(int Bpower,int Upower) {
		if(Upower>Bpower) {
		 Bpower +=Upower-2;
		}else {
			return Bpower;
		}
		return Bpower;
		
		
	}
	public int money(int winpoint) {
	int value=0;
		return winpoint -=value;
	}
	
}
