/**
 * 예제용 클래스 입니다
 * @author 박진수
 * 두수의 합을 계산하는 애플리케이션
 */

package Abc;

import java.util.Scanner;

public class FirstClass {

	/* 시작부분 */
	
	public static void main(String[] args) {

	int salary;
	int deposit;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("월급을 입력하시오 : ");
	salary = input.nextInt();
	
	deposit = 10 * 12 * salary;
	System.out.printf("10년 동안의 저축액 : %d\n",deposit);
					
		}

}
