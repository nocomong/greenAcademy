package Abc;

import java.util.Scanner;

public class LetterGame {

	public static void main(String[] args) {

		int answer = 78;
		int guess;
		int tries = 0;
		
		Scanner input = new Scanner(System.in);
		
		do 
		{
		System.out.print("숫자를 입력 하세요 : ");
		guess = input.nextInt();
		tries++;
		
		if(guess > answer)
		{
			System.out.println("입력한 숫자보다 큰 숫자 입니다.");
		}
		if(guess < answer)
		{
			System.out.println("입력한 숫자보다 작은 숫자 입니다.");
		}
		}while(guess != answer);
		
		System.out.println("정답 입니다."+"시도 횟수는 :"+ tries + "회 입니다.");

	}

}
