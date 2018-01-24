package Abc;

public class CarSet {
	
	//필드 선언
	
	String color;
	String type;
	String name;
	
	
	//생성자
	public CarSet() {
		
	}
	
	//getter & setter

	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String name() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public void print() {
		
		System.out.println("컬러 : "+color);
		System.out.println("타입 : "+type);
		System.out.println("이름 : "+name);
	}
}
