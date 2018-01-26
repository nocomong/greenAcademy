package Abc;

import java.util.Scanner;

public class ReviewTest {

	public static void main(String[] args) {
/*
 * 2가지 숫자 중 큰 숫자를 리턴하는 메소드
 * return type int
 *  파라미터(input) int 2개
 * 
 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 하세요 : ");
		int num2 = scan.nextInt();
		
		int check = numCheck(num1,num2);
		
		System.out.print("큰 수는 "+check+"입니다.");
		
		
	
	}
	
	static int numCheck(int a, int b)
	{
		if(a>b)
		{
			return a;
		}else return b;
		
	}
	
}
