package Weapon;

import MyInterface.Shootable;
import java.util.ArrayList;
import Player.*;

public class Ȱ extends Weapon implements Shootable{

		int box_size = 10;
		int ȭ��power = 10;
		private ArrayList<ȭ��> box = new ArrayList<ȭ��>();
		
		public Ȱ() {
			this.name = "Ȱ";
			this.setPower(20);
			makeBullet();
			System.out.println("Ȱ�� ȭ�� ����"+box_size+"��");
		}
		public void makeBullet() {
			System.out.println("ȭ���� ������");
			
			for(int i = 0; i<box_size; i++) {
				box.add(new ȭ��(10));
			}
			this.setPower(this.getPower()+this.getBulletPower());
		}
		public int getBulletPower() {
			return ȭ��power;
		}
		public void shoot(Player target) {
			
			if(box.isEmpty()) {
				System.out.println("no bullet");
				//return;
			}
			else {
				System.out.println(target.name+"���� Ȱ��� ����!!");
				box.remove(box.size() - 1);
				target.sethp(target.gethp() - player.getPower() - this.getPower());
				System.out.println("ȭ���� "+box.size()+"�� ���ҽ��ϴ�.");
			}
			
		}		
}


