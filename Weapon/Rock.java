package Weapon;
import MyInterface.*;

import Player.Player;

public class 바위 extends Weapon implements Throowable{

	int size = 0;
	
	public 바위() {
		size = (int)(Math.random()*800) % 54 + 30;
		this.setPower(size);
		this.name = "바위";		
	}
	public void throow(Player target) {
		
		System.out.println(target.name+"에게 바위던지기 공격!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	
}
