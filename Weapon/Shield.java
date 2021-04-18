package Weapon;
import Player.*;
import MyInterface.Throowable;

public class 방패 extends Weapon implements Throowable{
	
	public 방패() {
		this.setPower(30);
		this.name = "방패";
	}
	public void throow(Player target) {
		System.out.println(target.name+"에게 방패던지기!!!");
		target.sethp(target.gethp() - this.getPower());	
	}
}
