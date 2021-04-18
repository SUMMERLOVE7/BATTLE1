package Weapon;

import MyInterface.*;
import java.util.ArrayList;
import Player.*;

public class ÃÑ extends Weapon implements Shootable{

	int box_size = 10;
	int ÃÑ¾Ëpower = 20;
	private ArrayList<ÃÑ¾Ë> box = new ArrayList<ÃÑ¾Ë>();
	
	public ÃÑ() {
		this.name = "ÃÑ";
		this.setPower(30);		
		makeBullet();
		System.out.println("ÃÑ°ú ÃÑ¾Ë »ý¼º"+box_size+"°³");
	}
	public void makeBullet() {
		System.out.println("ÃÑ¾ËÀ» ¸¸µéÀÚ");
		
		for(int i = 0; i<box_size; i++) {
			box.add(new ÃÑ¾Ë(20));
		}		
		this.setPower(this.getPower()+this.getBulletPower());
	}

	public int getBulletPower() {
		return ÃÑ¾Ëpower;
	}
	public void shoot(Player target) {
					
		if(box.isEmpty()) {
			System.out.println("no bullet");
			//return;
		}				
		else {
			box.remove(box.size() - 1);
			
			target.sethp(target.gethp() - player.getPower() - this.getPower());
			System.out.println(target.name+"¿¡°Ô ÃÑ½î±â °ø°Ý!!!!!!");
			System.out.println("ÃÑ¾ËÀÌ "+this.box.size()+"°³ ³²¾Ò½À´Ï´Ù.");
		}
	}	
}
