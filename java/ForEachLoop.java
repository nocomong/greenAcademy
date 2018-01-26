package Abc;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {

/*배열의 크기를 지정
 * 
 * */		
		
	int total = 0;
	int size;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("배열의 크기를 입력하시오 : ");
	size = scan.nextInt();
	int[] score = new int[size];
	
	for(int i = 0 ; i < score.length ; i++)
	{
		System.out.print("성적을 입력 하시오: ");
		score[i] = scan.nextInt();
	}
	
	for (int i = 0; i < score.length ; i++)
	{
		total = total + score[i];
		
		System.out.println("평균 성적은"+ total / score.length +" 입니다.");
	}
		
	}

}
