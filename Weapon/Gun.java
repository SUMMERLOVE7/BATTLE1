package Weapon;

import MyInterface.*;
import java.util.ArrayList;
import Player.*;

public class �� extends Weapon implements Shootable{

	int box_size = 10;
	int �Ѿ�power = 20;
	private ArrayList<�Ѿ�> box = new ArrayList<�Ѿ�>();
	
	public ��() {
		this.name = "��";
		this.setPower(30);		
		makeBullet();
		System.out.println("�Ѱ� �Ѿ� ����"+box_size+"��");
	}
	public void makeBullet() {
		System.out.println("�Ѿ��� ������");
		
		for(int i = 0; i<box_size; i++) {
			box.add(new �Ѿ�(20));
		}		
		this.setPower(this.getPower()+this.getBulletPower());
	}

	public int getBulletPower() {
		return �Ѿ�power;
	}
	public void shoot(Player target) {
					
		if(box.isEmpty()) {
			System.out.println("no bullet");
			//return;
		}				
		else {
			box.remove(box.size() - 1);
			
			target.sethp(target.gethp() - player.getPower() - this.getPower());
			System.out.println(target.name+"���� �ѽ�� ����!!!!!!");
			System.out.println("�Ѿ��� "+this.box.size()+"�� ���ҽ��ϴ�.");
		}
	}	
}
