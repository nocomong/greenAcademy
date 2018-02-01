package PlayGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Data.ChrData;
import Data.CombatData;
import Data.MobData;

public class PlayGame {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CombatData combat = new CombatData();
		ChrData chrData = new ChrData();
	
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		
		do {
			System.out.print("6자 이내의 캐릭터명을 입력 해주세요 : ");
			chrData.setChrName(scan.next());
			}
		
		while(chrData.getChrName().length()>6);
		
			
		
		
		System.out.println("클래스를 선택 하세요.");
		System.out.print("1. 검사 / 2. 궁수 : ");
		int selectClass=0;
		try {
		selectClass = scan.nextInt();
		
		if(selectClass==1) {
			chrData.setChrClass("검사");
			chrData.setStr(20+chrData.getLevel()*3);
			chrData.setAgi(10+chrData.getLevel()*3);
			chrData.setMaxHp(30+chrData.getLevel()*3);
			chrData.setHealth(chrData.getMaxHp());
			chrData.setAtkPoint(chrData.getStr()*3+chrData.getAgi()*2);
			chrData.setShildPoint(chrData.getStr()*3+chrData.getHealth());
			
		}else if(selectClass==2) {
			chrData.setChrClass("궁수");
			chrData.setStr(10+chrData.getLevel()*3);
			chrData.setAgi(30+chrData.getLevel()*3);
			chrData.setMaxHp(20+chrData.getLevel()*3);
			chrData.setHealth(chrData.getMaxHp());
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
		
		combat.pause();
		
		System.out.println("초보자의 숲에 입장 하셨습니다."); //맵 데이터 없음
		System.out.println("'상태창'을 입력해 캐릭터 정보를 확인할 수 있습니다.");
		
	
//		if(scan.next().equals("상태창")) {
//			chrData.chrPrint();
//		} 키워드 반복문으로 이동
		
		ArrayList<MobData> mobArray = new ArrayList<MobData>();
		HashMap<String, Integer> deadMob= new HashMap<>();
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
		System.out.println("'새로고침'을 입력해 몬스터 정보를 확인할 수 있습니다.");
//		String temp = scan.next();
//		System.out.println(temp);
		System.out.println("'포션'을 입력해 체력을 회복할 수 있습니다.");
		System.out.println("'!몬스터이름'을 입력해 몬스터를 공격 합니다.");
		
		
		
		//키워드 입력 반복문 시작
		while(mobGozila.getHealth()>0) {
			System.out.print("명령어를 입력 하세요 : ");
			String keyWord = scan.next();
			boolean mobMatch = false;
		
		if(keyWord.equals("상태창")) {
				chrData.chrPrint();
			}	
			
		if(keyWord.equals("맵정보")) {
			try {	
			for(int i =0 ; i < mobArray.size() ; i++ ) {
					mobArray.get(i).mobPrint();
				}
			}catch(Exception e)	{
				
			}
			}
		if(keyWord.equals("새로고침")) {
			try {
				mobArray.clear();
			
			}
			catch(Exception e)	{
				
			}
			
			mobArray.add(mobRabbit);
			mobArray.add(mobWolf);
			mobArray.add(mobGoblin);
			mobArray.add(mobOgre);
			mobArray.add(mobGozila);
			try {	
				for(int i =0 ; i < mobArray.size() ; i++ ) {
						mobArray.get(i).mobPrint();
					}
				}catch(Exception e)	{
					
				}
		}
			
			
		if(keyWord.equals("포션")) {
			chrData.useItem();
			
		}	
		if(keyWord.equals("!토끼")) {
			String rabbit = keyWord.substring(1,keyWord.length());
			
			if(deadMob.containsKey(rabbit)==true) {
				System.out.println("토끼가 죽었습니다.");
			}else {
				System.out.println("토끼와 전투를 시작 합니다.");	
				while(chrData.getHealth()>0 && mobRabbit.getHealth() >0) {
					combat.pause();
					System.out.println(chrData.getChrName()+"이"+mobRabbit.getMobName()+"을(를) 공격 합니다.");
					combat.pause();
					System.out.print(chrData.getAtkPoint()+"피해를 주었습니다.");
					
					mobRabbit.setHealth(mobRabbit.getHealth()-chrData.getAtkPoint());
					
					if(mobRabbit.getHealth()<0) {
						System.out.println(mobRabbit.getMobName()+"를 처치 하였습니다.");
						mobArray.remove(0);
						deadMob.put(mobRabbit.getMobName(), 1); //죽은 몹 등록
						combat.pause();
						chrData.setExp(chrData.getExp()+mobRabbit.getLevel()*20);
						combat.pause();
						System.out.println("경험치 "+mobRabbit.getLevel()*20+"% 를 획득 하였습니다.");
						combat.pause();
						
						combat.pause();
						if(chrData.getExp()>100) {
							chrData.setLevel(chrData.getLevel()+1);
							chrData.chrLevelUp(chrData.getLevel());
							System.out.println("레벨이 상승 하였습니다. 현재 레벨 :"+chrData.getLevel());
							chrData.setExp(chrData.getExp()-100);
							chrData.chrPrint();
							
						}else {
							System.out.println("현재 경험치 : "+chrData.getExp()+"%");
						}
						break;
					}
					System.out.println(mobRabbit.getMobName()+"의 현재 체력 : "+mobRabbit.getHealth()); //플레이어 공격끝
					combat.pause();
					System.out.println(mobRabbit.getMobName()+"가 앞니 공격.");
					combat.pause();
					System.out.print(mobRabbit.getAtkPoint()+"피해를 받았습니다.");
					chrData.setHealth(chrData.getHealth()-mobRabbit.getAtkPoint());
					System.out.println(chrData.getChrName()+"의 현재 체력 : "+chrData.getHealth());
							
					combat.pause();
					if(chrData.getHealth()<0) {
						System.out.println(chrData.getChrName()+"이 사망하였습니다.");
						combat.pause();
						System.out.println("GAME OVER");
						return;
					}
						chrData.getHealth();			
				} //전투 조건문 while 종료
			}
		}	
			
			
		if(keyWord.equals("!늑대")) {
			String wolf = keyWord.substring(1,keyWord.length());
			
			if(deadMob.containsKey(wolf)==true) {
				System.out.println("늑대가 죽었습니다.");
			}else {
					
			System.out.println("늑대와 전투를 시작 합니다.");
			while(chrData.getHealth()>0 && mobWolf.getHealth() >0) {
				combat.pause();
				System.out.println(chrData.getChrName()+"이 "+mobWolf.getMobName()+"을(를) 공격 합니다.");
				combat.pause();
				System.out.print(chrData.getAtkPoint()+"피해를 주었습니다.");
				
				mobWolf.setHealth(mobWolf.getHealth()-chrData.getAtkPoint());
				
				if(mobWolf.getHealth()<0) {
					System.out.println(mobWolf.getMobName()+"를 처치 하였습니다.");
					mobArray.remove(1);
					combat.pause();
					deadMob.put(mobWolf.getMobName(), 2); //죽은 몹 등록
					chrData.setExp(chrData.getExp()+mobWolf.getLevel()*20);
					combat.pause();
					System.out.println("경험치 "+mobWolf.getLevel()*20+"% 를 획득 하였습니다.");
					combat.pause();
					
					
					if(chrData.getExp()>100) {
						chrData.setLevel(chrData.getLevel()+1);
						chrData.chrLevelUp(chrData.getLevel());
						System.out.println("레벨이 상승 하였습니다. 현재 레벨 :"+chrData.getLevel());
						chrData.setExp(chrData.getExp()-100);
						chrData.chrPrint();
						
					}else {
						System.out.println("현재 경험치 : "+chrData.getExp()+"%");
					}
					break;
				}
				System.out.println(mobWolf.getMobName()+"의 현재 체력 : "+mobWolf.getHealth()); //플레이어 공격끝
				combat.pause();
				System.out.println(mobWolf.getMobName()+"가 어금니 공격.");
				combat.pause();
				System.out.print(mobWolf.getAtkPoint()+"피해를 받았습니다.");
				chrData.setHealth(chrData.getHealth()-mobWolf.getAtkPoint());
				System.out.println(chrData.getChrName()+"의 현재 체력 : "+chrData.getHealth());
				combat.pause();
				
				if(chrData.getHealth()<0) {
					System.out.println(chrData.getChrName()+"이 사망하였습니다.");
					combat.pause();
					System.out.println("GAME OVER");
					return;
				}
								
			} //전투 조건문 while 종료
		} //늑대 if문 끝
		}
		
		if(keyWord.equals("!고블린")) {
			String goblin = keyWord.substring(1,keyWord.length());
			
			if(deadMob.containsKey(goblin)==true) {
				System.out.println("고블린이 죽었습니다.");
			}else {
			System.out.println("고블린과 전투를 시작 합니다.");
			while(chrData.getHealth()>0 && mobGoblin.getHealth() >0) {
				combat.pause();
				System.out.println(chrData.getChrName()+"이"+mobGoblin.getMobName()+"을(를) 공격 합니다.");
				combat.pause();
				System.out.print(chrData.getAtkPoint()+"피해를 주었습니다.");
				
				mobGoblin.setHealth(mobGoblin.getHealth()-chrData.getAtkPoint());
				
				if(mobGoblin.getHealth()<0) {
					System.out.println(mobGoblin.getMobName()+"를 처치 하였습니다.");
					mobArray.remove(2);
					combat.pause();
					deadMob.put(mobGoblin.getMobName(), 3); //죽은 몹 등록
					chrData.setExp(chrData.getExp()+mobGoblin.getLevel()*20);
					combat.pause();
					System.out.println("경험치 "+mobGoblin.getLevel()*20+"% 를 획득 하였습니다.");
					
					combat.pause();
					if(chrData.getExp()>100) {
						chrData.setLevel(chrData.getLevel()+1);
						chrData.chrLevelUp(chrData.getLevel());
						System.out.println("레벨이 상승 하였습니다. 현재 레벨 :"+chrData.getLevel());
						chrData.setExp(chrData.getExp()-100);
						chrData.chrPrint();
						
					}else {
						System.out.println("현재 경험치 : "+chrData.getExp()+"%");
					}
					break;
				}
				System.out.println(mobGoblin.getMobName()+"의 현재 체력 : "+mobGoblin.getHealth()); //플레이어 공격끝
				combat.pause();
				System.out.println(mobGoblin.getMobName()+"의 찌르기 공격");
				combat.pause();
				System.out.print(mobGoblin.getAtkPoint()+"피해를 받았습니다.");
				System.out.println(chrData.getChrName()+"의 현재 체력 : "+chrData.getHealth());
				combat.pause();
				
				chrData.setHealth(chrData.getHealth()-mobGoblin.getAtkPoint());
				combat.pause();
				if(chrData.getHealth()<0) {
					System.out.println(chrData.getChrName()+"이 사망하였습니다.");
					combat.pause();
					System.out.println("GAME OVER");
					return;
				}
								
			} //전투 조건문 while 종료
		} //고블린 if문 끝
		
		} 
		
		if(keyWord.equals("!오우거")) {
			String ogre = keyWord.substring(1,keyWord.length());
			
			if(deadMob.containsKey(ogre)==true) {
				System.out.println("오우거가 죽었습니다.");
			}else {
			System.out.println("오우거와 전투를 시작 합니다.");
			while(chrData.getHealth()>0 && mobGoblin.getHealth() >0) {
				combat.pause();
				System.out.println(chrData.getChrName()+"이"+mobOgre.getMobName()+"을(를) 공격 합니다.");
				combat.pause();
				System.out.print(chrData.getAtkPoint()+"피해를 주었습니다.");
				
				mobOgre.setHealth(mobOgre.getHealth()-chrData.getAtkPoint());
				
				if(mobOgre.getHealth()<0) {
					System.out.println(mobOgre.getMobName()+"를 처치 하였습니다.");
					mobArray.remove(3);
					combat.pause();
					deadMob.put(mobOgre.getMobName(), 4); //죽은 몹 등록
					chrData.setExp(chrData.getExp()+mobOgre.getLevel()*20);
					combat.pause();
					System.out.println("경험치 "+mobOgre.getLevel()*20+"% 를 획득 하였습니다.");
					combat.pause();
				
					if(chrData.getExp()>100) {
						chrData.setLevel(chrData.getLevel()+1);
						chrData.chrLevelUp(chrData.getLevel());
						System.out.println("레벨이 상승 하였습니다. 현재 레벨 :"+chrData.getLevel());
						chrData.setExp(chrData.getExp()-100);
						chrData.chrPrint();
						
					}else {
						System.out.println("현재 경험치 : "+chrData.getExp()+"%");
					}
					break;
				}
				System.out.println(mobOgre.getMobName()+"의 현재 체력 : "+mobOgre.getHealth()); //플레이어 공격끝
				combat.pause();
				System.out.println(mobOgre.getMobName()+"의 핵펀치 공격.");
				combat.pause();
				System.out.print(mobOgre.getAtkPoint()+"피해를 받았습니다.");
				chrData.setHealth(chrData.getHealth()-mobOgre.getAtkPoint());
				System.out.println(chrData.getChrName()+"의 현재 체력 : "+chrData.getHealth());
				combat.pause();
				
				if(chrData.getHealth()<0) {
					System.out.println(chrData.getChrName()+"이 사망하였습니다.");
					combat.pause();
					System.out.println("GAME OVER");
					return;
					
				}
								
			} //전투 조건문 while 종료
		} //오우거 if문 끝
		
		} // 오우거 else문 끝	
		
		if(keyWord.equals("!고질라")) {
			System.out.println("고질라와 전투를 시작 합니다.");
			while(chrData.getHealth()>0 && mobGozila.getHealth() >0) {
				combat.pause();
				System.out.println(chrData.getChrName()+"이"+mobGozila.getMobName()+"을(를) 공격 합니다.");
				combat.pause();
				System.out.print(chrData.getAtkPoint()+"피해를 주었습니다.");
				
				mobGozila.setHealth(mobGozila.getHealth()-chrData.getAtkPoint());
				
				if(mobGozila.getHealth()<0) {
					System.out.println(mobGozila.getMobName()+"를 처치 하였습니다.");
					System.out.println("텍스트리아에 평화가 찾아왔습니다. 끝~~~~~");
					return;
				}
				System.out.println(mobGozila.getMobName()+"의 현재 체력 : "+mobGozila.getHealth()); //플레이어 공격끝
				combat.pause();
				System.out.println(mobGozila.getMobName()+"의 브레스 공격.");
				combat.pause();
				System.out.print(mobGozila.getAtkPoint()+"피해를 받았습니다.");
				chrData.setHealth(chrData.getHealth()-mobGozila.getAtkPoint());
				System.out.println(chrData.getChrName()+"의 현재 체력 : "+chrData.getHealth());
				combat.pause();
				
				if(chrData.getHealth()<0) {
					System.out.println(chrData.getChrName()+"이 사망하였습니다.");
					combat.pause();
					System.out.println("GAME OVER");
					return;
				}
								
			} //전투 조건문 while 종료
			
		} //고질라 if문 끝
		
		
		} //전투 while문 끝
		
		
	// ------------------------------------------	
	} 

} 
