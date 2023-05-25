package basics_java_02;

abstract class Vehicles{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicles(String color, int speed , int numWheels) {
		this.color=color;
		this.speed=speed;
		this.numWheels=numWheels;
	}
	public abstract void move();
}
class Car extends Vehicles{
	public Car(String color, int speed , int numWheels) {
		super(color,speed,numWheels);
	}
	public void move() {
		
	}
	public void turn() {
		System.out.println("Turning left or right.....");
	}
	
}
public class carAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
