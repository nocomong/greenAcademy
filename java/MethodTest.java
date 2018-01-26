package Abc;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
/*
 * 3개의 수를 입력 받아서 합계와 평균을 출력하는 메쏘드 만들기
 * input 3개(int 3개)
 * return void
 */
	
	Scanner input = new Scanner(System.in);
	System.out.print("첫번째 숫자를 입력하세요 :");	
	int setNumber1 = input.nextInt();
	System.out.print("두번째 숫자를 입력하세요 :");
	int setNumber2 = input.nextInt();
	System.out.print("세번째 숫자를 입력하세요 :");
	int setNumber3 = input.nextInt();
	
	add(setNumber1,setNumber2,setNumber3);
	
	

	}

	static void add(int a, int b, int c) {
		System.out.print("합계 : "+(a+b+c));
		
	}
	
}
