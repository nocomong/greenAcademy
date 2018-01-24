package shpae;

public abstract class Circle extends Shape{

	int  radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
	
	public void print() {
		System.out.println("원 입니다.");
	}
	
	public abstract void comunity();
	
}
