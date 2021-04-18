package Weapon;

import java.util.ArrayList;
import java.util.Arrays;

import MyInterface.*;
import Player.*;
import View.*;

public class Weapon{

	public String name;
    private int power;
    private String [] weapon = {"����", "��", "Ȱ", "���ϸ�", "����"};  
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
        	
       	if(weapons.equals("��")) {
        	power = 20;       		
        	System.out.println("(�� ����)");  		
       	}
       	else if(weapons.equals("Ȱ")) {
       		power = 10;     		
       		System.out.println("(Ȱ ����)");   		
       	}
       	else {
       		System.out.println("(�Ѱ� Ȱ �̿ܿ��� ������ bullet�� �����ϴ�.)");         		
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
