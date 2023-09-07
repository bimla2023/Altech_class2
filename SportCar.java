package class2_assingments;

public class SportCar extends Car{
	String airBallonType;
	
	public void AirBallonType(String airBallonType) {
		super.drive(speed, noOfGear);
		this.airBallonType = airBallonType;
		System.out.println("airBallonType : " +airBallonType);
		
	}

}
