package Data;

public class ChrData {
	
	String chrName;
	String chrClass;
	
	int level =1;
	int exp =0;
	int str;
	int agi;
	int health;
	int maxHp;
	
	
	int atkPoint;
	int shildPoint;
	
	
	

	public int getMaxHp() {
		return maxHp;
	}



	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
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
		System.out.println("경험치 : "+exp+"%" );
		System.out.println("힘 : "+str );
		System.out.println("민첩 : "+agi );
		System.out.println("체력 : "+health+"/"+maxHp );
		
		
	}
	
	public void chrLevelUp(int level) {
	
		str +=5;
		agi +=5;;
		maxHp +=100;
		health = maxHp;
		
	}
	
	public void useItem() {
		
		if(health>=maxHp) {
			
			System.out.println("더 이상 체력을 회복할 수 없습니다.");
			
		}else {
			health+=150;
				if(health > maxHp) {
					health = maxHp;
					int temp = health-maxHp;
					System.out.print("체력이 "+temp+" 회복 되었습니다.");
					System.out.println("현재 체력 : "+health);
					
				}else {
					System.out.print("체력이 150 회복 되었습니다.");
					System.out.println("현재 체력 : "+health);
				}
			
		}
	}
	
	

}
