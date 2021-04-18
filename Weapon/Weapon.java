package Weapon;

import java.util.ArrayList;
import java.util.Arrays;

import MyInterface.*;
import Player.*;
import View.*;

public class Weapon{

	public String name;
    private int power;
    private String [] weapon = {"바위", "총", "활", "묠니르", "방패"};  
    public ArrayList <Weapon> weapons = new ArrayList <Weapon>();
    Player player = new Player();
    
    
    public Weapon() {
        for (int i = 0; i<weapons.size();i++) {
        	weapons.set(i, weapons.get(i));
        }   
    } 	
    public int getPower(){
        int total = power;
        return total;
    }

    public void setPower(int power){
       	this.power = power;
    }

    public int getBulletPower(){
       	int power = 0;
        	
       	if(weapons.equals("총")) {
        	power = 20;       		
        	System.out.println("(총 선택)");  		
       	}
       	else if(weapons.equals("활")) {
       		power = 10;     		
       		System.out.println("(활 선택)");   		
       	}
       	else {
       		System.out.println("(총과 활 이외에는 소유한 bullet이 없습니다.)");         		
       		power = 0;       		        	
       		} 	
        return power;
        }
       
	public void attack(Player target) {
		System.out.println("Attack with"+ this.name);
		if(player.getWeapon() instanceof Hammer) {
			if(player instanceof Thor) {
				player.attack(target);
			}
			else System.out.println("Cannot use weapon");
		}
		target.sethp(target.gethp() - power);		
	}
		
	public void shoot(Player target) {
		if(player.getWeapon() instanceof Shootable) {
			player.getWeapon().shoot(target);
		}
	} 
	public void throow(Player target) {
		if(player.getWeapon() instanceof Throowable) {
			player.getWeapon().throow(target);
		}
	}
}
