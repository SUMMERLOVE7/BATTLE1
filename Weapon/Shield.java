package Weapon;
import Player.*;
import MyInterface.Throowable;

public class Shield extends Weapon implements Throowable{
	
	public Shield() {
		this.setPower(30);
		this.name = "πÊ∆–";
	}
	public void throow(Player target) {
		System.out.println("To " +target.name+" throw Shield!!!");
		target.sethp(target.gethp() - this.getPower());	
	}
}
