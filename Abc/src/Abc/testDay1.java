package Abc;

import java.util.Scanner;

public class testDay1 {

	public static void main(String[] args) {
		// 숫자 10개를 입력 받아서 10개의 총합을 더하는 출력하는 프로그램
		// 배열을 이용
		
		int[] num = new int[10];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<num.length ; i++) {
		System.out.print((i+1)+"번째 숫자를 입력 하세요 :");
		num[i] = scan.nextInt();
		}
		
		for(int j=0 ; j < num.length ; j++) 
		{
		sum +=num[j];	
		}
		
		System.out.print("숫자의 총 합은 :"+sum);

	}

}
