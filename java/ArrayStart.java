package Abc;

import java.util.Scanner;

public class ArrayStart {

	public static void main(String[] args) {
		// 배열 선언
	/**
	 * 5명의 친구 이름을 입력 받으시오.
	 * Scanner를 이용해서 화면으로부터 입력 받을 것
	 * 한줄 씩 친구의 이름을 출력하세요
	 * 배열을 이용할것
	 *  
	 *  */
		String[] name = new String[5];
		Scanner scan = new Scanner(System.in);
		int count =0;
		
		for(int i=0 ; i<name.length ; i++) 
		{
			System.out.print("친구의 이름을 입력 하세요 : ");
			name[i] = scan.nextLine();
		}
		
		for(int i=0 ; i<name.length ; i++) 
		{
			count++;
			if(count < name.length) 
			{
			System.out.print((i+1)+"번 이름은 : "+name[i]+" , ");
			}
			else
			{
				System.out.print((i+1)+"번 이름은 : "+name[i]);
			}
		}
			
		
	}

}
