package Player;
import MyInterface.*;
import View.*;
import Weapon.*;

public class ��ũ extends Player implements Throowable, Hitable{

	public ��ũ() {}
	public ��ũ(String name) {
		super(name);
		this.setPower(100);
		this.sethp(1000);
	}
	public void throow(Player target) {
		int power = 0;
		try {
			if (this.getWeapon() instanceof ���ϸ�) {			
				System.out.println("���ݽ���!���ϸ��� �丣���� ����� �� �ֽ��ϴ�.");
		    }		
			else {
		        System.out.println("������ ����! power��  2��!!");	
		        System.out.println("������ �⺻power�� "+this.getWeapon().getPower());
		        power = this.getWeapon().getPower()*2 + this.getPower();
		        target.sethp(target.gethp() - power);
		    }
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"�� ���� �� �����ϴ�.");
		}			
	}
	public void hit(Player target) {
		if (this.getWeapon() instanceof ���ϸ�) {
			System.out.println("���ݽ���!���ϸ��� �丣���� ����� �� �ֽ��ϴ�.");
		}
		else {
		    System.out.println("������ ����");
		    
		    int power = this.getPower();
		    
		    if (this.getWeapon() != null) {
			    power += this.getWeapon().getPower();			
		    }
		    target.sethp(target.gethp() - power);
		}
	}	
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10 / 2);
		if (i == 1) hit(target);
		else throow(target);
	}
}
