package Abc;

public class Car {
	
	//필드 선언
	
	String color; // public String color; <= 다른 클래스에서 사용할 수 있게 하는 public 접근제어자
	int speed; // private int speed; <= 다른 클래스에서는 사용할수 없고 포함된 클래스에서만 사용할 수 있는 private 접근제어자
	int gear;
	
	//생성자
	
	public Car()
	{
		color = "미정";
		speed = 0;
		gear = 0;
		
	}
	
	public Car(String col)
	{
		color = col;
		speed = 0;
		gear = 0;
		
	}
	
	public Car(String col, int a)
	{
		color = col;
		speed = a;
		gear = 0;
		
	}
	public Car(String col, int a, int b)
	{
		color = col;
		speed = a;
		gear = b;
		
	}
	
	//메쏘드 선언
	
	void print() 
	{
		System.out.println(color+","+speed+","+gear);
	}
	

}
