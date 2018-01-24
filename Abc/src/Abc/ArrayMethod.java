package Abc;

import java.util.Scanner;

public class ArrayMethod {

	public static void main(String[] args) {
//		int 10개 배열 선언
//		그 배열에 0번째 부터 9번째까지 값을 넣기
//		비교를 위한 입력 int 선언
//		for 문을 돌면서 해당 입력한 int 가 총 몇개가 있는지 알려주는 프로그램
//		10번을 돌면서 입력한 값이 있으면 그때마다 count 증가 시키기

		// 노쌤 코드
		int[] numbers = new int[10];
		numbers[0] = 3;
		numbers[1] = 3;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 3;
		numbers[5] = 3;
		numbers[6] = 5;
		numbers[7] = 5;
		numbers[8] = 5;
		numbers[9] = 5;
		
//		비교할 입력받을 int 선언
		int targetNum;
		int count=0;
		System.out.print("숫자를 입력 하세요 :");
		Scanner scan = new Scanner(System.in);
		targetNum = scan.nextInt();
		
		for(int i=0; i<numbers.length;i++) 
		{
			if(targetNum == numbers[i]) {
				count++; // 입력 한 숫자가 몇개 있는지 카운트
			}
		}
		
		System.out.println(targetNum+"은 총"+count+"개 있습니다.");
		
		
		
	}
}
		

		/* 테스트 실패		
		int[] baseNumber = new int[10];
		
		baseNumber[0] = 0;
		baseNumber[1] = 1;
		baseNumber[2] = 2;
		baseNumber[3] = 3;
		baseNumber[4] = 4;
		baseNumber[5] = 5;
		baseNumber[6] = 6;
		baseNumber[7] = 7;
		baseNumber[8] = 8;
		baseNumber[9] = 9;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");
		int targetNumber = scan.nextInt();
		
		
		for(int i=0 ; i<10 ;i++ )
		{

			int count=0;
			
			boolean isFound = false;
		
			for(int j = 0; j < baseNumber.length ; j++) 
			{
			if(baseNumber[j]==targetNumber) 
			{
				isFound = true;
				break;
			}
			}
			if(isFound) 
			{
			System.out.println(targetNumber+"가 있습니다.정답 횟수:"+(count+1)+"회");
			count++;
			break;
			}
			else 
			{
				System.out.println(targetNumber+"가 없습니다.");
				break;
			}
			
		
		}
		
		
		
	}

}
*/