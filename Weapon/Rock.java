package Weapon;
import MyInterface.*;

import Player.Player;

public class Rock extends Weapon implements Throowable{

	int size = 0;
	
	public Rock() {
		size = (int)(Math.random()*800) % 54 + 30;
		this.setPower(size);
		this.name = "πŸ¿ß";		
	}
	public void throow(Player target) {
		
		System.out.println("To"+target.name+" throw rock!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	
}
