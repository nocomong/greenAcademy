package Abc;

import java.util.Scanner;

public class CarManager {
	
	public static int MAX_CAR_NUMBER = 5;
	CarSet[] carArray = new CarSet[MAX_CAR_NUMBER]; 
	int currentNumber = 0;
	
	int goStop = -1;
	
	
	Scanner  scan = new Scanner(System.in);
	
	public void addCarSet() {
		
		while( currentNumber < MAX_CAR_NUMBER ) {
		
		CarSet addCarSet = new CarSet();
		
		System.out.print("컬러를 입력 하세요 : ");
		addCarSet.setColor(scan.next());
		System.out.print("타입을 입력 하세요 : ");
		addCarSet.setType(scan.next());
		System.out.print("이름을 입력 하세요 : ");
		addCarSet.setName(scan.next());
		
		carArray[currentNumber] = addCarSet;
		
		currentNumber ++;
		
		System.out.print("입력이 완료 되었습니다.");
		System.out.println("총 "+currentNumber+"개가 입력 되었습니다.");
		
		
		System.out.print("그만할거라면 -1 , 계속 할거라면 아무키나 입력하세요. ");
		int stopState = scan.nextInt();
		if(goStop!=stopState) {
					continue;
			}else {
				break;
			}
		
		}
	}
	
	public void checkName() {

	}
	
	public void printAll() {
		for(int i = 0 ; i+1 < currentNumber; i++) {
			System.out.print(i+"차의 정보");
			carArray[i].print();
			
		}
	}
	


}
