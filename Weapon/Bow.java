package Weapon;

import MyInterface.Shootable;
import java.util.ArrayList;
import Player.*;

public class Bow extends Weapon implements Shootable{

		int box_size = 10;
		int arrowpower = 10;
		private ArrayList<Arrow> box = new ArrayList<Arrow>();
		
		public Bow() {
			this.name = "Bow";
			this.setPower(20);
			makeBullet();
			System.out.println("Create Bow and "+box_size + "Arrow");
		}
		public void makeBullet() {
			System.out.println("Making Arrow");
			
			for(int i = 0; i<box_size; i++) {
				box.add(new Arrow(10));
			}
			this.setPower(this.getPower()+this.getBulletPower());
		}
		public int getBulletPower() {
			return arrowpower;
		}
		public void shoot(Player target) {
			
			if(box.isEmpty()) {
				System.out.println("no bullet");
				//return;
			}
			else {
				System.out.println("To" +target.name+" shoot a bow!!");
				box.remove(box.size() - 1);
				target.sethp(target.gethp() - player.getPower() - this.getPower());
				System.out.println(box.size()+"arrow remained");
			}
			
		}		
}


