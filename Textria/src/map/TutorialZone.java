package map;

public class TutorialZone extends MapBasicData{

	String mapName = "튜토리얼존";
	
	
	@Override
	public void mapEnterPrint() {
		// TODO Auto-generated method stub
		System.out.println(mapName+"에 입장 합니다.");
	}

	@Override
	public void mapInfoPrint() {
		// TODO Auto-generated method stub
		System.out.println("현재 지역은 "+mapName+" 입니다.");
//		System.out.println("현재 지역에 아래의 몬스터가 있습니다.");
//		for(int i = 0 ; i < MAXCOUNT ; i++) {
//		System.out.println(MobName);
	}

	
	
	
	
		
}
