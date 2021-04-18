package Weapon;

import MyInterface.*;
import java.util.ArrayList;
import Player.*;

public class Gun extends Weapon implements Shootable{

	int box_size = 10;
	int bulletpower = 20;
	private ArrayList<Bullet> box = new ArrayList<Bullet>();
	
	public Gun() {
		this.name = "รั";
		this.setPower(30);		
		makeBullet();
		System.out.println("Create Gun and "+box_size+" bullet");
	}
	public void makeBullet() {
		System.out.println("Making bullet");
		
		for(int i = 0; i<box_size; i++) {
			box.add(new Bullet(20));
		}		
		this.setPower(this.getPower()+this.getBulletPower());
	}

	public int getBulletPower() {
		return bulletpower;
	}
	public void shoot(Player target) {
					
		if(box.isEmpty()) {
			System.out.println("no bullet");
			//return;
		}				
		else {
			box.remove(box.size() - 1);
			
			target.sethp(target.gethp() - player.getPower() - this.getPower());
			System.out.println("To"+target.name+", shoot a gun!!!!!!");
			System.out.println(this.box.size()+" bullet remained");
		}
	}	
}
