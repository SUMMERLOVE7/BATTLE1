package Player;
import Weapon.*;
import View.*;
import MyInterface.*;

public class 캡틴아메리카 extends Player implements Throowable, Attackable{

	public 캡틴아메리카() {}
	public 캡틴아메리카(String name) {
		super(name);
		this.setPower(80);
		this.sethp(800);
	}
	public void throow(Player target) {
		try {			
			if (this.getWeapon() instanceof 묠니르) {
				System.out.println("공격실패!묠니르는 토르만이 사용할 수 있습니다.");
		    }
		
			else if (this.getWeapon() instanceof 바위) {
				System.out.println("공격실패!바위던지기 공격은 헐크만 가능합니다.");					    		    
		    }	
			
			else {		
				System.out.println(this.getWeapon().name+"으로 공격!!!");
				this.getWeapon().throow(target);
			}
		}catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"은 던질 수 없습니다.");
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
		
		if(weapon instanceof 바위) {
			System.out.println("공격실패!바위던지기 공격은 헐크만 가능합니다.");	
		}
		else if(weapon instanceof 묠니르) {
			System.out.println("공격실패!묠니르는 토르만이 사용할 수 있습니다.");
		}
		else {
			System.out.println(this.getWeapon().name+"으로 공격!!!");
			power = this.getWeapon().getPower()+this.getPower();
			target.sethp(target.gethp() - power);
		}			
	}
}
