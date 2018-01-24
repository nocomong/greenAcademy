package Abc;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {

		Student[] student = new Student[5];
		
		for(int i=0 ; i < 5 ; i++) 
		{
			student[i] = new Student();		
			student[i].setAge(i+1);
			student[i].setName("박진수 주니어 : "+i);
			student[i].print();
		}
		
//		Scanner scan = new Scanner(System.in);
//		Student temp = student[0];
//		temp.setName("박진수");
//		student[0].print();

	}

}
