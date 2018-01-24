package Abc;

import java.util.Scanner;

public class StudentManager {
	
	public static final int MAX_PEOPLE =20; //학생 최대 수
	private Student[] studentArray; //학생배열
	private int currentNumber; //인원수
	

		
	public StudentManager() {
		
		studentArray = new Student[MAX_PEOPLE];
		currentNumber = 0;
	}
	
	
	public StudentManager(int size) 
	{
		studentArray = new Student[size];
		currentNumber = 0;
	}
	
	
	

	Scanner scan = new Scanner(System.in);	
	
	public void addStudent() {
		
		Student addStudent = new Student();

		
		System.out.println("학생의 정보를 입력 하세요 ");
		System.out.print("학생의 이름 : ");
		addStudent.setName(scan.next());
		
		
		System.out.print("학생의 나이 : ");
		addStudent.setAge(scan.nextInt());
		
		System.out.print("학생의 성별 : ");
		addStudent.setSex(scan.next());
		
		System.out.print("입력이 완료 되었습니다.");
		
		studentArray[currentNumber] = addStudent;
			
		currentNumber++;
		System.out.println("총 "+currentNumber+"명이 입력 되었습니다.");
		
		}
	public void findStudent() {
		
		
		System.out.print("찾을 사람을 입력 하세요 : ");
		String name = scan.next();
		
		for(int i=0 ; i < currentNumber ; i++) {
			if(name.equals(studentArray[i].getName()))
			{
				System.out.print(name+"이(가) 있습니다.");
				return;
			}
		}
		System.out.print("등록되어있지 않습니다.");
		
	}
	
	public void printAll() {
		for(int i =0 ; i < currentNumber ; i++) {
			
			studentArray[i].print();
			}
		}


		
		
		
	}


