package Player;
import MyInterface.*;
import View.*;
import Weapon.*;

public class 헐크 extends Player implements Throowable, Hitable{

	public 헐크() {}
	public 헐크(String name) {
		super(name);
		this.setPower(100);
		this.sethp(1000);
	}
	public void throow(Player target) {
		int power = 0;
		try {
			if (this.getWeapon() instanceof 묠니르) {			
				System.out.println("공격실패!묠니르는 토르만이 사용할 수 있습니다.");
		    }		
			else {
		        System.out.println("던지기 공격! power가  2배!!");	
		        System.out.println("던지기 기본power는 "+this.getWeapon().getPower());
		        power = this.getWeapon().getPower()*2 + this.getPower();
		        target.sethp(target.gethp() - power);
		    }
		}
		catch(ClassCastException e) {
			System.out.println(this.getWeapon()+"은 던질 수 없습니다.");
		}			
	}
	public void hit(Player target) {
		if (this.getWeapon() instanceof 묠니르) {
			System.out.println("공격실패!묠니르는 토르만이 사용할 수 있습니다.");
		}
		else {
		    System.out.println("때리기 공격");
		    
		    int power = this.getPower();
		    
		    if (this.getWeapon() != null) {
			    power += this.getWeapon().getPower();			
		    }
		    target.sethp(target.gethp() - power);
		}
	}	
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*10 / 2);
		if (i == 1) hit(target);
		else throow(target);
	}
}
