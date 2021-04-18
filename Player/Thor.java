package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class Thor extends Player implements Attackable, Throowable{
	public Thor() {}
	public Thor(String name) {
		super(name);
		this.setPower(120);
		this.sethp(900);
	}
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10) / 2;
		if (i == 1) throow(target);
		else attack(target, this.getWeapon());
	}
	public void attack(Player target, Weapon weapon) {
		int power = 0;
		if(this.getWeapon() instanceof Rock) {
			System.out.println("Cannot Attack with rock");
		}
		else {
			System.out.println(this.getWeapon().name+" Attack!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}	
	}
	public void throow(Player target) {
		int power = 0;
		try {
		
			if (this.getWeapon() instanceof Rock) {
			   System.out.println("Attack Failed! Only Hulk can throw rock");
		    }	
			else if (this.getWeapon() instanceof Hammer) {
				System.out.println("Throwing attack! Hammar's tremendous power!!");					    
				this.getWeapon().throow(target);		    
		    }				
			else {			
				System.out.println("Throwing attack! Shield of Captin America! But Thor can use, too!");	
				this.getWeapon().throow(target);
			}
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"cannot be thrown");
		}		
	}
}
