package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class CaptinAmerica extends Player implements Throowable, Attackable{

	public CaptinAmerica() {}
	public CaptinAmerica(String name) {
		super(name);
		this.setPower(80);
		this.sethp(800);
	}
	public void throow(Player target) {
		try {			
			if (this.getWeapon() instanceof Hammer) {
				System.out.println("Attack Failed! Only Thor can use hammer.");
		    }
		
			else if (this.getWeapon() instanceof Rock) {
				System.out.println("Attack Failed! Only Hulk can throw rock");					    		    
		    }	
			
			else {		
				System.out.println(this.getWeapon().name+" attack!!!");
				this.getWeapon().throow(target);
			}
		}catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"cannot be used.");
		}		
		
	}
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10) / 2;
		if (i == 1) throow(target);
		else attack(target, this.getWeapon());
	}
	public void attack(Player target, Weapon weapon) {
		
		int power = 0;
		
		if(weapon instanceof Rock) {
			System.out.println("Attack Failed! Only Hulk can throw rock");	
		}
		else if(weapon instanceof Hammer) {
			System.out.println("Attack Failed! Only Thor can use hammer.");
		}
		else {
			System.out.println(this.getWeapon().name+" Attack!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}			
	}
}
