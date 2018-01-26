package basicData;

import java.util.Scanner;

public class StartPage {

	

	String name;
	int selectClass;
	String chrClass;
	int swordMan = 1;
	int archer =2;
	int mage = 3;
	
	Scanner scan = new Scanner(System.in);
	
	public void startPrint() {
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		System.out.println("캐릭터명 을 입력 하세요 : ");
		while(true) {
		
		
		try {
		name = scan.next();
		break;
		}
		
		catch(NullPointerException f) {
			
			System.out.println("캐릭터명을 입력 하세요.");
			scan = new Scanner(System.in);
			

		}

		}
	
		
		System.out.println("클래스를 선택 하세요.");
//		System.out.println("1. 검사 / 2. 궁수 / 3.마법사"); 마법사 클래스 보규
		System.out.println("1. 검사 / 2. 궁수" );
		
		try {
		selectClass = scan.nextInt();
		}
		catch(Exception e){
			System.out.println("1~2 숫자중 입력 하세요.");
		}
		
		if(selectClass == swordMan) {
			chrClass = "검사";
		}
//		else if(selectClass == archer) {
		else{
			chrClass = "궁수" ;
		}
//		else {
//			chrClass = "마법사";
//		}
		
		System.out.println("캐릭터 명 : "+name);
		System.out.println("클래스 : "+chrClass);
		System.out.println();
		System.out.println("게임을 시작 합니다.");
		
		
	}
	}

