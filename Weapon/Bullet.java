package Weapon;

public class Bullet extends Weapon{

	public Bullet() {	
		System.out.println("Equip Bullet");
	}
	public Bullet(int power) {
		power += 20;
	}
	
}
