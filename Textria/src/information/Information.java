package information;

public class Information {
	

	// 몬스터 캐릭터 클래스 선언
	public class ChrInfo{

		//필드 선언
		String chrName;
		String chrClass;
		int level;
		int exp;
		int str;
		int dex;
//		int intel; 마법사 클래스 데이터 보류
		int health;
		double attackPoint;
		double guardPoint;
		double healthPoint;
//		double critical;
		
		
		//캐릭터, 몬스터 생성자
		public ChrInfo(String _chrName, String _chrClass) {
			System.out.println("정보를 로드 합니다.");
			
			this.chrName = _chrName;
			this.chrClass = _chrClass;
			level = 1;
			exp = 0;
			str = 10;
			dex = 10;
			health = 100;
			attackPoint = str*5.7;
			guardPoint = (str+health)*2.4;
			healthPoint = health*5.3;
			
			}

//캐릭터 정보 getter, setter 생성
		public String getChrName() {
			return chrName;
		}


		public void setChrName(String chrName) {
			this.chrName = chrName;
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


		public int getDex() {
			return dex;
		}


		public void setDex(int dex) {
			this.dex = dex;
		}


		public int getHealth() {
			return health;
		}


		public void setHealth(int health) {
			this.health = health;
		}


		public double getAttackPoint() {
			return attackPoint;
		}


		public void setAttackPoint(double attackPoint) {
			this.attackPoint = attackPoint;
		}


		public double getGuardPoint() {
			return guardPoint;
		}


		public void setGuardPoint(double guardPoint) {
			this.guardPoint = guardPoint;
		}


		public double getHealthPoint() {
			return healthPoint;
		}


		public void setHealthPoint(double healthPoint) {
			this.healthPoint = healthPoint;
		}
		
		
		
		}
	
	// 맵 클래스 선언
	public class MapInfo{
		
		//필드 선언
		String mapName;
		String mapIntroduce;
		int mapNum = 0;
		
		//맵 생성자
		public MapInfo() {
			
		}

		//맵 정보 getter, setter
		public String getMapName() {
			return mapName;
		}

		public void setMapName(String mapName) {
			this.mapName = mapName;
		}

		public String getMapIntroduce() {
			return mapIntroduce;
		}

		public void setMapIntroduce(String mapIntroduce) {
			this.mapIntroduce = mapIntroduce;
		}

		public int getMapNum() {
			return mapNum;
		}

		public void setMapNum(int mapNum) {
			this.mapNum = mapNum;
		}
		
		
		
	}

}
