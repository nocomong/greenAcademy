package Data;

public class ChrData {
	
	String chrName;
	String chrClass;
	
	int level =1;
	int exp =0;
	int str;
	int agi;
	int health;
	
	int atkPoint;
	int shildPoint;
	
	
	

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



	public String getChrName() {
		return chrName;
	}



	public void setChrName(String chrName) {
		this.chrName = chrName;
	}



	public String getChrClass() {
		return chrClass;
	}



	public void setChrClass(String chrClass) {
		this.chrClass = chrClass;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
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



	//캐릭터, 몬스터 생성자

	

	

	public ChrData() {}



	public void chrPrint() {
		System.out.println("캐릭터 명 : "+chrName );
		System.out.println("클래스 : "+chrClass );
		System.out.println("레벨 : "+level );
		System.out.println("경험치 : "+exp );
		System.out.println("힘 : "+str );
		System.out.println("민첩 : "+agi );
		System.out.println("체력 : "+health );
		
		
	}
	
	

}