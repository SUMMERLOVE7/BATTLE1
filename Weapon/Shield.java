package Weapon;
import Player.*;
import MyInterface.Throowable;

public class ���� extends Weapon implements Throowable{
	
	public ����() {
		this.setPower(30);
		this.name = "����";
	}
	public void throow(Player target) {
		System.out.println(target.name+"���� ���д�����!!!");
		target.sethp(target.gethp() - this.getPower());	
	}
}
