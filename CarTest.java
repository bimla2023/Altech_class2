package class2_assingments;

public class CarTest {

	public static void main(String[] args) {
		Car newCar = new SportCar();
		Car car = new Car();
		car.setSpeed(200);
		car.setNoOfGear(4);
		
		SportCar sportcar= new SportCar();
		sportcar.AirBallonType("Good Quality");
		System.out.println("Speed : " +car.getSpeed());
		System.out.println("Gear : " +car.getNoOfGear());
		
	}

}
