package PlayGame;

import java.util.ArrayList;
import java.util.Scanner;

import Data.ChrData;
import Data.MobData;

public class PlayGame {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ChrData chrData = new ChrData();
	
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		System.out.println("캐릭터명을 입력 하세요 : ");
			
		chrData.setChrName(scan.next());
		
		System.out.println("클래스를 선택 하세요.");
		System.out.println("1. 검사 / 2. 궁수 ");
		int selectClass=0;
		try {
		selectClass = scan.nextInt();
		
		if(selectClass==1) {
			chrData.setChrClass("검사");
			chrData.setStr(20);
			chrData.setAgi(10);
			chrData.setHealth(30);
			chrData.setAtkPoint(chrData.getStr()*3+chrData.getAgi()*2);
			chrData.setShildPoint(chrData.getStr()*2+chrData.getHealth());
		}else if(selectClass==2) {
			chrData.setChrClass("궁수");
			chrData.setStr(10);
			chrData.setAgi(30);
			chrData.setHealth(20);
			chrData.setAtkPoint(chrData.getStr()*2+chrData.getAgi()*3);
			chrData.setShildPoint(chrData.getStr()*2+chrData.getHealth());
		}
		}catch(Exception e) {
			System.out.println("클래스를 선택 해주세요");
		}
		
		
		System.out.println("캐릭터 명 : "+chrData.getChrName());
		System.out.println("클래스 : "+chrData.getChrClass());
		System.out.println("공격력 : "+chrData.getAtkPoint());
		System.out.println("방어력 : "+chrData.getShildPoint());
		
		System.out.println("초보자의 숲에 입장 하셨습니다."); //맵 데이터 없음
		System.out.println("'상태창'을 입력해 캐릭터 정보를 확인할 수 있습니다.");
		
		if(scan.next().equals("상태창")) {
			chrData.chrPrint();
		}
		
		ArrayList<MobData> mobArray = new ArrayList<MobData>();
		MobData mobRabbit = new MobData("토끼",1);
		MobData mobWolf = new MobData("늑대",2);
		MobData mobGoblin = new MobData("고블린",3);
		MobData mobOgre = new MobData("오우거",4);
		MobData mobGozila = new MobData("고질라",5);
		mobArray.add(mobRabbit);
		mobArray.add(mobWolf);
		mobArray.add(mobGoblin);
		mobArray.add(mobOgre);
		mobArray.add(mobGozila);
		

		System.out.println("'맵정보'를 입력해 몬스터 정보를 확인할 수 있습니다.");
		String temp = scan.next();
		System.out.println(temp);
		if(temp.equals("맵정보")) {
			for(int i =0 ; i < 5 ; i++ ) {
				mobArray.get(i).mobPrint();
			}
				
		}
		System.out.println("'!몬스터이름'을 입력해 몬스터를 공격 합니다.");
		if(scan.next().equals("!토끼")) {
			System.out.println("전투를 시작 합니다.");
			while(chrData.getHealth()>0 && mobRabbit.getHealth() >0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(chrData.getChrName()+"이"+mobRabbit.getMobName()+"을 공격 합니다.");
				System.out.println(chrData.getAtkPoint()+"피해를 주었습니다.");
				mobRabbit.setHealth(mobRabbit.getHealth()-chrData.getAtkPoint());
				System.out.println(mobRabbit.getMobName()+"의 현재 체력"+mobRabbit.getHealth());
			}
		}
		
		
		
	}

}
