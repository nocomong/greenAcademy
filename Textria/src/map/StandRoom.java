package map;

public class StandRoom extends MapBasicData{

	mapName = "대기방";
	mapNum = 1;
	
	public StandRoom() {
		System.out.print(mapName + "에 입장 하셨습니다.");
	}
	
	@Override
	public void mapEnterPrint() {
		// TODO Auto-generated method stub
		System.out.println(mapName+"에 입장 합니다.");
	}

	@Override
	public void mapInfoPrint() {
		// TODO Auto-generated method stub
		System.out.println("현재 지역은 "+mapName+" 입니다.");

	}

}
	
	
	
		
}
