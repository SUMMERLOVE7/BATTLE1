package Weapon;
import MyInterface.*;
import Player.Player;

public class ���ϸ� extends Weapon implements Throowable{

	
	public ���ϸ�() {
		this.setPower(100);
		this.name = "���ϸ�";
	}
	public void throow(Player target) {
		System.out.println(target.name+"���� ���ϸ� ������!!!!!!!!!!!");
		target.sethp(target.gethp() - this.getPower());		
	}
	public void attack(Player target) {
		target.sethp(target.gethp() - player.getPower());
	}
}
