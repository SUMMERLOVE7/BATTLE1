package Weapon;
import MyInterface.*;

import Player.Player;

public class ���� extends Weapon implements Throowable{

	int size = 0;
	
	public ����() {
		size = (int)(Math.random()*800) % 54 + 30;
		this.setPower(size);
		this.name = "����";		
	}
	public void throow(Player target) {
		
		System.out.println(target.name+"���� ���������� ����!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	
}
