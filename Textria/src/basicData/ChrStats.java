package basicData;

public class ChrStats {
	
	String chrName;
	int level;
	int exp;
	int str;
	int dex;
	int intel;
	int health;
	double attackPoint;
	double guardPoint;
	double healthPoint;
	double critical;
	
	
	public ChrStats() {
		
		level = 1;
		exp = 0;
		str = 10;
		dex = 10;
		intel = 10;
		health = 20;
		attackPoint = (int)str *2.5d;
		guardPoint = (int)str*2.3d;
		healthPoint = (int)health * 10.25d;
		critical = (int)dex*0.1;
		
		
	}
	
	public void print() {
		System.out.println("attackPoint : "+(int)attackPoint);
		System.out.println("guardPoint : "+(int)guardPoint);
		System.out.println("healthPoint : "+(int)healthPoint);
		System.out.println("critical : "+(int)critical);
	}	


}
