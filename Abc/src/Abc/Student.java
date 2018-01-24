package Abc;

public class Student {
	
	//필드선언
	
	
	private String name;
	private int age;
	private String sex;
	
	
	//생성자
	public Student() // 입력 값이 없음
	{
		
		this.name = "미정";
		this.age = 0;
		this.sex = "미정";
	}
	

	
	
	public Student(String name,int age,String sex) // 입력 값이 없음
	{
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	
//	//getter
//	public int getUniqId() 
//	{
//		return uniqId;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public int getAge() 
//	{
//		return age;
//	}
//	public boolean getSex() 
//	{
//		return sex;
//	}
//	
//	
//	//setter
//	public void setUniqId(int uniqId)
//	{
//		this.uniqId = uniqId;
//	}
//	public void setName(String name) 
//	{
//		this.name = name;
//	}
//	public void setAge(int age) 
//	{
//		this.age = age;
//	}	
//	public void setSex(boolean sex)
//	{
//		this.sex = sex;
//	}
	
	//메소드
	



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String isSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void print() 
	{
		

		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+sex);
		
	
		}
		
	}
	


