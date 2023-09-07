package class2_assingments;

public class Car {
	float speed;
	int noOfGear;
	
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	
	
	public void drive(float speed, int noOfGear) {
		this.speed =  speed;
		this.noOfGear = noOfGear;
		display();
		
	}
	public void display() {
		System.out.println("Speed of the car : " +speed);
		System.out.println("No of the Gear : " +noOfGear);
	}
	

}
