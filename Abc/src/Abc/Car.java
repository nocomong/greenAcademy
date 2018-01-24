package Abc;

public class Car {

	//필드 값  color, speed, gear
	
	 String color;
	 int speed;
	 int gear;
	
	 public Car() {}

	
	public Car(String color, int speed, int gear) {
		
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	public void speedDown(int decrement) {
		speed += decrement;
	}
	
	
	public void print() {
		System.out.println(" color = "+ color+"// speed = "+ speed+"// gear = "+ gear);
		}
	
}	