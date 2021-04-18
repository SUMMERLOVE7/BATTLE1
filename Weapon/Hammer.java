package Weapon;
import MyInterface.*;
import Player.Player;

public class ¹¨´Ï¸£ extends Weapon implements Throowable{

	
	public ¹¨´Ï¸£() {
		this.setPower(100);
		this.name = "¹¨´Ï¸£";
	}
	public void throow(Player target) {
		System.out.println(target.name+"¿¡°Ô ¹¨´Ï¸£ ´øÁö±â!!!!!!!!!!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	public void attack(Player target) {
		target.sethp(target.gethp() - player.getPower());
	}
}
