package charector;

import java.util.Scanner;

import Abc.CarSet;
import information.Information;

public class NewChr {
	
	Scanner scan = new Scanner(System.in);
	
	
	public void newChrPrint() {
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		System.out.println("캐릭터명 을 입력 하세요 : ");

		String newChr = scan.next();
			
			System.out.println("클래스를 선택 하세요.");
			System.out.println("1. 검사 / 2. 궁수" );
			
		int chrSelect = scan.nextInt();
		
		Information chrInfo = new Information();
		
		if(chrSelect == 1) {
			chrInfo.setChrClass = "검사";
		}
//		else if(selectClass == archer) {
		else{
			chrClass = "궁수" ;
		
		System.out.println("캐릭터 명 : "+newChr);
		System.out.println("클래스 : "+chrClass);
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		
	
		}
	}
}
