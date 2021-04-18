package Player;
import MyInterface.*;
import Weapon.*;
import View.*;

public class 호크아이 extends Player implements Shootable, Attackable{
	
	public 호크아이() {}
	public 호크아이(String name) {
		super(name);
		this.setPower(80);
		this.sethp(700);
	}
	
	public void shoot(Player target) {	
		
		if(this.getWeapon() instanceof Shootable) {			
			this.getWeapon().shoot(target);
			System.out.println(this.getWeapon().name+" 공격!!!");	
		}
		else {
			System.out.println("공격 실패!호크아이는 오직 총과 활만 사용 가능합니다");			
		}
	}
	
	public void attack(Player target) {
		System.out.print(this.name +" : ");
		int i = (int)(Math.random()*100) / 2;
		if (i == 1) shoot(target);
		else attack(target, this.getWeapon());	
	}
	
	public void attack(Player target, Weapon weapon) {		
		if(this.getWeapon() instanceof Shootable) {
			weapon.shoot(target);
		}
		else {
			System.out.println("공격 실패!호크아이는 오직 총과 활만 사용 가능합니다");
		}
	}	
}
