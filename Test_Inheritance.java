package class2_assingments;

public class Test_Inheritance {

	public static void main(String[] args) {
		//array of Instrument
		Instrument[] instrumentArray = new Instrument[10];
		
		instrumentArray[0] = new Piano();
		instrumentArray[0].play();
		instrumentArray[1] = new Guitar();
		instrumentArray[1].play();
		instrumentArray[2] = new Flute();
		instrumentArray[2].play();
		
		System.out.println( instrumentArray[0] instanceof Piano);
		System.out.println( instrumentArray[1] instanceof Guitar);
		System.out.println( instrumentArray[2] instanceof Flute);
		

	}

}
