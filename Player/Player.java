package Player;

import java.util.ArrayList;

import MyInterface.*;
import Weapon.*;
import View.*;

public class Player implements Attackable{

	public String name;
	private int hp;
	private int power;
	private Weapon weapon;
	Player player;
	Player target;
	
    public Player() {}
    public Player(String name) {
    	this.name = name;
    }
    
    public String getname() {
    	return name;
    }
    
    public int getPower(){
        return power;
    }

    public void setPower(int power){
    	this.power = power;
    }

    public void sethp(int hp){
    	this.hp = hp;
    }

    public int gethp(){
        return hp;
    }
    
    public void setWeapon(Weapon weapon) {
    	
    	this.weapon = weapon;
    	System.out.println(weapon.name+" has been selected");    	
    }
    
    public Weapon getWeapon() {
    	return weapon;
    }
    public void attack(Player target) {

    	if (this.weapon instanceof Attackable) {
    		weapon.attack(target);
    	}
    	else {	
    		int power = this.power + weapon.getPower();
    		target.sethp(target.gethp() - power);
    	}
    }
    
    public void attack(Player target, Weapon weapon) {   	  	 	
    	if (weapon != null) {
    		power = this.power + weapon.getPower();
    	}   	    	
    	target.sethp(target.gethp() - power);
    }
    
    public void show() {
    	System.out.println(this.name+"   current hp : "+this.gethp());
    	System.out.println("----------------------------------------------");
    }   
}
