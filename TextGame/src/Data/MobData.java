package Data;

import java.util.ArrayList;

public class MobData {
	
	String mobName;
		
	int level =1;
	int str=2;
	int agi=3;
	int health=100;
	int atkPoint;
	int shildPoint;
	int maxHealth;
	
//	ArrayList<String> mobName = new ArrayList<String>();
//	ArrayList<Integer> mobLevel = new ArrayList<Integer>();
	
	public MobData() {}
	
	public MobData(String mobName, int mobLevel) {
		this.mobName = mobName;
		this.level = mobLevel;
		str +=mobLevel*2;
		agi +=mobLevel*2;
		health =health*mobLevel;
		maxHealth = health;
		atkPoint = this.str + this.agi;
		shildPoint = this.str + this.health;
					
	}
	
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getAtkPoint() {
		return atkPoint;
	}

	public void setAtkPoint(int atkPoint) {
		this.atkPoint = atkPoint;
	}

	public int getShildPoint() {
		return shildPoint;
	}

	public void setShildPoint(int shildPoint) {
		this.shildPoint = shildPoint;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getAgi() {
		return agi;
	}

	public void setAgi(int agi) {
		this.agi = agi;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void mobPrint() {
		System.out.println(mobName+","+level+"레벨");
	}
	

}
