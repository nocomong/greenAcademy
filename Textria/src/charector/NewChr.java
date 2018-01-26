package charector;

import java.util.Scanner;

import information.Information;

public class NewChr extends Information{
	
	Scanner scan = new Scanner(System.in);
	
	
	public void newChrPrint() {
		System.out.println("텍스트리아에 오신것을 환영 합니다.");
		System.out.println("캐릭터명 을 입력 하세요 : ");

		String newChr = scan.next();
			
			System.out.println("클래스를 선택 하세요.");
			System.out.println("1. 검사 / 2. 궁수" );
			
		String chrClass = scan.next();
		
		if(chrClass == 1) {
			chrClass = "검사";
		}
//		else if(selectClass == archer) {
		else{
			chrClass = "궁수1" ;
		
		System.out.println("캐릭터 명 : "+newChr);
		System.out.println("클래스 : "+chrClass);
	
	}
}
