package Weapon;
import MyInterface.*;
import Player.Player;

public class Hammer extends Weapon implements Throowable{

	
	public Hammer() {
		this.setPower(100);
		this.name = "Hammer";
	}
	public void throow(Player target) {
		System.out.println("To"+target.name+", throw Hammer!!!!!!!!!!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	public void attack(Player target) {
		target.sethp(target.gethp() - player.getPower());
	}
}
