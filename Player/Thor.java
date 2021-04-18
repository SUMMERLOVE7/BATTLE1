package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class 토르 extends Player implements Attackable, Throowable{
	public 토르() {}
	public 토르(String name) {
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
		if(this.getWeapon() instanceof 바위) {
			System.out.println("바위로는 공격불가");
		}
		else {
			System.out.println(this.getWeapon().name+"으로 공격!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}	
	}
	public void throow(Player target) {
		int power = 0;
		try {
		
			if (this.getWeapon() instanceof 바위) {
			   System.out.println("바위던지기 공격은 헐크만 가능합니다.");
		    }	
			else if (this.getWeapon() instanceof 묠니르) {
				System.out.println("던지기 공격! 묠니르의 엄청난 power!!");					    
				this.getWeapon().throow(target);		    
		    }				
			else {			
				System.out.println("던지기 공격! 캡틴아메리카의 방패!하지만 토르도 사용가능!");	
				this.getWeapon().throow(target);
			}
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"은 던질 수 없습니다.");
		}		
	}
}
