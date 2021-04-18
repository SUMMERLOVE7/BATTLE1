package Player;
import MyInterface.*;
import View.*;
import Weapon.*;

public class Hulk extends Player implements Throowable, Hitable{

	public Hulk() {}
	public Hulk(String name) {
		super(name);
		this.setPower(100);
		this.sethp(1000);
	}
	public void throow(Player target) {
		int power = 0;
		try {
			if (this.getWeapon() instanceof Hammer) {			
				System.out.println("Attack Failed! Only Thor can use hammer.");
		    }		
			else {
		        System.out.println("Throwing attack! power doubled!!");	
		        System.out.println("Original power is "+this.getWeapon().getPower());
		        power = this.getWeapon().getPower()*2 + this.getPower();
		        target.sethp(target.gethp() - power);
		    }
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"cannot be thrown.");
		}			
	}
	public void hit(Player target) {
		if (this.getWeapon() instanceof Hammer) {
			System.out.println("Attack Failed! Only Thor can use hammer.");
		}
		else {
		    System.out.println("Hit!");
		    
		    int power = this.getPower();
		    
		    if (this.getWeapon() != null) {
			    power += this.getWeapon().getPower();			
		    }
		    target.sethp(target.gethp() - power);
		}
	}	
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10 / 2);
		if (i == 1) hit(target);
		else throow(target);
	}
}
