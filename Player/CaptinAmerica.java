package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class ĸƾ�Ƹ޸�ī extends Player implements Throowable, Attackable{

	public ĸƾ�Ƹ޸�ī() {}
	public ĸƾ�Ƹ޸�ī(String name) {
		super(name);
		this.setPower(80);
		this.sethp(800);
	}
	public void throow(Player target) {
		try {			
			if (this.getWeapon() instanceof ���ϸ�) {
				System.out.println("���ݽ���!���ϸ��� �丣���� ����� �� �ֽ��ϴ�.");
		    }
		
			else if (this.getWeapon() instanceof ����) {
				System.out.println("���ݽ���!���������� ������ ��ũ�� �����մϴ�.");					    		    
		    }	
			
			else {		
				System.out.println(this.getWeapon().name+"���� ����!!!");
				this.getWeapon().throow(target);
			}
		}catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"�� ���� �� �����ϴ�.");
		}		
		
	}
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10) / 2;
		if (i == 1) throow(target);
		else attack(target, this.getWeapon());
	}
	public void attack(Player target, Weapon weapon) {
		
		int power = 0;
		
		if(weapon instanceof ����) {
			System.out.println("���ݽ���!���������� ������ ��ũ�� �����մϴ�.");	
		}
		else if(weapon instanceof ���ϸ�) {
			System.out.println("���ݽ���!���ϸ��� �丣���� ����� �� �ֽ��ϴ�.");
		}
		else {
			System.out.println(this.getWeapon().name+"���� ����!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}			
	}
}
