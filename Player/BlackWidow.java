package Player;
import Weapon.*;
import MyInterface.*;
import View.*;

public class BlackWidow extends Player implements Shootable, Attackable{
	public BlackWidow() {}
	public BlackWidow(String name) {
		super(name);
		this.setPower(70);
		this.sethp(700);
	}
	public void shoot(Player target) {
		if(this.getWeapon() instanceof Shootable) {						
			this.getWeapon().shoot(target);
			System.out.println(this.getWeapon().name+" Attack!!!");	
		}
		else {
			System.out.println("Attack Failed! Black Widow can use only gun and bow");	
		}
	}
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10) / 2;
		if (i == 1) shoot(target);
		else attack(target, this.getWeapon());
	}
	public void attack(Player target, Weapon weapon) {
		
		if(this.getWeapon() instanceof Shootable) {
			weapon.shoot(target);
		}
		else {
			System.out.println("Attack Failed! Black Widow can use only gun and bow");
		}
	}
}
