package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class �丣 extends Player implements Attackable, Throowable{
	public �丣() {}
	public �丣(String name) {
		super(name);
		this.setPower(120);
		this.sethp(900);
	}
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10) / 2;
		if (i == 1) throow(target);
		else attack(target, this.getWeapon());
	}
	public void attack(Player target, Weapon weapon) {
		int power = 0;
		if(this.getWeapon() instanceof ����) {
			System.out.println("�����δ� ���ݺҰ�");
		}
		else {
			System.out.println(this.getWeapon().name+"���� ����!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}	
	}
	public void throow(Player target) {
		int power = 0;
		try {
		
			if (this.getWeapon() instanceof ����) {
			   System.out.println("���������� ������ ��ũ�� �����մϴ�.");
		    }	
			else if (this.getWeapon() instanceof ���ϸ�) {
				System.out.println("������ ����! ���ϸ��� ��û�� power!!");					    
				this.getWeapon().throow(target);		    
		    }				
			else {			
				System.out.println("������ ����! ĸƾ�Ƹ޸�ī�� ����!������ �丣�� ��밡��!");	
				this.getWeapon().throow(target);
			}
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"�� ���� �� �����ϴ�.");
		}		
	}
}
