package Weapon;

import MyInterface.Shootable;
import java.util.ArrayList;
import Player.*;

public class 활 extends Weapon implements Shootable{

		int box_size = 10;
		int 화살power = 10;
		private ArrayList<화살> box = new ArrayList<화살>();
		
		public 활() {
			this.name = "활";
			this.setPower(20);
			makeBullet();
			System.out.println("활과 화살 생성"+box_size+"개");
		}
		public void makeBullet() {
			System.out.println("화살을 만들자");
			
			for(int i = 0; i<box_size; i++) {
				box.add(new 화살(10));
			}
			this.setPower(this.getPower()+this.getBulletPower());
		}
		public int getBulletPower() {
			return 화살power;
		}
		public void shoot(Player target) {
			
			if(box.isEmpty()) {
				System.out.println("no bullet");
				//return;
			}
			else {
				System.out.println(target.name+"에게 활쏘기 공격!!");
				box.remove(box.size() - 1);
				target.sethp(target.gethp() - player.getPower() - this.getPower());
				System.out.println("화살이 "+box.size()+"개 남았습니다.");
			}
			
		}		
}


